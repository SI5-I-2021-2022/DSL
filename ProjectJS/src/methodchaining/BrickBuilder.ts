import Actuator from "../model/Actuator.js";
import Sensor from "../model/Sensor.js";

const ACTUATOR = 0
const SENSOR = 1


class BrickBuilder {
    
    private rootBuilder:any;
    private name:string;
    private kind:number;
    private pin?:number

    constructor(rootBuilder:any, name:string, kind:number) {
        this.rootBuilder = rootBuilder;
        this.name = name;
        this.kind = kind;
        this.pin = undefined;
    }

    onPin(pin:number) {
        this.pin = pin;
        return this.rootBuilder;
    }

    createModel() {
        if (this.kind == ACTUATOR) {
            return new Actuator(this.name, this.pin);
        }
        if (this.kind == SENSOR) {
            return new Sensor(this.name, this.pin);
        }
        return null
    }

}

export default BrickBuilder