import SensorCondition from "./SensorCondition.js";

function AnalogicalCondition(sensor,value,greater){
    SensorCondition.call(this,sensor,value);

    this.greater = greater;//True greater, false lower

    this.Loop = function() {
        return `digitalRead(${sensor.pin}) ${greater? ">" : "<"} ${value} && ${sensor.name}BounceGuard`;
    }
}

export default AnalogicalCondition