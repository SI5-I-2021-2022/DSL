import SensorCondition from "./SensorCondition.js";

function DigitalCondition(sensor,value){
    SensorCondition.call(this,sensor,value)

    this.Loop = function() {
        return `digitalRead(${sensor.pin}) == ${value} && ${sensor.name}BounceGuard`;
    }
}

export default DigitalCondition