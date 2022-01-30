import AppVisitor from "./utils/AppVisitor";
import Sensor from "./Sensor";
import SIGNAL from "./SIGNAL.enum";
import Visitable from "./utils/Visitable";

export default abstract class SensorCondition implements Visitable{
    private _sensor: Sensor;
    private _type:ConditionType;

    constructor(sensor:Sensor, type:ConditionType){
        this._sensor = sensor;
        this._type = type;
    }

    get sensor(){
        return this._sensor;
    }

    get type(){
        return this._type;
    }

    abstract loop():any;

    accept(visitor: AppVisitor) {
        return visitor.visitSensorCondition(this)    
    }
}

export enum ConditionType{
    DIGITAL,
    ANALOGICAL
}