import Actuator from "../kernel/model/Actuator";
import Sensor from "../kernel/model/Sensor";
import State from "../kernel/model/State";
import Action from "../kernel/model/Action";
import alarmVisitor from "./gen/alarmVisitor.js";
import SIGNAL from "../kernel/model/SIGNAL.enum";
import App from "../kernel/model/App";
import SensorTransition from "../kernel/model/SensorTransition";
import SensorCondition from "../kernel/model/SensorCondition";
import Transition from "../kernel/model/Transition";
import DigitalCondition from "../kernel/model/DigitalCondition";
import AnalogicalCondition from "../kernel/model/AnalogicalCondition";
import TemporalTransition from "../kernel/model/TemporalTransition";

export default class TreeToKernelVisitor extends alarmVisitor{

    statesNotCheck = new Map<string,StateTransitionNotVerify>();

    states = new Map<string,StateTransitionNotVerify>();
    actuators = new Map<string,Actuator>();
    sensors = new Map<String,Sensor>();

    //===================== Entry point ========================
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

    /***************************** BRICK *****************************/
    visitBricks(ctx:any){
        return this.visit(ctx.elt)
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

    /***************************** STATE DEFINITION *****************************/
    visitAlarm_states(ctx:any){
        return this.visit(ctx.listStates)
    }

    visitAlarm_state(ctx:any){
        if(this.states.get(ctx.name.text)){
            throw "Multiple state definition not allowed"
        }
        let actions:Action[] = [];
        if(ctx.actions){
            actions= this.visit(ctx.actions)
        }
        let transitions:TransitionNotVerify[] =[]
        if(ctx.actions){
            transitions= this.visit(ctx.transitions);//list of transition
        }
        const state = new StateTransitionNotVerify(ctx.name.text,transitions,actions)
        this.states.set(state.name,state)
        return state;
    }

    //Action ------------------------------------
    visitAlarm_state_actions(ctx:any){
        return this.visit(ctx.elt)
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

    //========================== TRANSITION ==========================
    visitAlarm_state_transitions(ctx:any):TransitionNotVerify[]{
        return this.visit(ctx.transitions);
    }
    visitAlarm_state_transition(ctx: any):TransitionNotVerify {
        const condition:TransitionCondition=this.visit(ctx.transition)
        const nextState:string = ctx.nextState.text;
        return {nextStateNotParse:nextState,transitionCondition:condition}
    }

    //--------------- SENSOR CONDITIONS ------------------
    visitStates_transition(ctx: any) {
        return this.visit(ctx.children[0])
    }
    visitSensor_conditions(ctx: any):SensorCondition[] {
        return this.visit(ctx.conditions);
    }
    visitSensor_condition(ctx: any) {
        return this.visit(ctx.children[0]);
    }

    visitDigital_condition(ctx: any):DigitalCondition {
        //syntaxe force user to define actuators before action
        const sensor = this.sensors.get(ctx.sensorTransition.text);
        if(!sensor){
            throw "Transition need actuator defined"
        }
        const sensorCondition = new DigitalCondition(sensor,ctx.sensorSignal.text==="HIGH"?SIGNAL.HIGH:SIGNAL.LOW)
        return sensorCondition;
    }

    visitAnalogical_transition(ctx: any):AnalogicalCondition {
        //syntaxe force user to define actuators before action
        const sensor = this.sensors.get(ctx.sensorTransition.text);
        if(!sensor){
            throw "Transition need actuator defined"
        }
        const sensorCondition = new AnalogicalCondition(sensor,+ctx.sensorSignal.text,ctx.operator.text==='>')
        return sensorCondition;
    }

    //--------------- TEMPORAL CONDITIONS ------------------
    visitTemporal_transition(ctx: any):TemporalConditon{
        const timeMs:number = +ctx.time_ms.text;
        return {timeMs:timeMs}
    }




    parseTransitionState(){
        this.states.forEach((state)=>{
            state.transitionsNotVerify.forEach((transition:TransitionNotVerify)=>{
                const nextState = this.states.get(transition.nextStateNotParse);
                if(!nextState){
                    throw "Transition can't go to undefine state"
                }
                const transitionCondition = transition.transitionCondition;
                if((transitionCondition as TemporalConditon).timeMs){
                    state.transitions.push(new TemporalTransition(nextState,+((transitionCondition as TemporalConditon).timeMs)))
                }
                else if(transitionCondition instanceof Array){
                    state.transitions.push(new SensorTransition(nextState,transitionCondition));
                }
            });
            
        })
    }
    
}

class StateTransitionNotVerify extends State{
    public transitionsNotVerify:TransitionNotVerify[]
    constructor(name:string,transitions:TransitionNotVerify[],actions:Action[]){
        super(name,[],actions)
        this.transitionsNotVerify=transitions;
    }
}


type TransitionNotVerify = {nextStateNotParse:string,transitionCondition:TransitionCondition}
type TransitionCondition = TemporalConditon|SensorCondition[];
type TemporalConditon = {timeMs:number}
