import Transition from "./Transition.js";

function TemporalTransition(next,time){
    Transition.call(this,next,"Temporal");

    this.time = time;

    this.Loop = function(haveTemporal){
        let stringRes = "";

        stringRes += `\n\t\t\tif(millis() - delayGuard > ${this.time}){\n`
        stringRes += `\t\t\t\tcurrentState = ${this.next.name};\n`;
        stringRes += "\t\t\t\tdelayGuard = millis();\n"
        stringRes += "\t\t\t}\n"
        return stringRes;
    }
}

export default TemporalTransition;