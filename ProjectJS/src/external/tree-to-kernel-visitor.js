import Actuator from "../model/Actuator.js";
import Sensor from "../model/Sensor.js";
import State from "../model/State.js";
import Action from "../model/Action.js";

import alarmVisitor from "./gen/alarmVisitor.js";
import SIGNAL from "../model/SIGNAL.js";
import App from "../model/App.js";
import SensorTransition from "../model/SensorTransition.js";
import SensorCondition from "../model/SensorCondition.js";

export default class TreeToKernelVisitor extends alarmVisitor{

    statesNotCheck = new Map();

    states = new Map();
    actuators = new Map();
    sensors = new Map();

    visitAlarm(ctx){ 

        this.visit(ctx.alarmBricks);
        this.visit(ctx.alarmStates);
    
        this.parseTransitionState();

        const appName = ctx.name.text; 
        const appInitialState = this.states.get(ctx.initial.text);
        if(!appInitialState){
            throw "App require initial state";
        } 
        
        const bricks = Array.from(this.actuators.values()).concat(Array.from(this.sensors.values()));
        const states = Array.from(this.states.values());
        this.app = new App(appName,bricks,states,appInitialState);

        return this.app;
    }

    visitAction(ctx){
        //syntaxe force user to define actuators before action
        const actuator = this.actuators.get(ctx.actionActuator.text);
        if(!actuator){
            throw "Action need actuator defined"
        }
        const signalString = ctx.actionSignal.text; 
        const signal = signalString==="HIGH"?SIGNAL.HIGH:SIGNAL.LOW;

        const action = new Action(actuator,signal);
        

        return action;
    }

    visitSensor_transition(ctx){
        console.log(ctx.sensorTransition.text)
        //syntaxe force user to define actuators before action
        const sensor = this.sensors.get(ctx.sensorTransition.text);
        if(!sensor){
            throw "Transition need actuator defined"
        }
        const sensorCondition = new SensorCondition(sensor,ctx.sensorSignal.text==="HIGH"?SIGNAL.HIGH:SIGNAL.LOW)
        const transition = new SensorTransition(undefined,sensorCondition); //TODO integrate temporal transition
        transition.nextStateNotParse = ctx.nextState.text; //we can't parse without all state
        return transition;
    }

    visitSensor(ctx){
        const sensor = new Sensor(ctx.name.text,ctx.pin.text);
        this.sensors.set(sensor.name,sensor);
        return sensor;
    }
    visitActuator(ctx){
        const actuator = new Actuator(ctx.name.text,ctx.pin.text);
        this.actuators.set(actuator.name,actuator);
        return actuator;
    }


    visitAlarm_state(ctx){
        if(this.states.get(ctx.name.text)){
            throw "Multiple state definition not allowed"
        }
        const actions = this.visit(ctx.actions);
        const transitions= this.visit(ctx.transitions);
        const state = new State(ctx.name.text,transitions,actions)

        this.states.set(state.name,state)
        return state;
    }

    visitAlarm_state_actions(ctx){
        return this.visit(ctx.elt)
    }

    visitBricks(ctx){
        return this.visit(ctx.elt)
    }

    visitAlarm_state_transitions(ctx){
        return this.visit(ctx.elt)
    }

    visitAlarm_states(ctx){
        return this.visit(ctx.listStates)
    }

    generateModel(){
        const bricks = generateBricks(this.bricks);
    }

    parseTransitionState(){
        this.states.forEach((state)=>{
            state.transitions.forEach((transition)=>{
                const nextState = this.states.get(transition.nextStateNotParse);
                if(!nextState){
                    throw "Transition can go to undefine state"
                }
                transition.nextState=nextState;
            });
            
        })
    }

    
    
}