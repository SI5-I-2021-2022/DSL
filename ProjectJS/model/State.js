import NamedElement from "./NamedElement.js";

function State(name,transitions,actions){
    NamedElement.call(this,name);

    this.transitions = transitions;
    this.actions = actions;

    this.Loop = function(haveTemporal){
        let stringRes = "";

        let sensorsInState = []
        for(let transition of transitions){
            for(let sensorCond of transition.sensorConditions||[]){
                if(!sensorsInState.includes(sensorCond.sensor.name)){
                    sensorsInState.push(sensorCond.sensor.name);
                }
            }
        }

        stringRes += `\t\tCase ${this.name} :\n`;
        stringRes += this.actions.map((action) => {return "\t\t\t"+action.Loop()}).join("");

        for(let sensorName of sensorsInState){
            stringRes += `\t\t\t${sensorName}BounceGuard = millis() - ${sensorName}LastDebounceTime > debounce;\n`;
        }

        stringRes += this.transitions.map((transition) => {return transition.Loop(haveTemporal)}).join("");
        stringRes += "\t\tbreak;"
        return stringRes;
    }
}

export default State;