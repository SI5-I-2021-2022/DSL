import AppVisitor from "./utils/AppVisitor";
import Sensor from "./Sensor";
import SIGNAL from "./SIGNAL.enum";
import Visitable from "./utils/Visitable";

export default class SensorCondition implements Visitable{
    private _sensor: Sensor;
    private _signal: SIGNAL

    constructor(sensor:Sensor,signal:SIGNAL){
        this._sensor = sensor;
        this._signal = signal;
    }

    get sensor(){
        return this._sensor;
    }

    get signal(){
        return this._signal;
    }

    accept(visitor: AppVisitor) {
        return visitor.visitSensorCondition(this)    
    }
}