import AppVisitor from "./utils/AppVisitor";
import State from "./State";
import Transition, { TransitionType } from "./Transition";
import Visitable from "./utils/Visitable";

export default class TemporalTransition extends Transition implements Visitable{
    private _time:number;
    constructor(nextState:State,time:number){
        super(nextState,TransitionType.TEMPORAL);
        this._time=time;
    }


    loop(haveTemporal:boolean){
        let stringRes = "";

        stringRes += `\n\t\t\tif(millis() - delayGuard > ${this._time}){\n`
        stringRes += `\t\t\t\tcurrentState = ${this.nextState.name};\n`;
        stringRes += "\t\t\t\tdelayGuard = millis();\n"
        stringRes += "\t\t\t}\n"
        return stringRes;
    }

    accept(visitor: AppVisitor) {
        return visitor.visitTemporalTransition(this)    
    }
}