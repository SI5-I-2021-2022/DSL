import {appBuilderTest} from './embedded/main'
import convertToModel from "./external/index"
const input = `create App app1 which start with s1 :
with bricks : 
    Sensor button1 on pin 1, Actuator led1 on pin 2,Sensor temperature on pin 3;
with states :
    State s1 :
        with actions : do led1 = HIGH;
        with sensor transitions : 
            to s2 when : 
                button1 = HIGH,
                temperature > 40;
            to s3 when : 
                temperature > 60;
    State s2 :
        with actions : do led1 = LOW;
        with sensor transitions :
            to s1 after 2000 ms; 
    State s3;
`
convertToModel(input)

appBuilderTest()