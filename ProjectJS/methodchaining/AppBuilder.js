import BrickBuilder from "./BrickBuilder.js";
import StateBuilder from "./StateBuilder.js";
import App from "../model/App.js"

const ACTUATOR = 0
const SENSOR = 1

class AppBuilder {
    constructor(name) {
        this.name = name;
        this.brickBuilders = [];
        this.stateBuilders = [];
        this.initial = null;
    }

    addActuator(actuator) {
        let brickBuilder = new BrickBuilder(this, actuator, ACTUATOR)
        this.brickBuilders.push(brickBuilder)
        return brickBuilder
    }
    
    addSensor(sensor) {
        let brickBuilder = new BrickBuilder(this, sensor, SENSOR)
        this.brickBuilders.push(brickBuilder)
        return brickBuilder
    }

    beginState(state) {
        let stateBuilder = new StateBuilder(this, state)
        this.stateBuilders.push(stateBuilder)
        return stateBuilder
    }

    withInitialState(state){
        this.initial = state;
        return this;
    }

    createModel() {
        //Name dictionnary part
        let bricksNameToModel = {}
        let bricks = []
        for(let brickBuilder of this.brickBuilders) {
            let brick = brickBuilder.createModel();
            bricksNameToModel[brickBuilder.name] = brick
            bricks.push(brick)
        }

        let statesNameToModel = {}
        let statesList = []
        for (let stateBuilder of this.stateBuilders) {
            let state = stateBuilder.createStateModel(bricksNameToModel);
            statesNameToModel[stateBuilder.name] = state
            statesList.push(state)
        }

        for (let stateBuilder of this.stateBuilders) {
            let transitions = stateBuilder.createTransitionModel(bricksNameToModel, statesNameToModel)
            statesNameToModel[stateBuilder.name].transitions = transitions;
        }

        let initialState = null
        if(this.initial in statesNameToModel){
            initialState = statesNameToModel[this.initial];
        } else { throw "UNDEFINED INITIAL STATE" }

        return new App(this.name, bricks, statesList, initialState);
    }
}
export default AppBuilder