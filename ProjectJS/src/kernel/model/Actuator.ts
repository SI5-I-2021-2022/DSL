import AppVisitor from "./utils/AppVisitor";
import Brick from "./Brick";
import Visitable from "./utils/Visitable";

export default class Actuator extends Brick implements Visitable{

    constructor(name:string,pin:string){
        super(name,pin);
    }

    accept(visitor: AppVisitor) {
        return visitor.visitActuator(this)    
    }
}