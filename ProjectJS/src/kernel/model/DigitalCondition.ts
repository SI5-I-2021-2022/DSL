import AppVisitor from "./utils/AppVisitor";
import Sensor from "./Sensor";
import SensorCondition, { ConditionType } from "./SensorCondition";
import SIGNAL from "./SIGNAL.enum";
import Visitable from "./utils/Visitable";

export default class DigitalCondition extends SensorCondition implements Visitable{
    private _value:SIGNAL;

    constructor(sensor:Sensor,value:SIGNAL){
        super(sensor,ConditionType.DIGITAL);
        this._value = value
    }

    get value(){
        return this._value;
    }

    loop() {
        return `digitalRead(${this.sensor.pin}) == ${this.value} && ${this.sensor.name}BounceGuard`;
    }

    accept(visitor: AppVisitor) {
        return visitor.visitDigitalCondition(this)    
    }
}