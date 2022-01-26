import Brick from "./Brick.js";

function Sensor(name,pin){
    Brick.call(this,name,pin);

    this.Setup = function (){
        return `pinMode(${this.pin}, INPUT);  // ${this.name} [Sensor]`
    }
}

export default Sensor