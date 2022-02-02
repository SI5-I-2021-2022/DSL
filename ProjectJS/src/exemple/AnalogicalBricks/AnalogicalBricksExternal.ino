// Wiring code generated from an ArduinoML model
// Application name: app1

long debounce = 200;

enum STATE {off,on};

STATE currentState = off;

boolean captorBounceGuard = false;
long captorLastDebounceTime = 0;

void setup(){
	pinMode(2, OUTPUT);  // buzzer [Actuator]
	pinMode(1, INPUT);  // captor [Sensor]
}

void loop(){
	switch(currentState){
		case off :
			digitalWrite(2,LOW);
			captorBounceGuard = millis() - captorLastDebounceTime > debounce;

			if(analogRead(1) > 330 && captorBounceGuard){
				captorLastDebounceTime = millis();
				currentState = on;
			}
		break;

		case on :
			digitalWrite(2,HIGH);
			captorBounceGuard = millis() - captorLastDebounceTime > debounce;

			if(analogRead(1) < 330 && captorBounceGuard){
				captorLastDebounceTime = millis();
				currentState = off;
			}
		break;
	}
}
