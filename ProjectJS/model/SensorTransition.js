import Transition from "./Transition.js";

function SensorTransition(next,sensorConditions){
    Transition.call(this,next);

    this.sensorConditions = sensorConditions;

    this.Loop = function(){
        let stringRes = "";
        for(let sensorCond of this.sensorConditions){
            stringRes += `\t\t\t${sensorCond.sensor.name}BounceGuard = millis() - ${sensorCond.sensor.name}LastDebounceTime > debounce;\n`;
        }
        stringRes += `\n\t\t\tif(`;
        let firstCond = true;
        for(let sensorCond of this.sensorConditions){
            if(!firstCond){
                stringRes += " && ";
            }
            firstCond = false;
            stringRes += sensorCond.Loop();
        }
        stringRes += "){\n";
        for(let sensorCond of this.sensorConditions){
            stringRes += `\t\t\t\t${sensorCond.sensor.name}LastDebounceTime = millis();\n`;
        }
        stringRes += `\t\t\t\tcurrentState = ${this.next.name};\n\t\t\t}\n`;
        return stringRes;
    }
}

export default SensorTransition;