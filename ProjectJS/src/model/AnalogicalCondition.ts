import AppVisitor from "./utils/AppVisitor";
import Sensor from "./Sensor";
import SensorCondition from "./SensorCondition";
import SIGNAL from "./SIGNAL.enum";
import Visitable from "./utils/Visitable";

export default class AnalogicalCondition extends SensorCondition implements Visitable{
    private _greater:boolean;
    constructor(sensor:Sensor,signal:SIGNAL,greater:boolean){
        super(sensor,signal);
        this._greater=greater
    }
    get greater(){
        return this._greater;
    }


    loop() {
        return `digitalRead(${this.sensor.pin}) ${this.greater? ">" : "<"} ${this.signal} && ${this.sensor.name}BounceGuard`;
    }

    accept(visitor: AppVisitor) {
        return visitor.visitAnalogicalCondition(this)    
    }
}