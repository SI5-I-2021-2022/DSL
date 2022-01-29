import AppVisitor from "./utils/AppVisitor";
import Sensor from "./Sensor";
import SensorCondition from "./SensorCondition";
import SIGNAL from "./SIGNAL.enum";
import Visitable from "./utils/Visitable";

export default class DigitalCondition extends SensorCondition implements Visitable{
    constructor(sensor:Sensor,signal:SIGNAL){
        super(sensor,signal);
    }

    loop() {
        return `analogRead(${this.sensor.pin}) == ${this.signal} && ${this.sensor.name}BounceGuard`;
    }

    accept(visitor: AppVisitor) {
        return visitor.visitDigitalCondition(this)    
    }
}