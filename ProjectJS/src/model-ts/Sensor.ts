import AppVisitor from "./utils/AppVisitor";
import Brick from "./Brick";
import Visitable from "./utils/Visitable";

export default class Sensor extends Brick implements Visitable{

    constructor(name:string,pin:number){
        super(name,pin);
    }

    private declaration(){
        let stringRes = "";
        stringRes += 
            `boolean ${this.name}BounceGuard = false;\n`+
            `long ${this.name}LastDebounceTime = 0;\n`;
        return stringRes;
    }

    private setup(){
        return `pinMode(${this.pin}, INPUT);  // ${this.name} [Sensor]`
    }

    accept(visitor: AppVisitor) {
        return visitor.visitSensor(this)    
    }
}