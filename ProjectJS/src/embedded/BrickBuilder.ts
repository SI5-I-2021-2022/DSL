import Actuator from "../kernel/model/Actuator";
import Sensor from "../kernel/model/Sensor";
import AppBuilder from "./AppBuilder";

const ACTUATOR = 0
const SENSOR = 1

class BrickBuilder {
    
    private rootBuilder:AppBuilder;
    public name:string;
    private kind:number;
    private pin?:number

    constructor(rootBuilder:AppBuilder, name:string, kind:number) {
        this.rootBuilder = rootBuilder;
        this.name = name;
        this.kind = kind;
        this.pin = undefined;
    }

    onPin(pin:number):AppBuilder {
        this.pin = pin;
        return this.rootBuilder;
    }

    createModel():(Actuator|Sensor) {
        if(!this.pin){
            throw "PIN NOT DEFINE"
        }
        if (this.kind == ACTUATOR) {
            return new Actuator(this.name, this.pin);
        }
        else {
            return new Sensor(this.name, this.pin);
        }
    }

}

export default BrickBuilder