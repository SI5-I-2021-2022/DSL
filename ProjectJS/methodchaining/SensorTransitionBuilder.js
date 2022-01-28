import SensorTransition from "../model/SensorTransition.js"
import SensorConditionBuilder from "./SensorConditionBuilder.js";

class SensorTransitionBuilder {
    constructor(rootBuilder) {
        this.rootBuilder = rootBuilder;
        this.sensorCondition = [];
        this.nextState = null;
    }

    andWhen(sensor){
        let sensorCond = new SensorConditionBuilder(this,sensor);
        this.sensorCondition.push(sensorCond);
        return sensorCond;
    }

    goToState(state) {
        this.nextState = state;
        return this.rootBuilder;
    }

    createModel(bricks, states) {

        if (this.nextState in states) {
            let sensorCondModels = []
            for(let sensorCondBuilder of this.sensorCondition){
                sensorCondModels.push(sensorCondBuilder.createModel(bricks));
            }
            return new SensorTransition(states[this.nextState], sensorCondModels);
        } else { throw "UNDEFINED NEXT STATE" }
    }
}

export default SensorTransitionBuilder