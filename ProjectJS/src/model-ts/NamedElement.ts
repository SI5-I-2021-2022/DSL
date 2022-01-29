import AppVisitor from "./utils/AppVisitor";
import Visitable from "./utils/Visitable";

export default class NamedElement{
    protected _name:string;

    constructor(name:string){
        this._name=name;
    }

    get name(){
        return this._name;
    }


}

