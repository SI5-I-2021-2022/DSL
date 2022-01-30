grammar alarm;

alarm           			:    'create' 'App' name=IDENTIFIER 'which' 'start' 'with' initial=IDENTIFIER ':' alarmBricks=bricks alarmStates=alarm_states;

/****** BRICK *******/
bricks          			: 'with' 'bricks' ':' elt+=brick (',' elt+=brick)* ';';
brick           			: (sensor | actuator); //possibilité de refactore (pas forcement utile)
sensor          			: 'Sensor' name=IDENTIFIER 'on' 'pin' pin=PORT_NUMBER;
actuator        			: 'Actuator' name=IDENTIFIER 'on' 'pin' pin=PORT_NUMBER;

/****** State definition *******/
//each state need to be define
alarm_states          		: 'with' 'states' ':' (listStates+=alarm_state)+;
//one state can have actions list and/ord transitions list
alarm_state           		: 'State' name=IDENTIFIER (':' actions=alarm_state_actions? transitions=alarm_state_transitions?)?;

//Action
alarm_state_actions   		: 'with' 'actions' ':' elt+=action (',' elt+=action)* ';';
action    					: 'do' actionActuator=IDENTIFIER '=' actionSignal=SIGNAL;  

//Transistion
alarm_state_transitions		: 'with' 'transitions' ':' transitions+=alarm_state_transition*;
alarm_state_transition		: 'to' nextState=IDENTIFIER 'when' ':' elt+=transition_condition (',' elt+=transition_condition)*';';
transition_condition		: sensorTransition=IDENTIFIER '=' sensorSignal=SIGNAL;



/*****************
 * * Lexer rules **
 ****************/

PORT_NUMBER					: [1-9] | '11' | '12';
IDENTIFIER					: LOWERCASE (LOWERCASE | UPPERCASE | DIGIT)+;
SIGNAL						: 'HIGH' | 'LOW';


/*************
 * * Helpers **
 ************/
fragment DIGIT				: '0'..'9';
fragment LOWERCASE			: [a-z]; // abstract rule, does not really exists
fragment UPPERCASE			: [A-Z];
NEWLINE						: ('\r'? '\n' | '\r')+ -> skip;
WS							: ((' ' | '\t')+) -> skip; // who cares about whitespaces?
COMMENT						: '#' ~('\r' | '\n')* -> skip; // Single line comments, starting with a #