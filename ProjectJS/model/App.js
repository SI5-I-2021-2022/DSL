import NamedElement from "./NamedElement.js";

function App(name,bricks,states,initial){
    NamedElement.call(this,name);
    this.bricks = bricks;
    this.states = states;
    this.initial = initial;

    this.Create = function(){
        let stringRes = "";
        stringRes += 
`// Wiring code generated from an ArduinoML model
// Application name: ${this.name}\n\n`

        stringRes += "long debounce = 200;\n\n";
        stringRes+=  "enum STATE {";
        stringRes+= this.states.map((state) => {return state.name}).join(",");
        stringRes+= "};\n\n";

        stringRes += `State currentState = ${initial.name};\n\n`;

        stringRes += this.bricks.map((brick)=> {return brick.Declaration()}).join("");

        stringRes += "\nvoid setup(){\n"
        stringRes += this.bricks.map((brick) => {return "\t"+brick.Setup()}).join("\n");
        stringRes += "\n}\n"

        stringRes += "\nvoid loop(){\n"
        stringRes += "\tswitch(currentState){\n";
        stringRes += states.map((state) =>{return state.Loop()}).join("\n\n");
        stringRes += "\n\t}\n}\n"

        return stringRes;
    };
}

export default App;