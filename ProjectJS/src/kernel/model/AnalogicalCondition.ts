import AppVisitor from "./utils/AppVisitor";
import Sensor from "./Sensor";
import SensorCondition, { ConditionType } from "./SensorCondition";
import Visitable from "./utils/Visitable";

export default class AnalogicalCondition extends SensorCondition implements Visitable{
    private _greater:boolean;
    private _value:number;

    constructor(sensor:Sensor,value:number,greater:boolean){
        super(sensor,ConditionType.ANALOGICAL);
        this._greater=greater
        this._value = value;
    }

    get greater(){
        return this._greater;
    }

    get value(){
        return this._value;
    }

    loop() {
        return `analogRead(${this.sensor.pin}) ${this.greater? ">" : "<"} ${this.value} && ${this.sensor.name}BounceGuard`;
    }

    accept(visitor: AppVisitor) {
        return visitor.visitAnalogicalCondition(this)    
    }
}