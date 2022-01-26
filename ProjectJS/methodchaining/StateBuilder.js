import Transition from "../model/Transition.js";
import State from "../model/State.js";
import StateActionBuilder from "./StateActionBuilder.js";
import TransitionBuilder from "./TransitionBuilder.js";



class StateBuilder {
    constructor(root, state) {
        this.root = root;
        this.state = state;
        this.actions = [];
        this.transition = null;
    }

    set(actuator) {
        let action = new StateActionBuilder(this, actuator)
        this.actions = [action]
        return action;
    }
    when(sensor) {
        let transition = new TransitionBuilder(this, sensor)
        this.transition = transition
        return transition;
    }

    get_content(bricks, states) {
        if (this.transition.sensors in bricks) {
            if (this.transition.state in states) {
                let builder = []
                for (let i = 0; i < length(this.actions); i = i + 1) {
                    builder.push(this.actions[i].get_content(bricks))
                }
                return new State(this.state, null, builder)
            } else { throw "UNDEFINED STATE" }
        } else { throw "UNDEFINED BRICK" }
    }
    get_content2(bricks, states) {
        if (this.transition.sensors in bricks) {
            if (this.transition.state in states) {
                if (this.transition.next_state in states) {
                    let trans = new Transition(states[this.transition.next_state], this.transition.value, bricks[this.transition.sensor])
                    states[this.state].transition = trans
                } else { throw "UNDEFINED NEXT STATE" }
            } else { throw "UNDEFINED STATE" }
        } else { throw "UNDEFINED BRICK" }
    }
}

export default StateBuilder