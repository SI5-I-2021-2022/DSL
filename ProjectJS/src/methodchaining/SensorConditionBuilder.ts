import Actuator from "../model/Actuator.js";
import AnalogicalCondition from "../model/AnalogicalCondition.js";
import DigitalCondition from "../model/DigitalCondition.js";
import Sensor from "../model/Sensor.js";
import SensorCondition from "../model/SensorCondition.js";
import SensorTransitionBuilder from "./SensorTransitionBuilder.js";
import Signal from "./Signal.enum.js";

const DIGITAL = 0;
const ANALOGICAL = 1;

class SensorConditionBuilder {

    private rootBuilder:SensorTransitionBuilder;
    private sensor:string;
    private value?:Signal|number;
    private kind:number;
    private greater:boolean;

    constructor(rootBuilder:SensorTransitionBuilder,sensor:string) {
        this.rootBuilder = rootBuilder;
        this.sensor = sensor;
        this.value = undefined;
        this.kind = DIGITAL;//Default
        this.greater = false;
    }

    is(value:Signal):SensorTransitionBuilder{
        this.value = value;
        return this.rootBuilder;
    }

    isGreaterThan(value:number):SensorTransitionBuilder{
        this.kind = ANALOGICAL;
        this.value = value;
        this.greater = true;
        return this.rootBuilder;
    }

    isLowerThan(value:number):SensorTransitionBuilder{
        this.kind = ANALOGICAL;
        this.value = value;
        this.greater = false;
        return this.rootBuilder;
    }

    createModel(bricks:Map<string,(Sensor|Actuator)>):AnalogicalCondition|DigitalCondition {
        if(bricks.has(this.sensor)){
            if(this.kind == ANALOGICAL){
                return new AnalogicalCondition(bricks.get(this.sensor),this.value,this.greater);
            }
            else{
                return new DigitalCondition(bricks.get(this.sensor),this.value);
            }
        } else { throw "UNDEFINED SENSOR" }
    }
}

export default SensorConditionBuilder