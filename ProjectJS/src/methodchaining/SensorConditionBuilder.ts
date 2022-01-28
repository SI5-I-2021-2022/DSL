import Actuator from "../model/Actuator.js";
import Sensor from "../model/Sensor.js";
import SensorCondition from "../model/SensorCondition.js";
import SensorTransitionBuilder from "./SensorTransitionBuilder.js";
import Signal from "./Signal.enum.js";

class SensorConditionBuilder {

    private rootBuilder:SensorTransitionBuilder;
    private sensor:string;
    private value?:Signal;

    constructor(rootBuilder:SensorTransitionBuilder,sensor:string) {
        this.rootBuilder = rootBuilder;
        this.sensor = sensor;
        this.value = undefined;
    }

    is(value:Signal):SensorTransitionBuilder{
        this.value = value;
        return this.rootBuilder;
    }

    createModel(bricks:Map<string,(Sensor|Actuator)>):SensorCondition {
        if(bricks.has(this.sensor)){
            return new SensorCondition(bricks.get(this.sensor),this.value);
        } else { throw "UNDEFINED SENSOR" }
    }
}

export default SensorConditionBuilder