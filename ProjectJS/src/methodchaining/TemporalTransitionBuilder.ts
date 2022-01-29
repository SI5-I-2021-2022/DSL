import Actuator from "../model/Actuator";
import Sensor from "../model/Sensor";
import State from "../model/State";
import TemporalTransition from "../model/TemporalTransition";
import StateBuilder from "./StateBuilder";

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
        const state = states.get(this.nextState||"");
        if (this.nextState && state) {
            return new TemporalTransition(state, this.time);
        } else { throw "UNDEFINED NEXT STATE" }
    }
}

export default TemporalTransitionBuilder