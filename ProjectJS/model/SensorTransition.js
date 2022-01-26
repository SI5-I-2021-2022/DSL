import Transition from "./Transition";

function SensorTransition(next,sensorConditions){
    Transition.call(this,next);
    this.sensorConditions = sensorConditions;

    // TODO LOOP
}

export default SensorTransition;