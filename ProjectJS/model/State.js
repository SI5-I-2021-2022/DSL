import NamedElement from "./NamedElement.js";

function State(name,transitions,actions){
    NamedElement.call(this,name);

    this.transitions = transitions;
    this.actions = actions;

    this.Loop = function(){
        let stringRes = "";
        stringRes += `\t\tCase ${this.name} :\n`;
        stringRes += this.actions.map((action) => {return "\t\t\t"+action.Loop()}).join("");
        stringRes += this.transitions.map((transition) => {return transition.Loop()}).join("");
        stringRes += "\t\tbreak;"
        return stringRes;
    }
}

export default State;