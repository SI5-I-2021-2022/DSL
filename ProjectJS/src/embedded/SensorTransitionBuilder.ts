import Actuator from "../kernel/model/Actuator";
import AnalogicalCondition from "../kernel/model/AnalogicalCondition";
import DigitalCondition from "../kernel/model/DigitalCondition";
import Sensor from "../kernel/model/Sensor";
import SensorCondition from "../kernel/model/SensorCondition";
import SensorTransition from "../kernel/model/SensorTransition"
import State from "../kernel/model/State";
import SensorConditionBuilder from "./SensorConditionBuilder";
import StateBuilder from "./StateBuilder";

class SensorTransitionBuilder {

    private rootBuilder:StateBuilder;
    public sensorCondition:SensorConditionBuilder[];
    private nextState?:string;

    constructor(rootBuilder:StateBuilder) {
        this.rootBuilder = rootBuilder;
        this.sensorCondition = [];
        this.nextState = undefined;
    }

    andWhen(sensor:string):SensorConditionBuilder{
        let sensorCond = new SensorConditionBuilder(this,sensor);
        this.sensorCondition.push(sensorCond);
        return sensorCond;
    }

    goToState(state:string):StateBuilder {
        this.nextState = state;
        return this.rootBuilder;
    }

    createModel(bricks:Map<string,(Sensor|Actuator)>, states:Map<string,State>):SensorTransition {
        const state = states.get(this.nextState||"");
        if (this.nextState && state) {
            let sensorCondModels:(DigitalCondition|AnalogicalCondition)[] = []
            for(let sensorCondBuilder of this.sensorCondition){
                sensorCondModels.push(sensorCondBuilder.createModel(bricks));
            }
            
            return new SensorTransition(state, sensorCondModels);
        } else { throw "UNDEFINED NEXT STATE" }
    }
}

export default SensorTransitionBuilder