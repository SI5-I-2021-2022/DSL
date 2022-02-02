// Wiring code generated from an ArduinoML model
// Application name: app1

long debounce = 200;

enum STATE {off,on};

STATE currentState = off;

boolean buttonBounceGuard = false;
long buttonLastDebounceTime = 0;

void setup(){
	pinMode(3, OUTPUT);  // led [Actuator]
	pinMode(1, INPUT);  // button [Sensor]
}

void loop(){
	switch(currentState){
		case off :
			digitalWrite(3,LOW);
			buttonBounceGuard = millis() - buttonLastDebounceTime > debounce;

			if(digitalRead(1) == HIGH && buttonBounceGuard){
				buttonLastDebounceTime = millis();
				currentState = on;
			}
		break;

		case on :
			digitalWrite(3,HIGH);
			buttonBounceGuard = millis() - buttonLastDebounceTime > debounce;

			if(digitalRead(1) == HIGH && buttonBounceGuard){
				buttonLastDebounceTime = millis();
				currentState = off;
			}
		break;
	}
}
