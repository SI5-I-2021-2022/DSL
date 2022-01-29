import Action from "../model-ts/Action";
import Actuator from "../model-ts/Actuator";
import AnalogicalCondition from "../model-ts/AnalogicalCondition";
import App from "../model-ts/App";
import AppVisitor from "../model-ts/utils/AppVisitor";
import Brick from "../model-ts/Brick";
import DigitalCondition from "../model-ts/DigitalCondition";
import NamedElement from "../model-ts/NamedElement";
import Sensor from "../model-ts/Sensor";
import SensorCondition from "../model-ts/SensorCondition";
import SensorTransition from "../model-ts/SensorTransition";
import State from "../model-ts/State";
import TemporalTransition from "../model-ts/TemporalTransition";
import Transition, { TransitionType } from "../model-ts/Transition";

export default class GenerateArduinoVisitor implements AppVisitor{
    visitTransition(elt: Transition) {
        throw new Error("Method not implemented.");
    }
    visitBrick(elt: Brick) {
        throw new Error("Method not implemented.");
    }
    private pass: Pass = Pass.FIRST;

    visitAction(elt: Action) {
        throw new Error("Method not implemented.");
    }
    visitActuator(elt: Actuator) {
        throw new Error("Method not implemented.");
    }
    visitAnalogicalCondition(elt: AnalogicalCondition) {
        throw new Error("Method not implemented.");
    }
    visitApp(elt: App) {
        let haveTemporal = false;
        for (let state of elt.states) {
            for (let transition of state.transitions) {
                haveTemporal ||= transition.type === TransitionType.TEMPORAL;
            }
        }

        let stringRes = "";
        stringRes +=
`// Wiring code generated from an ArduinoML model
// Application name: ${elt.name}\n\n`

        if (haveTemporal) {
            stringRes += "long delayGuard = 0;\n";
        }
        stringRes += "long debounce = 200;\n\n";
        stringRes += "enum STATE {";
        stringRes += elt.states.map((state) => { return state.name }).join(",");
        stringRes += "};\n\n";

        stringRes += `State currentState = ${elt.initial?.name};\n\n`;

        stringRes += elt.bricks.map((brick) => { return brick.declaration() }).join("");

        stringRes += "\nvoid setup(){\n"
        stringRes += elt.bricks.map((brick) => { return "\t" + brick.setup() }).join("\n");
        if (haveTemporal) stringRes += "\n\tdelayGuard = millis();  //For temporal state"
        stringRes += "\n}\n"

        stringRes += "\nvoid loop(){\n"
        stringRes += "\tswitch(currentState){\n";
        stringRes += elt.states.map((state) => { return state.loop(haveTemporal) }).join("\n\n");
        stringRes += "\n\t}\n}\n"

        return stringRes;
    }

    visitDigitalCondition(elt: DigitalCondition) {
        throw new Error("Method not implemented.");
    }
    visitSensor(elt: Sensor) {
        throw new Error("Method not implemented.");
    }
    visitSensorCondition(elt: SensorCondition) {
        throw new Error("Method not implemented.");
    }
    visitSensorTransition(elt: SensorTransition) {
        throw new Error("Method not implemented.");
    }
    visitState(elt: State) {
        throw new Error("Method not implemented.");
    }
    visitTemporalTransition(elt: TemporalTransition) {
        throw new Error("Method not implemented.");
    }
    
}

enum Pass{
    FIRST,
    SECOND
}