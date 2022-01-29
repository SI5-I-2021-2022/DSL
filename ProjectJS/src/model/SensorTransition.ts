import AppVisitor from "./utils/AppVisitor";
import SensorCondition from "./SensorCondition";
import State from "./State";
import Transition, { TransitionType } from "./Transition";
import Visitable from "./utils/Visitable";

export default class SensorTransition extends Transition implements Visitable{
    private _sensorConditions: SensorCondition[];

    constructor(nextState:State,sensorConditions:SensorCondition[]){
        super(nextState,TransitionType.SENSOR)
        this._sensorConditions = sensorConditions;

    }

    public get sensorConditions(): SensorCondition[] {
        return this._sensorConditions;
    }
    public set sensorConditions(value: SensorCondition[]) {
        this._sensorConditions = value;
    }

    


    loop(haveTemporal:boolean){
        let stringRes = "";
        stringRes += `\n\t\t\tif(`;
        let firstCond = true;
        for(let sensorCond of this._sensorConditions){
            if(!firstCond){
                stringRes += " && ";
            }
            firstCond = false;
            stringRes += sensorCond.loop();
        }
        stringRes += "){\n";
        for(let sensorCond of this._sensorConditions){
            stringRes += `\t\t\t\t${sensorCond.sensor.name}LastDebounceTime = millis();\n`;
        }
        if(haveTemporal) stringRes += "\t\t\t\tdelayGuard = millis();\n"
        stringRes += `\t\t\t\tcurrentState = ${this.nextState.name};\n\t\t\t}\n`;
        return stringRes;
    }

    accept(visitor: AppVisitor) {
        return visitor.visitSensorTransition(this)    
    }
}