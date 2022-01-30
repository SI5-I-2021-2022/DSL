# ALARM PROJECT
## HOW TO BUILD
require JAVA for build antlr4 grammar  
- use `npm i` for install dependency.  
- use `npm run build:antlr` for generate antlr js parser and lexer.
- use `npm run build` for generate dist js parser and lexer.

## HOW TO RUN
*Before run this command, you need tu build antlr.*
- use `npm run exec` for run index.js file, this command run all exemple prepare
- use `npm run gen:ino "input DSL external path" "output.ino"` to generate ino of the input give (ex : `npm run gen:ino ./src/exemple/test.alarm ./output.ino`)
