// Wiring code generated from an ArduinoML model
// Application name: app1

long delayGuard = 0;
long debounce = 200;

enum STATE {off,on};

STATE currentState = off;

boolean buttonBounceGuard = false;
long buttonLastDebounceTime = 0;

void setup(){
	pinMode(2, OUTPUT);  // led [Actuator]
	pinMode(1, INPUT);  // button [Sensor]
	delayGuard = millis();  //For temporal state
}

void loop(){
	switch(currentState){
		case off :
			digitalWrite(2,LOW);
			buttonBounceGuard = millis() - buttonLastDebounceTime > debounce;

			if(digitalRead(1) == HIGH && buttonBounceGuard){
				buttonLastDebounceTime = millis();
				delayGuard = millis();
				currentState = on;
			}
		break;

		case on :
			digitalWrite(2,HIGH);

			if(millis() - delayGuard > 800){
				currentState = off;
				delayGuard = millis();
			}
		break;
	}
}
