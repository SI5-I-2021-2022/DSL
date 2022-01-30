import Action from "../Action";
import Actuator from "../Actuator";
import App from "../App";
import AnalogicalCondition from "../AnalogicalCondition";
import Brick from "../Brick";
import DigitalCondition from "../DigitalCondition";
import NamedElement from "../NamedElement";
import Sensor from "../Sensor";
import SensorCondition from "../SensorCondition";
import SensorTransition from "../SensorTransition";
import State from "../State";
import TemporalTransition from "../TemporalTransition";
import Transition from "../Transition";

export default interface AppVisitor{
    visitAction(elt: Action):any;
    visitActuator(elt: Actuator):any;
    visitAnalogicalCondition(elt: AnalogicalCondition):any;
    visitApp(elt: App):any;
    visitDigitalCondition(elt: DigitalCondition):any;
    visitSensor(elt: Sensor):any;
    visitSensorCondition(elt: SensorCondition):any;
    visitSensorTransition(elt: SensorTransition):any;
    visitState(elt: State):any;
    visitTemporalTransition(elt: TemporalTransition):any;
    visitTransition(elt:Transition):any;
    visitBrick(elt:Brick):any;
}