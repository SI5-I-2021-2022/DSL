import TemporalTransition from "../model/TemporalTransition.js";

class TemporalTransitionBuilder {
    constructor(rootBuilder,time) {
        this.rootBuilder = rootBuilder;
        this.time = time;
        this.nextState = null;
    }

    goToState(nextState) {
        this.nextState = nextState;
        return this.rootBuilder;
    }

    createModel(bricks,states) {
        if (this.nextState in states) {
            return new TemporalTransition(states[this.nextState], this.time);
        } else { throw "UNDEFINED NEXT STATE" }
    }
}

export default TemporalTransitionBuilder