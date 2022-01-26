import Action from "../model/Action.js";



class StateActionBuilder {
    constructor(root, actuator) {
        this.root = root;
        this.actuator = actuator;
        this.data = null;
    }

    to(data) {
        this.data = data;
        return this.root;
    }
    get_content(bricks) {
        if (this.actuator in bricks) {
            return new Action(this.data, bricks[this.actuator])
        } else { throw "UNDEFINED BRICK" }
    }

}

export default StateActionBuilder