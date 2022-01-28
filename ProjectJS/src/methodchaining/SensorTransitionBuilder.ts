import Actuator from "../model/Actuator.js";
import Sensor from "../model/Sensor.js";
import SensorCondition from "../model/SensorCondition.js";
import SensorTransition from "../model/SensorTransition.js"
import State from "../model/State.js";
import SensorConditionBuilder from "./SensorConditionBuilder.js";
import StateBuilder from "./StateBuilder.js";

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

        if (this.nextState && states.has(this.nextState)) {
            let sensorCondModels:SensorCondition[] = []
            for(let sensorCondBuilder of this.sensorCondition){
                sensorCondModels.push(sensorCondBuilder.createModel(bricks));
            }
            return new SensorTransition(states.get(this.nextState), sensorCondModels);
        } else { throw "UNDEFINED NEXT STATE" }
    }
}

export default SensorTransitionBuilder