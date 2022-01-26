import Action from "./Action.js";
import Sensor from "./Sensor.js";
import SIGNAL from "./SIGNAL.js";


let testSensor = new Sensor("toto",5);
let testAction = new Action(testSensor, SIGNAL.HIGH);
console.log(testAction.Loop());