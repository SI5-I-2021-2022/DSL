import AppVisitor from "./utils/AppVisitor";
import NamedElement from "./NamedElement";
import Visitable from "./utils/Visitable";

export default abstract class Brick extends NamedElement implements Visitable{
    protected _pin:string;
    
    constructor(name:string,pin:string){
        super(name);
        this._pin=pin;
    }

    get pin(){
        return this._pin;
    }

    accept(visitor: AppVisitor) {
        visitor.visitBrick(this);
    }

}
