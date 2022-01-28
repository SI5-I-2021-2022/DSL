import State from "../model/State.js";
import ActionBuilder from "./ActionBuilder.js";
import SensorTransitionBuilder from "./SensorTransitionBuilder.js";
import SensorConditionBuilder from "./SensorConditionBuilder.js";
import TemporalTransitionBuilder from "./TemporalTransitionBuilder.js";


class StateBuilder {
    constructor(rootBuilder, name) {
        this.rootBuilder = rootBuilder;
        this.name = name;
        this.actions = [];
        this.transitions = [];
    }

    endState(){
        return this.rootBuilder;
    }

    set(actuator) {
        let action = new ActionBuilder(this, actuator)
        this.actions.push(action)
        return action;
    }

    when(sensor) {
        let sensorTransition = new SensorTransitionBuilder(this)
        let sensorCond = new SensorConditionBuilder(sensorTransition,sensor)
        sensorTransition.sensorCondition.push(sensorCond);

        this.transitions.push(sensorTransition)
        return sensorCond;
    }

    after(millisecond){
        let temporalTransition = new TemporalTransitionBuilder(this,millisecond)
        this.transitions.push(temporalTransition);
        return temporalTransition;
    }

    createStateModel(bricks) {
        let actionModels = []
        for(let action of this.actions){
            if(action.actuator in bricks){
                actionModels.push(action.createModel(bricks));
            } else { throw "UNDEFINED BRICK" }
        }
        return new State(this.name,null,actionModels);
    }

    createTransitionModel(bricks, states) {
        let transitionModels = []
        for(let transition of this.transitions){
            transitionModels.push(transition.createModel(bricks,states))
        }
        return transitionModels;
    }
}

export default StateBuilder