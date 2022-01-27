grammar alarm;

alarm           :    'create' 'App' name=IDENTIFIER 'which' 'start' 'with' initial=IDENTIFIER ':' bricks alarm_states;

bricks          : 'with' 'bricks' ':' brick (',' brick)* ';';

/****** BRICK *******/
brick           : (sensor | actuator); //possibilité de refactore (pas forcement utile)
sensor          : 'Sensor' name=IDENTIFIER 'on' 'pin' pin=PORT_NUMBER;
actuator        : 'Actuator' name=IDENTIFIER 'on' 'pin' pin=PORT_NUMBER;

/****** alarm_state *******/
alarm_states          : 'with' 'states' ':' alarm_state+;

alarm_state           : 'State' IDENTIFIER ':' alarm_state_actions? alarm_state_transitions?;

//Action
alarm_state_actions   :
	'with' 'actions' ':' action (',' action)* ';';
action    : 'do' IDENTIFIER '=' SIGNAL;

//Transistion
alarm_state_transitions: 'with' 'transitions' ':' sensor_transition (',' sensor_transition)*;

sensor_transition:'to' IDENTIFIER 'when' IDENTIFIER;

/*****************
 * * Lexer rules **
 ****************/

PORT_NUMBER: [1-9] | '11' | '12';
IDENTIFIER: LOWERCASE (LOWERCASE | UPPERCASE|DIGIT)+;
SIGNAL: 'HIGH' | 'LOW';

/*************
 * * Helpers **
 ***********
 */
fragment DIGIT: '0'..'9';

fragment LOWERCASE:
	[a-z]; // abstract rule, does not really exists
fragment UPPERCASE: [A-Z];
NEWLINE: ('\r'? '\n' | '\r')+ -> skip;
WS: ((' ' | '\t')+) -> skip; // who cares about whitespaces?
COMMENT:
	'#' ~('\r' | '\n')* -> skip; // Single line comments, starting with a #