import Transition from "./Transition.js";

function SensorTransition(next,sensorConditions){
    Transition.call(this,next,"Sensor");

    this.sensorConditions = sensorConditions;

    this.Loop = function(haveTemporal){
        let stringRes = "";
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
        if(haveTemporal) stringRes += "\t\t\t\tdelayGuard = millis();\n"
        stringRes += `\t\t\t\tcurrentState = ${this.next.name};\n\t\t\t}\n`;
        return stringRes;
    }
}

export default SensorTransition;