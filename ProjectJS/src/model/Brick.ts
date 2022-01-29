import AppVisitor from "./utils/AppVisitor";
import NamedElement from "./NamedElement";
import Visitable from "./utils/Visitable";

export default abstract class Brick extends NamedElement implements Visitable{
    protected _pin:number;
    
    constructor(name:string,pin:number){
        super(name);
        this._pin=pin;
    }

    get pin(){
        return this._pin;
    }

    accept(visitor: AppVisitor) {
        visitor.visitBrick(this);
    }

    abstract declaration():any;
    abstract setup():any;

}
