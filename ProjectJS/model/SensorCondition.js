
function SensorCondition(sensor,value){
    this.sensor = sensor;
    this.value = value;

    this.Loop = function() {
        return `digitalRead(${sensor.pin}) == ${value}`;
    }
}

export default SensorCondition