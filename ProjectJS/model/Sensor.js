import Brick from "./Brick.js";

function Sensor(name,pin){
    Brick.call(this,name,pin);

    this.Declaration = function(){
        let stringRes = "";
        stringRes += 
`boolean ${this.name}BounceGuard = false;
long ${this.name}LastDebounceTime = 0;\n`;
        return stringRes;
    }

    this.Setup = function (){
        return `pinMode(${this.pin}, INPUT);  // ${this.name} [Sensor]`
    }
}

export default Sensor