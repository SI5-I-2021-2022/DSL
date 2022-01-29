// import Action from "../model/Action";
// import Actuator from "../model/Actuator";
// import AnalogicalCondition from "../model/AnalogicalCondition";
// import App from "../model/App";
// import AppVisitor from "../model/utils/AppVisitor";
// import Brick from "../model/Brick";
// import DigitalCondition from "../model/DigitalCondition";
// import NamedElement from "../model/NamedElement";
// import Sensor from "../model/Sensor";
// import SensorCondition from "../model/SensorCondition";
// import SensorTransition from "../model/SensorTransition";
// import State from "../model/State";
// import TemporalTransition from "../model/TemporalTransition";
// import Transition, { TransitionType } from "../model/Transition";

// export default class GenerateArduinoVisitor implements AppVisitor{
//     private pass: Pass = Pass.FIRST;

//     private states = new Map<string,State>()
//     private warning = []
//     private error = []

//     visitTransition(elt: Transition) {
//         throw new Error("Method not implemented.");
//     }
//     visitBrick(elt: Brick) {
//         throw new Error("Method not implemented.");
//     }

//     visitAction(elt: Action) {
//         throw new Error("Method not implemented.");
//     }
//     visitActuator(elt: Actuator) {
//         throw new Error("Method not implemented.");
//     }
//     visitAnalogicalCondition(elt: AnalogicalCondition) {
//         throw new Error("Method not implemented.");
//     }
//     visitApp(elt: App) {
//         elt.states.forEach((elt)=>elt.accept(this))


//     }

//     visitDigitalCondition(elt: DigitalCondition) {
//         throw new Error("Method not implemented.");
//     }
//     visitSensor(elt: Sensor) {
//         throw new Error("Method not implemented.");
//     }
//     visitSensorCondition(elt: SensorCondition) {
//         throw new Error("Method not implemented.");
//     }
//     visitSensorTransition(elt: SensorTransition) {
//         throw new Error("Method not implemented.");
//     }
//     visitState(elt: State) {
//         if(this.states.has(elt.name)){
//             this.error.push("truc deja defini")
//         }
//     }
//     visitTemporalTransition(elt: TemporalTransition) {
//         throw new Error("Method not implemented.");
//     }
    
// }

// enum Pass{
//     FIRST,
//     SECOND
// }