import State from "../model/State";
import ActionBuilder from "./ActionBuilder";
import SensorTransitionBuilder from "./SensorTransitionBuilder";
import SensorConditionBuilder from "./SensorConditionBuilder";
import TemporalTransitionBuilder from "./TemporalTransitionBuilder";
import AppBuilder from "./AppBuilder";
import Actuator from "../model/Actuator";
import Sensor from "../model/Sensor";
import Action from "../model/Action";
import SensorTransition from "../model/SensorTransition";
import TemporalTransition from "../model/TemporalTransition";


class StateBuilder {

    private rootBuilder:AppBuilder;
    public name:string;
    private actions:ActionBuilder[];
    private transitions:(SensorTransitionBuilder|TemporalTransitionBuilder)[]

    constructor(rootBuilder:AppBuilder, name:string) {
        this.rootBuilder = rootBuilder;
        this.name = name;
        this.actions = [];
        this.transitions = [];
    }

    endState():AppBuilder{
        return this.rootBuilder;
    }

    set(actuator:string):ActionBuilder {
        let action = new ActionBuilder(this, actuator)
        this.actions.push(action)
        return action;
    }

    when(sensor:string):SensorConditionBuilder {
        let sensorTransition = new SensorTransitionBuilder(this)
        let sensorCond = new SensorConditionBuilder(sensorTransition,sensor)
        sensorTransition.sensorCondition.push(sensorCond);

        this.transitions.push(sensorTransition)
        return sensorCond;
    }

    after(millisecond:number):TemporalTransitionBuilder{
        let temporalTransition = new TemporalTransitionBuilder(this,millisecond)
        this.transitions.push(temporalTransition);
        return temporalTransition;
    }

    createStateModel(bricks:Map<string,(Sensor|Actuator)>):State {
        let actionModels:Action[] = []
        for(let action of this.actions){
            if(bricks.has(action.actuator)){
                actionModels.push(action.createModel(bricks));
            } else { throw "UNDEFINED BRICK" }
        }
        return new State(this.name,[],actionModels);
    }

    createTransitionModel(bricks:Map<string,(Sensor|Actuator)>, states:Map<string,State>):(SensorTransition|TemporalTransition)[] {
        let transitionModels:(SensorTransition|TemporalTransition)[] = []
        for(let transition of this.transitions){
            transitionModels.push(transition.createModel(bricks,states))
        }
        return transitionModels;
    }
}

export default StateBuilder