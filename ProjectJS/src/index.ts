import {appBuilderTest} from './embedded/main'
import convertToModel from "./external/index"
const input = `create App app1 which start with s1 :
with bricks : 
    Sensor button1 on pin 1, Actuator led1 on pin 2;
with states :
    State s1 :
        with actions : do led1 = HIGH;
        with transitions to s2 when : button1 = HIGH;
    State s2 :
        with actions : do led1 = LOW;
        with transitions to s1 when : button1 = LOW; 
`
convertToModel(input)

appBuilderTest()