import Action from "./Action";
import AppVisitor from "./utils/AppVisitor";
import NamedElement from "./NamedElement";
import Sensor from "./Sensor";
import Transition from "./Transition";
import Visitable from "./utils/Visitable";
import SensorTransition from "./SensorTransition";

export default class State extends NamedElement implements Visitable{
    private _actions: Action[];
    private _transitions: Transition[];

    constructor(name:string,transitions:Transition[],actions:Action[]){
        super(name);
        this._transitions = transitions;
        this._actions = actions;
    }


    /**
     * Getter actions
     * @return {Action[]}
     */
	public get actions(): Action[] {
		return this._actions;
	}

    /**
     * Getter transitions
     * @return {Transition[]}
     */
	public get transitions(): Transition[] {
		return this._transitions;
	}

    /**
     * Setter actions
     * @param {Action[]} value
     */
	public set actions(value: Action[]) {
		this._actions = value;
	}

    /**
     * Setter transitions
     * @param {Transition[]} value
     */
	public set transitions(value: Transition[]) {
		this._transitions = value;
	}
    
    accept(visitor: AppVisitor) {
        return visitor.visitState(this)    
    }

}