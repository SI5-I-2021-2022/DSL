import * as fs from 'fs';
import convertToModel from './external';
import createFile from './utils';
if(process.argv.length<4){
    throw "ARGUMENT INVALID"
}
try{
    const input = fs.readFileSync(process.argv[2],'utf8');
    const output = convertToModel(input);
    createFile(process.argv[3],output)

}catch(exeption){
    console.error(exeption);
}