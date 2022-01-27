import Transition from "../model/Transition.js";
import State from "../model/State.js";
import BrickBuilder from "./BrickBuilder.js";
import StateBuilder from "./StateBuilder.js";
import App from "../model/App.js"

const ACTUATOR = 0
const SENSOR = 1

//TODOOOOOOO
class AppBuilder {
    constructor(name) {
        this.name = name;
        this.bricks = [];
        this.states = [];
    }

    addActuator(actuator) {
        let builder = new BrickBuilder(this, actuator, ACTUATOR)
        this.bricks.push(builder)
        return builder
    }
    addSensor(sensor) {
        let builder = new BrickBuilder(this, sensor, SENSOR)
        this.bricks.push(builder)
        return builder
    }
    beginState(state) {
        let builder = new StateBuilder(this, state)
        this.states.push(builder)
        return builder
    }

    createModel() {
        let bricks = {}
        console.log(this.bricks.length)
        for (let i; i < this.bricks.length; i++) {
            let brick = this.bricks[i].get_content()
            bricks[brick.name] = brick
        }
        let states = {}
        let state_names = []
        let state_values = []
        for (let i; i < this.states.length; i++) {
            state = this.states[i].get_contents(bricks)
            states[state.name] = state
            state_names.push(state.name)
            state_values.push(state)
        }

        for (let i; i < this.states.length; i++) {
            this.states[i].get_contents2(bricks, states)
        }
        let list = []
        for (let e in bricks) {
            list.push(bricks[e])
        }
        return new App(this.name, list, state_values)
    }
}
export default AppBuilder