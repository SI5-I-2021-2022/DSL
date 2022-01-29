import AppVisitor from "./utils/AppVisitor";
import State from "./State";
import Visitable from "./utils/Visitable";

export default abstract class Transition implements Visitable{
    protected _nextState:State;
    private _type:TransitionType;
    constructor(next:State, type:TransitionType){
        this._nextState = next;
        this._type = type
    }

    abstract loop(haveTemporal:boolean):any;

    get nextState(){
        return this._nextState
    }


    /**
     * Getter type
     * @return {TransitionType}
     */
	public get type(): TransitionType {
		return this._type;
	}

    /**
     * Setter type
     * @param {TransitionType} value
     */
	public set type(value: TransitionType) {
		this._type = value;
	}

    accept(visitor: AppVisitor) {
        visitor.visitTransition(this)
    }

}

export enum TransitionType{
    TEMPORAL,
    BASIC
}