import Action from "../model/Action.js";
import Actuator from "../model/Actuator.js";
import Sensor from "../model/Sensor.js";
import Signal from "./Signal.enum.js";
import StateBuilder from "./StateBuilder.js";



class StateActionBuilder {

    private rootBuilder:StateBuilder;
    public actuator:string;
    private value?:Signal;

    constructor(rootBuilder:StateBuilder, actuator:string) {
        this.rootBuilder = rootBuilder;
        this.actuator = actuator;
        this.value = undefined;
    }

    to(value:Signal):StateBuilder {
        this.value = value;
        return this.rootBuilder;
    }
    createModel(bricks:Map<string,(Sensor|Actuator)>):Action {
        if (this.actuator in bricks) {
            return new Action(bricks.get(this.actuator),this.value)
        } else { throw "UNDEFINED ACTUATOR" }
    }

}

export default StateActionBuilder