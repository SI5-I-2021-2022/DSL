import Action from "./Action.js";
import Actuator from "./Actuator.js";
import AnalogicalCondition from "./AnalogicalCondition.js";
import App from "./App.js";
import DigitalCondition from "./DigitalCondition.js";
import Sensor from "./Sensor.js";
import SensorTransition from "./SensorTransition.js";
import SIGNAL from "./SIGNAL.js";
import State from "./State.js";
import TemporalTransition from "./TemporalTransition.js";


let testSensor = new Sensor("button1",5);
let testSensor2 = new Sensor("captor1",5);

let testLed = new Actuator("led",1);

let ledAction = new Action(testLed,SIGNAL.LOW);

let sensorConditions = [new DigitalCondition(testSensor,SIGNAL.HIGH),new DigitalCondition(testSensor2,SIGNAL.LOW)]
let sensorConditions2 = [new DigitalCondition(testSensor,SIGNAL.LOW),new AnalogicalCondition(testSensor2,40,true)]

let testTransition = new SensorTransition(undefined,sensorConditions);
let testTransition2 = new SensorTransition(undefined,sensorConditions2);

let transitions = [testTransition, testTransition2];

let actions = [ledAction];

let testState = new State("state1",transitions,actions);
testTransition.next=testState;
testTransition2.next=testState;

let testTemporalTransition = new TemporalTransition(testState,800);
let testState2 = new State("state2",[new SensorTransition(testState,[new DigitalCondition(testSensor,SIGNAL.HIGH)]),testTemporalTransition],actions);

let app = new App("app1",[testSensor,testSensor2,testLed],[testState,testState2],testState);

console.log(app.Create());