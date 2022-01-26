import Brick from "./Brick.js";

function Actuator(name,pin){
    Brick.call(this,name,pin);

    this.Declaration = function(){
        return "";
    }

    this.Setup = function (){
        return `pinMode(${this.pin}, OUTPUT);  // ${this.name} [Actuator]`
    }
}

export default Actuator