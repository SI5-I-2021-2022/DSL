import NamedElement from "./NamedElement.js";

function State(name,transitions,actions){
    NamedElement.call(this,name);

    this.transitions = transitions;
    this.actions = actions;

    this.Loop = function(){
        let stringRes = "";
        stringRes += `Case ${this.name} :\n`;
        stringRes += this.actions.map((action) => {return action.Loop()}).join("");
        stringRes += this.transitions.map((transition) => {return transition.Loop()}).join("");
        stringRes += "break;"
        return stringRes;
    }
}

export default State;