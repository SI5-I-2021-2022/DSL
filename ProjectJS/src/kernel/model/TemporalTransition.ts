import AppVisitor from "./utils/AppVisitor";
import State from "./State";
import Transition, { TransitionType } from "./Transition";
import Visitable from "./utils/Visitable";

export default class TemporalTransition extends Transition implements Visitable{
    private _time: number;

    constructor(nextState:State,time:number){
        super(nextState,TransitionType.TEMPORAL);
        this._time=time;
    }
    public get time(): number {
        return this._time;
    }
    public set time(value: number) {
        this._time = value;
    }

    accept(visitor: AppVisitor) {
        return visitor.visitTemporalTransition(this)    
    }
}