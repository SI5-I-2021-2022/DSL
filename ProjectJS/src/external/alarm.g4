grammar alarm;

alarm           :    'create' 'App' name=IDENTIFIER 'which' 'start' 'with' initial=IDENTIFIER ':' alarmBricks=bricks alarmStates=alarm_states;

bricks          : 'with' 'bricks' ':' elt+=brick (',' elt+=brick)* ';';

/****** BRICK *******/
brick           : (sensor | actuator); //possibilité de refactore (pas forcement utile)
sensor          : 'Sensor' name=IDENTIFIER 'on' 'pin' pin=PORT_NUMBER;
actuator        : 'Actuator' name=IDENTIFIER 'on' 'pin' pin=PORT_NUMBER;

/****** alarm_state *******/
alarm_states          : 'with' 'states' ':' (listStates+=alarm_state)+;

alarm_state           : 'State' name=IDENTIFIER ':' actions=alarm_state_actions? transitions=alarm_state_transitions?;

//Action
alarm_state_actions   :
	'with' 'actions' ':' elt+=action (',' elt+=action)* ';';
action    : 'do' actionActuator=IDENTIFIER '=' actionSignal=SIGNAL;  

//Transistion
alarm_state_transitions: 'with' 'transitions' ':' elt+=sensor_transition (',' elt+=sensor_transition)*';';

sensor_transition:'to' nextState=IDENTIFIER 'when' sensorTransition=IDENTIFIER '=' sensorSignal=SIGNAL;

/*****************
 * * Lexer rules **
 ****************/

PORT_NUMBER: [1-9] | '11' | '12';
IDENTIFIER: LOWERCASE (LOWERCASE | UPPERCASE | DIGIT)+;
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