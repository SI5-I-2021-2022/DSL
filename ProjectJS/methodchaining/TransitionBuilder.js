import Transition from "../model/Transition.js";



class TransitionBuilder {
    constructor(root, sensor) {
        this.root = root;
        this.sensor = sensor;
        this.value = null;
        this.next_state = null;
    }

    has_value(value) {
        this.value = value;
        return this;
    }
    go_to_state(next_state) {
        this.next_state = next_state;
        return this.root.root
    }
    get_content(bricks, states) {
        if (this.sensor in bricks) {
            if (this.next_state in states) {
                return new Transition(states[this.next_state], this.value, this.bricks[this.sensor])
            } else { throw "UNDEFINED STATE" }
        } else { throw "UNDEFINED BRICK" }
    }

}

export default TransitionBuilder