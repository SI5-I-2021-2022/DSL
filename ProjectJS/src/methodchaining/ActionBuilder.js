import Action from "../model/Action.js";



class StateActionBuilder {
    constructor(rootBuilder, actuator) {
        this.rootBuilder = rootBuilder;
        this.actuator = actuator;
        this.value = null;
    }

    to(value) {
        this.value = value;
        return this.rootBuilder;
    }
    createModel(bricks) {
        if (this.actuator in bricks) {
            return new Action(bricks[this.actuator],this.value)
        } else { throw "UNDEFINED ACTUATOR" }
    }

}

export default StateActionBuilder