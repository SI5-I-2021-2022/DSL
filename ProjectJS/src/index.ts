import {appBuilderTest} from './embedded/main'
import convertToModel from "./external/index"
const input = `create App app1 which start with s1 :
with bricks : 
    Sensor button1 at pin 1, 
    Sensor button2 at pin 2,
    Actuator led1 at pin 3,
    Actuator led2 at pin 4,
    Actuator led3 at pin 5,
    Actuator led4 at pin 6
with states :
    State s1 :
        with actions : do led1 = HIGH,do led2 = LOW,do led3 = LOW,do led4 = LOW
        with sensor transitions : 
            to s4 when : 
                button2 = HIGH
            to s2 when : 
                button1 = HIGH
    State s2 :
        with actions : do led1 = LOW,do led2 = HIGH,do led3 = LOW,do led4 = LOW
        with sensor transitions : 
            to s1 when : 
                button2 = HIGH
            to s3 when : 
                button1 = HIGH
    State s3 :
        with actions : do led1 = LOW,do led2 = LOW,do led3 = HIGH,do led4 = LOW
        with sensor transitions : 
            to s2 when : 
                button2 = HIGH
            to s4 when : 
                button1 = HIGH
    State s4 :
        with actions : do led1 = LOW,do led2 = LOW,do led3 = LOW,do led4 = HIGH
        with sensor transitions : 
            to s3 when : 
                button2 = HIGH
            to s1 when : 
                button1 = HIGH
`
convertToModel(input)

appBuilderTest()
