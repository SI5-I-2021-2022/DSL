import AnalogicalCondition from "../model/AnalogicalCondition";
import App from "../model/App";
import Brick from "../model/Brick";
import DigitalCondition from "../model/DigitalCondition";
import { ConditionType } from "../model/SensorCondition";
import SensorTransition from "../model/SensorTransition";
import SIGNAL from "../model/SIGNAL.enum";
import State from "../model/State";
import { TransitionType } from "../model/Transition";

export default class Verifier{

    public verify(app:App){
        const errors:string[] = [];
        const warning:string[] = [];

        if(!app.initial){
            warning.push("Warning : undefined initial state");
        }

        errors.concat(this.checkDuplicateState(app.states));
        errors.concat(this.alreadyAllocatedPin(app.bricks));
        warning.concat(this.checkDuplicateBrick(app.bricks));
        warning.concat(this.checkTransitions(app.states));
    }

    public alreadyAllocatedPin(bricks:Brick[]){
        const errors:string[] = []
        const pinList:number[] = []

        for(let brick of bricks){
            if(brick.pin in pinList){
                errors.push("Error : Already allocated pin for brick "+brick.name)
            }
            else{
                pinList.push(brick.pin);
            }
        }
        return errors;
    }

    public checkDuplicateBrick(bricks:Brick[]){
        const errors:string[] = []
        const bricksNamesList:string[] = []

        for(let brick of bricks){
            if(brick.name in bricksNamesList){
                errors.push("Warning : duplicate bricks in model "+brick.name)
            }
            else{
                bricksNamesList.push(brick.name);
            }
        }
        return errors;
    }

    public checkDuplicateState(states:State[]){
        const errors:string[] = []
        const statesNamesList:string[] = []

        for(let state of states){
            if(state.name in statesNamesList){
                errors.push("Error : duplicate state in model "+state.name)
            }
            else{
                statesNamesList.push(state.name);
            }
        }
        return errors;
    }

    public checkTransitions(states:State[]){
        const warnings:string[] = []

        for(let state of states){

            let findOtherTemporalState = false;
            let raiseTemporalStateError = false;

            if(state.transitions.length == 0){
                warnings.push("Warning : State "+state.name+" has no transitions");
            }

            for(let transition of state.transitions){
                if(transition.type == TransitionType.SENSOR){
                    warnings.concat(this.checkSensorTransition(state,transition as SensorTransition));
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

    public checkSensorTransition(state:State,transition:SensorTransition){
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

        warnings.concat(this.incoherentDigitalConditon(state,digitalConditions));
        warnings.concat(this.incoherentAnalogicalCondition(state,analogicalConditions));//TODO

        return warnings;
    }

    public incoherentDigitalConditon(state:State,digitalConditions:DigitalCondition[]){
        const warnings:string[] = []
        const map = new Map<string,SIGNAL[]>();

        for(let digitalCond of digitalConditions){
            let sensorName = digitalCond.sensor.name;

            if(map.get(sensorName)){
                map.get(sensorName)?.push(digitalCond.value);
            }
            map.set(sensorName, [digitalCond.value]);
        }

        for (let [key, value] of map) {
            if(value.length > 1) {
                warnings.push("Warning : incoherent or duplicate digital condition for brick "+key+" in state "+state.name);
            }
        }
        return warnings;
    }

    public incoherentAnalogicalCondition(state:State, analogicalConditions:AnalogicalCondition[]){
        //TODO
        return [];
    }

}