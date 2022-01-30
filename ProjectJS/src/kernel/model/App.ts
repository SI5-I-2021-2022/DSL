import AppVisitor from "./utils/AppVisitor";
import Brick from "./Brick";
import NamedElement from "./NamedElement";
import State from "./State";
import Visitable from "./utils/Visitable";


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

