import Actuator from "../kernel/model/Actuator";
import AnalogicalCondition from "../kernel/model/AnalogicalCondition";
import DigitalCondition from "../kernel/model/DigitalCondition";
import Sensor from "../kernel/model/Sensor";
import SensorCondition from "../kernel/model/SensorCondition";
import SIGNAL from "../kernel/model/SIGNAL.enum";
import SensorTransitionBuilder from "./SensorTransitionBuilder";

const DIGITAL = 0;
const ANALOGICAL = 1;

class SensorConditionBuilder {

    private rootBuilder:SensorTransitionBuilder;
    private sensor:string;
    private value?:SIGNAL|number;
    private kind:number;
    private greater:boolean;

    constructor(rootBuilder:SensorTransitionBuilder,sensor:string) {
        this.rootBuilder = rootBuilder;
        this.sensor = sensor;
        this.value = undefined;
        this.kind = DIGITAL;//Default
        this.greater = false;
    }

    is(value:SIGNAL):SensorTransitionBuilder{
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
        const brick = bricks.get(this.sensor);
        if(brick){
            const value :any = this.value;
            if(this.kind == ANALOGICAL){
                return new AnalogicalCondition(brick,value,this.greater);
            }
            else{
                return new DigitalCondition(brick,value);
            }
        } else { throw "UNDEFINED SENSOR" }
    }
}

export default SensorConditionBuilder