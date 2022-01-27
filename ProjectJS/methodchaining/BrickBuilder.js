import Actuator from "../model/Actuator.js";
import Sensor from "../model/Sensor.js";

const ACTUATOR = 0
const SENSOR = 1


class BrickBuilder {
    constructor(rootBuilder, name, kind) {
        this.rootBuilder = rootBuilder;
        this.name = name;
        this.kind = kind;
        this.pin = null;
    }

    onPin(pin) {
        this.pin = pin;
        return this.root;
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