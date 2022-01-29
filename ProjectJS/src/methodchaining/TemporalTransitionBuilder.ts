import Actuator from "../model/Actuator.js";
import Sensor from "../model/Sensor.js";
import State from "../model/State.js";
import TemporalTransition from "../model/TemporalTransition.js";
import StateBuilder from "./StateBuilder.js";

class TemporalTransitionBuilder {

    private rootBuilder:StateBuilder;
    private time:number;
    private nextState?:string;

    constructor(rootBuilder:StateBuilder,time:number) {
        this.rootBuilder = rootBuilder;
        this.time = time;
        this.nextState = undefined;
    }

    goToState(nextState:string):StateBuilder {
        this.nextState = nextState;
        return this.rootBuilder;
    }

    createModel(bricks:Map<string,(Sensor|Actuator)>,states:Map<string,State>):TemporalTransition {
        if (this.nextState && states.has(this.nextState)) {
            return new TemporalTransition(states.get(this.nextState), this.time);
        } else { throw "UNDEFINED NEXT STATE" }
    }
}

export default TemporalTransitionBuilder