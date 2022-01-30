import Actuator from "./Actuator";
import AppVisitor from "./utils/AppVisitor";
import SIGNAL from "./SIGNAL.enum";
import Visitable from "./utils/Visitable";

export default class Action implements Visitable{
    private _actuator:Actuator;
    private _signal:SIGNAL

    constructor(actuator:Actuator, signal:SIGNAL){
        this._actuator = actuator;
        this._signal = signal;
    }


    get actuator(){
        return this._actuator;
    }
    get signal(){
        return this._signal;
    }

    accept(visitor: AppVisitor) {
        return visitor.visitAction(this)    
    }
}