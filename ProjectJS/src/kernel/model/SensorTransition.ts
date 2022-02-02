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

    

    accept(visitor: AppVisitor) {
        return visitor.visitSensorTransition(this)    
    }
}