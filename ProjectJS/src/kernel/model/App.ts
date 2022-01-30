import AppVisitor from "./utils/AppVisitor";
import Brick from "./Brick";
import NamedElement from "./NamedElement";
import State from "./State";
import { TransitionType } from "./Transition";
import Visitable from "./utils/Visitable";
import * as fs from 'fs';
import Verifier from "../Verifier";

export default class App extends NamedElement implements Visitable{
    private _bricks: Brick[] = [];
    private _states: State[] = [];
    private _initial: State;

    constructor(name:string,bricks:Brick[],states:State[],initialState:State){
        super(name);
        this._bricks=bricks;
        this._states=states;
        this._initial=initialState;
    }

    create(path:string) {

        //VERIFY PART
        let verifier = new Verifier();
        if(!verifier.verify(this)) return;

        //GENERATION PART
        let haveTemporal = false;
        for (let state of this.states) {
            for (let transition of state.transitions) {
                haveTemporal ||= transition.type === TransitionType.TEMPORAL;
            }
        }

        let stringRes = "";
        stringRes +=
`// Wiring code generated from an ArduinoML model
// Application name: ${this.name}\n\n`

        if (haveTemporal) {
            stringRes += "long delayGuard = 0;\n";
        }
        stringRes += "long debounce = 200;\n\n";
        stringRes += "enum STATE {";
        stringRes += this.states.map((state) => { return state.name }).join(",");
        stringRes += "};\n\n";

        stringRes += `STATE currentState = ${this.initial?.name};\n\n`;

        stringRes += this.bricks.map((brick) => { return brick.declaration() }).join("");

        stringRes += "\nvoid setup(){\n"
        stringRes += this.bricks.map((brick) => { return "\t" + brick.setup() }).join("\n");
        if (haveTemporal) stringRes += "\n\tdelayGuard = millis();  //For temporal state"
        stringRes += "\n}\n"

        stringRes += "\nvoid loop(){\n"
        stringRes += "\tswitch(currentState){\n";
        stringRes += this.states.map((state) => { return state.loop(haveTemporal) }).join("\n\n");
        stringRes += "\n\t}\n}\n"

        //INO PART
        this.createFile(path,stringRes);
    };

    public createFile(path:string, data:string) {
        fs.writeFile(path+'generated.ino', data,  function(err) {
            if (err) {
                return console.error(err);
            }
            console.log("Arduino file generated!");
        });
    }


    /**
     * Getter bricks
     * @return {Brick[] }
     */
	public get bricks(): Brick[]  {
		return this._bricks;
	}

    /**
     * Getter states
     * @return {State[] }
     */
	public get states(): State[]  {
		return this._states;
	}

    /**
     * Setter bricks
     * @param {Brick[] } value
     */
	public set bricks(value: Brick[] ) {
		this._bricks = value;
	}

    /**
     * Setter states
     * @param {State[] } value
     */
	public set states(value: State[] ) {
		this._states = value;
	}

    public get initial(): State  {
        return this._initial;
    }
    public set initial(value: State ) {
        this._initial = value;
    }

    accept(visitor: AppVisitor) {
        return visitor.visitApp(this)    
    }


}

