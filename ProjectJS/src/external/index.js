import antlr4 from 'antlr4';
import alarmLexer from './gen/alarmLexer.js';
import alarmParser from './gen/alarmParser.js';
import TreeToKernelVisitor from './tree-to-kernel-visitor.js';

const convertToModel = function(input){

    const chars = new antlr4.InputStream(input);
    const lexer = new alarmLexer(chars);
    const tokens = new antlr4.CommonTokenStream(lexer);
    const parser = new alarmParser(tokens);
    parser.buildParseTrees = true;
    const tree = parser.alarm();
    
    tree.accept(new TreeToKernelVisitor());
}


export default convertToModel;