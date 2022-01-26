import Action from "./Action.js";
import Actuator from "./Actuator.js";
import App from "./App.js";
import Sensor from "./Sensor.js";
import SensorCondition from "./SensorCondition.js";
import SensorTransition from "./SensorTransition.js";
import SIGNAL from "./SIGNAL.js";
import State from "./State.js";


let testSensor = new Sensor("button1",5);
let testSensor2 = new Sensor("button2",5);

let testLed = new Actuator("led",1);

let ledAction = new Action(testLed,SIGNAL.LOW);

let sensorConditions = [new SensorCondition(testSensor,SIGNAL.HIGH),new SensorCondition(testSensor2,SIGNAL.LOW)]
let sensorConditions2 = [new SensorCondition(testSensor,SIGNAL.LOW),new SensorCondition(testSensor2,SIGNAL.HIGH)]

let testTransition = new SensorTransition(undefined,sensorConditions);
let testTransition2 = new SensorTransition(undefined,sensorConditions2);

let transitions = [testTransition, testTransition2];

let actions = [ledAction];

let testState = new State("state1",transitions,actions);
testTransition.next=testState;
testTransition2.next=testState;

let testState2 = new State("state2",[new SensorTransition(testState,[new SensorCondition(testSensor,SIGNAL.HIGH)])],actions);

let app = new App("app1",[testSensor,testSensor2,testLed],[testState,testState2],testState);

console.log(app.Create());