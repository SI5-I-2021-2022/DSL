import AnalogicalCondition from "./model/AnalogicalCondition";
import App from "./model/App";
import Brick from "./model/Brick";
import DigitalCondition from "./model/DigitalCondition";
import { ConditionType } from "./model/SensorCondition";
import SensorTransition from "./model/SensorTransition";
import SIGNAL from "./model/SIGNAL.enum";
import State from "./model/State";
import { TransitionType } from "./model/Transition";

export default class Verifier{

    public verify(app:App){
        const errors:string[] = [];
        const warning:string[] = [];

        if(!app.states.includes(app.initial)){//UNREACHABLE BY INTERNAL GENERATION
            warning.push("Warning : undefined initial state");
        }

        errors.push.apply(errors,this.checkDuplicateState(app.states));
        errors.push.apply(errors,this.alreadyAllocatedPin(app.bricks));
        warning.push.apply(warning,this.checkDuplicateBrick(app.bricks));
        warning.push.apply(warning,this.checkTransitions(app.states));

        for(let warn of warning){
            console.log(warn);
        }

        for(let err of errors){
            console.log(err);
        }

        if(errors.length != 0) return false;
        return true;
    }

    private alreadyAllocatedPin(bricks:Brick[]){
        const errors:string[] = []
        const pinList:string[] = []

        for(let brick of bricks){
            if(pinList.includes(brick.pin)){
                errors.push("Error : Already allocated pin for brick "+brick.name)
            }
            else{
                pinList.push(brick.pin);
            }
        }
        return errors;
    }

    private checkDuplicateBrick(bricks:Brick[]){
        const warnings:string[] = []
        const bricksNamesList:string[] = []

        for(let brick of bricks){
            if(bricksNamesList.includes(brick.name)){
                warnings.push("Warning : duplicate bricks "+brick.name+" in model ")
            }
            else{
                bricksNamesList.push(brick.name);
            }
        }
        return warnings;
    }

    private checkDuplicateState(states:State[]){
        const errors:string[] = []
        const statesNamesList:string[] = []

        for(let state of states){
            if(statesNamesList.includes(state.name)){
                errors.push("Error : duplicate state in model "+state.name)
            }
            else{
                statesNamesList.push(state.name);
            }
        }
        return errors;
    }

    private checkTransitions(states:State[]){
        const warnings:string[] = []

        for(let state of states){

            let findOtherTemporalState = false;
            let raiseTemporalStateError = false;

            if(state.transitions.length == 0){
                warnings.push("Warning : State "+state.name+" has no transitions");
            }

            for(let transition of state.transitions){
                if(transition.type == TransitionType.SENSOR){
                    warnings.push.apply(warnings,this.checkSensorTransition(state,transition as SensorTransition));
                }
                else{
                    if(findOtherTemporalState && !raiseTemporalStateError){//Already Temporal State
                        warnings.push("Warning : State "+state.name+" has more than one temporal transition");
                        raiseTemporalStateError = true;
                    }
                    findOtherTemporalState = true;
                }
            }
        }

        return warnings;
    }

    private checkSensorTransition(state:State,transition:SensorTransition){
        const warnings:string[] = [];
        const digitalConditions:DigitalCondition[] = [];
        const analogicalConditions:AnalogicalCondition[] = [];

        for(let sensorCondition of (transition as SensorTransition).sensorConditions){
            if(sensorCondition.type == ConditionType.DIGITAL){
                digitalConditions.push(sensorCondition as DigitalCondition);
            }
            else{
                analogicalConditions.push(sensorCondition as AnalogicalCondition);
            }
        }

        warnings.push.apply(warnings,this.incoherentDigitalConditon(state,digitalConditions));
        warnings.push.apply(warnings,this.incoherentAnalogicalCondition(state,analogicalConditions));//TODO

        return warnings;
    }

    private incoherentDigitalConditon(state:State,digitalConditions:DigitalCondition[]){
        const warnings:string[] = []
        const map = new Map<string,SIGNAL[]>();

        for(let digitalCond of digitalConditions){
            let sensorName = digitalCond.sensor.name;

            if(map.get(sensorName)){
                map.get(sensorName)?.push(digitalCond.value);
            }
            else{
                map.set(sensorName, [digitalCond.value]);
            }
        }

        for (let [key, value] of map) {
            if(value.length > 1) {
                warnings.push("Warning : incoherent or duplicate digital condition for brick "+key+" in state "+state.name);
            }
        }
        return warnings;
    }

    private incoherentAnalogicalCondition(state:State, analogicalConditions:AnalogicalCondition[]){
        //TODO
        return [];
    }

}