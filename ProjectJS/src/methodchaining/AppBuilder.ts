import BrickBuilder from "./BrickBuilder.js";
import StateBuilder from "./StateBuilder.js";
import App from "../model/App.js"
import Sensor from "../model/Sensor.js";
import Actuator from "../model/Actuator.js";
import State from "../model/State.js";
import SensorTransition from "../model/SensorTransition.js";
import TemporalTransition from "../model/TemporalTransition.js";

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

        let initialState:(State|undefined) = undefined
        if(this.initial && statesNameToModel.has(this.initial)){
            initialState = statesNameToModel.get(this.initial);
        } else { throw "UNDEFINED INITIAL STATE" }

        return new App(this.name, bricks, statesList, initialState);
    }
}
export default AppBuilder