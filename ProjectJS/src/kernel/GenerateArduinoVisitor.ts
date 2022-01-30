
import Action from "./model/Action";
import Actuator from "./model/Actuator";
import AnalogicalCondition from "./model/AnalogicalCondition";
import App from "./model/App";
import Brick from "./model/Brick";
import DigitalCondition from "./model/DigitalCondition";
import Sensor from "./model/Sensor";
import SensorCondition from "./model/SensorCondition";
import SensorTransition from "./model/SensorTransition";
import State from "./model/State";
import TemporalTransition from "./model/TemporalTransition";
import Transition, { TransitionType } from "./model/Transition";
import AppVisitor from "./model/utils/AppVisitor";
import Verifier from "./Verifier";


export default class GenerateArduinoVisitor implements AppVisitor{
    private pass: Pass = Pass.DECLARATION;

    private haveTemporal = false;


    visitTransition(elt: Transition) {
        switch (this.pass){
            case Pass.DECLARATION:
                break;
            case Pass.SETUP:
                break;
            case Pass.LOOP:
                break;
        }
    }
    
    visitBrick(elt: Brick) {
        elt.accept(this);
    }

    visitAction(elt: Action) {
        switch (this.pass){
            case Pass.LOOP:
                return `digitalWrite(${elt.actuator.pin},${elt.signal});\n`
        }
    }
    visitActuator(elt: Actuator) {
        switch (this.pass){
            case Pass.DECLARATION:
                break;
            case Pass.SETUP:
                return `pinMode(${elt.pin}, OUTPUT);  // ${elt.name} [Actuator]`
            case Pass.LOOP:
                break;
        }
    }
    visitAnalogicalCondition(elt: AnalogicalCondition) {
        switch (this.pass){
            case Pass.DECLARATION:
                break;
            case Pass.SETUP:
                break;
            case Pass.LOOP:
                return `analogRead(${elt.sensor.pin}) ${elt.greater? ">" : "<"} ${elt.value} && ${elt.sensor.name}BounceGuard`;
                break;
        }
    }
    visitApp(elt: App) {
        this.pass = Pass.DECLARATION;
        //VERIFY PART
        let verifier = new Verifier();
        if(!verifier.verify(elt)) return;

        //GENERATION PART
        for (let state of elt.states) {
            for (let transition of state.transitions) {
                this.haveTemporal ||= transition.type === TransitionType.TEMPORAL;
            }
        }

        let stringRes = "";
        stringRes +=
        `// Wiring code generated from an ArduinoML model\n`+
        `// Application name: ${elt.name}\n\n`

        if (this.haveTemporal) {
            stringRes += "long delayGuard = 0;\n";
        }
        stringRes += "long debounce = 200;\n\n";
        stringRes += "enum STATE {";
        stringRes += elt.states.map((state:State) => { return state.name }).join(",");
        stringRes += "};\n\n";

        stringRes += `STATE currentState = ${elt.initial?.name};\n\n`;

        stringRes += elt.bricks.map((brick:Brick) => { return brick.accept(this) }).join("");

        this.pass=Pass.SETUP;
        stringRes += "\nvoid setup(){\n"
        stringRes += elt.bricks.map((brick:Brick) => { return "\t" + brick.accept(this) }).join("\n");
        if (this.haveTemporal) stringRes += "\n\tdelayGuard = millis();  //For temporal state"
        stringRes += "\n}\n"

        this.pass=Pass.LOOP;
        stringRes += "\nvoid loop(){\n"
        stringRes += "\tswitch(currentState){\n";
        stringRes += elt.states.map((state:State) => { return state.accept(this) }).join("\n\n");
        stringRes += "\n\t}\n}\n"

        //INO PART
        // elt.createFile(path,stringRes);
        return stringRes
    };

    visitDigitalCondition(elt: DigitalCondition) {
        switch (this.pass){
            case Pass.DECLARATION:
                break;
            case Pass.SETUP:
                break;
            case Pass.LOOP:
                return `digitalRead(${elt.sensor.pin}) == ${elt.value} && ${elt.sensor.name}BounceGuard`;
                
        }
    }
    visitSensor(elt: Sensor) {
        let stringRes = "";
        switch (this.pass){
            case Pass.DECLARATION:
                stringRes += 
                `boolean ${elt.name}BounceGuard = false;\n`+
                `long ${elt.name}LastDebounceTime = 0;\n`;
                break;
            case Pass.SETUP:
                stringRes += `pinMode(${elt.pin}, INPUT);  // ${elt.name} [Sensor]`
                break;
            case Pass.LOOP:
                break;
        }
        return stringRes;
    }
    visitSensorCondition(elt: SensorCondition) {
        switch (this.pass){
            case Pass.DECLARATION:
                break;
            case Pass.SETUP:
                break;
            case Pass.LOOP:
                break;
        }
    }
    visitSensorTransition(elt: SensorTransition) {
        let stringRes = "";
        switch (this.pass){
            case Pass.LOOP:
                stringRes += `\n\t\t\tif(`;
                let firstCond = true;
                for(let sensorCond of elt.sensorConditions){
                    if(!firstCond){
                        stringRes += " && ";
                    }
                    firstCond = false;
                    stringRes += sensorCond.accept(this);
                }
                stringRes += "){\n";
                for(let sensorCond of elt.sensorConditions){
                    stringRes += `\t\t\t\t${sensorCond.sensor.name}LastDebounceTime = millis();\n`;
                }
                if(this.haveTemporal) stringRes += "\t\t\t\tdelayGuard = millis();\n"
                stringRes += `\t\t\t\tcurrentState = ${elt.nextState.name};\n\t\t\t}\n`;
                return stringRes;
        }  
    }
    visitState(elt: State) {
        let stringRes = "";

        switch (this.pass){
            case Pass.LOOP:
                let sensorsInState:string[] = [];
                for(let transition of elt.transitions){
                    if(transition instanceof SensorTransition){
                        const sensorTransition:SensorTransition = transition
                        for(let sensorCond of sensorTransition.sensorConditions){
                            if(!sensorsInState.includes(sensorCond.sensor.name)){
                                sensorsInState.push(sensorCond.sensor.name);
                            }
                        }
                    }
                }

                stringRes += `\t\tcase ${elt.name} :\n`;
                stringRes += elt.actions.map((action:Action) => {return "\t\t\t"+action.accept(this)}).join("");

                for(let sensorName of sensorsInState){
                    stringRes += `\t\t\t${sensorName}BounceGuard = millis() - ${sensorName}LastDebounceTime > debounce;\n`;
                }

                stringRes += elt.transitions.map((transition:Transition) => {return transition.accept(this)}).join("");
                stringRes += "\t\tbreak;"
                break;
        }
        return stringRes;

    }
    visitTemporalTransition(elt: TemporalTransition) {
        switch (this.pass){
            case Pass.LOOP:
                let stringRes = "";

                stringRes += `\n\t\t\tif(millis() - delayGuard > ${elt.time}){\n`
                stringRes += `\t\t\t\tcurrentState = ${elt.nextState.name};\n`;
                stringRes += "\t\t\t\tdelayGuard = millis();\n"
                stringRes += "\t\t\t}\n"
                return stringRes;        }    
    }
    
}

enum Pass{
    DECLARATION,
    SETUP,
    LOOP
}