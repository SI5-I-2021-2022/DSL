import Actuator from "../model/Actuator";
import Sensor from "../model/Sensor";
import State from "../model/State";
import Action from "../model/Action";

import alarmVisitor from "./gen/alarmVisitor.js";
import SIGNAL from "../model/SIGNAL.enum";
import App from "../model/App";
import SensorTransition from "../model/SensorTransition";
import SensorCondition from "../model/SensorCondition";
import Transition from "../model/Transition";
import DigitalCondition from "../model/DigitalCondition";

export default class TreeToKernelVisitor extends alarmVisitor{

    statesNotCheck = new Map();

    states = new Map<string,StateTransitionNotVerify>();
    actuators = new Map();
    sensors = new Map();

    visitAlarm(ctx:any){ 

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

    visitAction(ctx:any){
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

    visitSensor_transition(ctx:any):SensorCondition{
        console.log(ctx.sensorTransition.text)
        //syntaxe force user to define actuators before action
        const sensor = this.sensors.get(ctx.sensorTransition.text);
        if(!sensor){
            throw "Transition need actuator defined"
        }
        const sensorCondition = new DigitalCondition(sensor,ctx.sensorSignal.text==="HIGH"?SIGNAL.HIGH:SIGNAL.LOW)
        return sensorCondition;
    }

    visitSensor(ctx:any){
        const sensor = new Sensor(ctx.name.text,ctx.pin.text);
        this.sensors.set(sensor.name,sensor);
        return sensor;
    }
    visitActuator(ctx:any){
        const actuator = new Actuator(ctx.name.text,ctx.pin.text);
        this.actuators.set(actuator.name,actuator);
        return actuator;
    }


    visitAlarm_state(ctx:any){
        if(this.states.get(ctx.name.text)){
            throw "Multiple state definition not allowed"
        }
        const actions = this.visit(ctx.actions);
        const transitions= this.visit(ctx.transitions);//not transition object
        const state = new StateTransitionNotVerify(ctx.name.text,[],actions)
        state.transitionsNotVerify=transitions;
        this.states.set(state.name,state)
        return state;
    }

    visitAlarm_state_actions(ctx:any){
        return this.visit(ctx.elt)
    }

    visitBricks(ctx:any){
        return this.visit(ctx.elt)
    }

    visitAlarm_state_transitions(ctx:any):TransitionNotVerify{
        const sensorConditions:SensorCondition[]=this.visit(ctx.elt)
        const nextState:string = ctx.nextState.text;
        return {nextStateNotParse:nextState,sensorConditions:sensorConditions}
    }

    visitAlarm_states(ctx:any){
        return this.visit(ctx.listStates)
    }


    parseTransitionState(){
        this.states.forEach((state)=>{
            state.transitionsNotVerify.forEach((transition:TransitionNotVerify)=>{
                const nextState = this.states.get(transition.nextStateNotParse);
                if(!nextState){
                    throw "Transition can't go to undefine state"
                }
                state.transitions.push(new SensorTransition(nextState,transition.sensorConditions));
            });
            
        })
    }
    
}

class StateTransitionNotVerify extends State{
    public transitionsNotVerify:TransitionNotVerify[]
    constructor(name:string,transitions:Transition[],actions:Action[]){
        super(name,transitions,actions)
        this.transitionsNotVerify=[];
    }
}
type TransitionNotVerify = { nextStateNotParse: string, sensorConditions: SensorCondition[]};

