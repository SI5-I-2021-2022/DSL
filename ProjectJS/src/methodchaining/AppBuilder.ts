import BrickBuilder from "./BrickBuilder";
import StateBuilder from "./StateBuilder";
import App from "../model/App"
import Sensor from "../model/Sensor";
import Actuator from "../model/Actuator";
import State from "../model/State";
import SensorTransition from "../model/SensorTransition";
import TemporalTransition from "../model/TemporalTransition";

const ACTUATOR = 0
const SENSOR = 1

class AppBuilder {

    private name:string;
    private brickBuilders:BrickBuilder[];
    private stateBuilders:StateBuilder[];
    private initial?:string;

    constructor(name:string) {
        this.name = name;
        this.brickBuilders = [];
        this.stateBuilders = [];
        this.initial = undefined;
    }

    addActuator(actuator:string):BrickBuilder {
        let brickBuilder = new BrickBuilder(this, actuator, ACTUATOR)
        this.brickBuilders.push(brickBuilder)
        return brickBuilder
    }
    
    addSensor(sensor:string):BrickBuilder {
        let brickBuilder = new BrickBuilder(this, sensor, SENSOR)
        this.brickBuilders.push(brickBuilder)
        return brickBuilder
    }

    beginState(state:string):StateBuilder {
        let stateBuilder = new StateBuilder(this, state)
        this.stateBuilders.push(stateBuilder)
        return stateBuilder
    }

    withInitialState(state:string):AppBuilder{
        this.initial = state;
        return this;
    }

    createModel():App {
        //Name dictionnary part
        let bricksNameToModel = new Map<string,(Sensor|Actuator)>();
        let bricks:(Sensor|Actuator)[] = []
        for(let brickBuilder of this.brickBuilders) {
            let brick = brickBuilder.createModel();
            bricksNameToModel.set(brickBuilder.name,brick);
            bricks.push(brick)
        }

        let statesNameToModel = new Map<string,State>();
        let statesList:State[] = []
        for (let stateBuilder of this.stateBuilders) {
            let state = stateBuilder.createStateModel(bricksNameToModel);
            statesNameToModel.set(stateBuilder.name,state);
            statesList.push(state)
        }

        for (let stateBuilder of this.stateBuilders) {
            let transitions:(SensorTransition|TemporalTransition)[] = stateBuilder.createTransitionModel(bricksNameToModel, statesNameToModel)
            
            const state:(State|undefined) = statesNameToModel.get(stateBuilder.name);
            if(state) state.transitions = transitions;
        }

        let initialState:State|undefined = undefined
        if(this.initial){
            initialState = statesNameToModel.get(this.initial);
            if(initialState){
                return new App(this.name, bricks, statesList, initialState);
            }
        } 
        throw "UNDEFINED INITIAL STATE" 

        
    }
}
export default AppBuilder