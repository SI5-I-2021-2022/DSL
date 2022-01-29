import Action from "../model/Action";
import Actuator from "../model/Actuator";
import Sensor from "../model/Sensor";
import SIGNAL from "../model/SIGNAL.enum";
import StateBuilder from "./StateBuilder";



class StateActionBuilder {

    private rootBuilder:StateBuilder;
    public actuator:string;
    private value?:SIGNAL;

    constructor(rootBuilder:StateBuilder, actuator:string) {
        this.rootBuilder = rootBuilder;
        this.actuator = actuator;
        this.value = undefined;
    }

    to(value:SIGNAL):StateBuilder {
        this.value = value;
        return this.rootBuilder;
    }
    createModel(bricks:Map<string,(Sensor|Actuator)>):Action {
        const brick = bricks.get(this.actuator);
        if (brick&&this.value) {
            return new Action(brick,this.value)
        } else { throw "UNDEFINED ACTUATOR" }
    }

}

export default StateActionBuilder