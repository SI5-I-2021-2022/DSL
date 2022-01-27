import antlr4 from 'antlr4';
import alarmLexer from './gen/alarmLexer.js';
import alarmParser from './gen/alarmParser.js';
import TreeToKernelVisitor from './tree-to-kernel-visitor.js'

const input = `create App app1 which start with s1 :
with bricks : 
    Sensor button1 on pin 1, Actuator led1 on pin 2;
with states :
    State s1 :
        with actions : do led1 = HIGH;
        with transitions : to s2 when button1 = HIGH,
    State s2 :
        with actions : do led1 = LOW;
        with transitions : to s1 when button1 = LOW; 
`
const chars = new antlr4.InputStream(input);
const lexer = new alarmLexer(chars);
const tokens = new antlr4.CommonTokenStream(lexer);
const parser = new alarmParser(tokens);
parser.buildParseTrees = true;
const tree = parser.alarm();

tree.accept(new TreeToKernelVisitor());
