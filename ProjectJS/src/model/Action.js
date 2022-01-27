
function Action(actuator, value){
    this.actuator = actuator;
    this.value = value;

    this.Loop = function(){
        return `digitalWrite(${this.actuator.pin},${this.value});\n`
    }
}

export default Action