import AppVisitor from "./utils/AppVisitor";
import Brick from "./Brick";
import Visitable from "./utils/Visitable";

export default class Actuator extends Brick implements Visitable{

    constructor(name:string,pin:number){
        super(name,pin);
    }

    declaration(){
        return "";
    }

    setup(){
        return `pinMode(${this.pin}, OUTPUT);  // ${this.name} [Actuator]`
    }

    accept(visitor: AppVisitor) {
        return visitor.visitActuator(this)    
    }
}