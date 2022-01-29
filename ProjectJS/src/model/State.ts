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



    loop(haveTemporal:boolean){
        let stringRes = "";

        let sensorsInState:string[] = [];
        for(let transition of this.transitions){
            if(transition instanceof SensorTransition){
                const sensorTransition:SensorTransition = transition
                for(let sensorCond of sensorTransition.sensorConditions){
                    if(!sensorsInState.includes(sensorCond.sensor.name)){
                        sensorsInState.push(sensorCond.sensor.name);
                    }
                }
            }
        }

        stringRes += `\t\tcase ${this.name} :\n`;
        stringRes += this.actions.map((action) => {return "\t\t\t"+action.loop()}).join("");

        for(let sensorName of sensorsInState){
            stringRes += `\t\t\t${sensorName}BounceGuard = millis() - ${sensorName}LastDebounceTime > debounce;\n`;
        }

        stringRes += this.transitions.map((transition) => {return transition.loop(haveTemporal)}).join("");
        stringRes += "\t\tbreak;"
        return stringRes;
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