grammar alarm;

alarm           			:    'create' 'App' name=IDENTIFIER 'which' 'start' 'with' initial=IDENTIFIER ':' alarmBricks=bricks alarmStates=alarm_states;

/***************************** BRICK *****************************/
bricks          			: 'with' 'bricks' ':' elt+=brick (',' elt+=brick)* ;
brick           			: (sensor | actuator); //possibilité de refactore (pas forcement utile)
sensor          			: 'Sensor' name=IDENTIFIER 'on' 'pin' pin=PORT_NUMBER;
actuator        			: 'Actuator' name=IDENTIFIER 'on' 'pin' pin=PORT_NUMBER;


/***************************** STATE DEFINITION *****************************/
//each state need to be define
alarm_states          		: 'with' 'states' ':' (listStates+=alarm_state)+;
//one state can have actions list and/ord transitions list
alarm_state           		: 'State' name=IDENTIFIER (':' actions=alarm_state_actions? transitions=alarm_state_transitions?)|';';

//Action ------------------------------------
alarm_state_actions   		: 'with' 'actions' ':' elt+=action (',' elt+=action)* ;
action    					: 'do' actionActuator=IDENTIFIER '=' actionSignal=SIGNAL;  

//========================== TRANSITION ==========================
alarm_state_transitions		: 'with' 'sensor' 'transitions' ':' transitions+=alarm_state_transition*;
alarm_state_transition		: 'to' nextState=IDENTIFIER transition=states_transition ;

//--------------- SENSOR CONDITIONS ------------------
states_transition			: (sensor_conditions | temporal_transition);
sensor_conditions			: 'when' ':'conditions+=sensor_condition (',' conditions+=sensor_condition)*;
sensor_condition			: digital_condition|analogical_transition;
digital_condition			: sensorTransition=IDENTIFIER '=' sensorSignal=SIGNAL;
analogical_transition		: sensorTransition=IDENTIFIER operator=('<'|'>') sensorSignal=POS_INTEGER;

//--------------- TEMPORAL CONDITIONS ------------------
temporal_transition			: 'after' time_ms=POS_INTEGER 'ms';



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
POS_INTEGER				    : (('1'..'9') DIGIT+) | '0';
NEWLINE						: ('\r'? '\n' | '\r')+ -> skip;
WS							: ((' ' | '\t')+) -> skip; // who cares about whitespaces?
COMMENT						: '#' ~('\r' | '\n')* -> skip; // Single line comments, starting with a #