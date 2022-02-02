// Wiring code generated from an ArduinoML model
// Application name: app1

long debounce = 200;

enum STATE {off,buzzer,led};

STATE currentState = off;

boolean buttonBounceGuard = false;
long buttonLastDebounceTime = 0;

void setup(){
	pinMode(2, OUTPUT);  // led [Actuator]
	pinMode(3, OUTPUT);  // buzzer [Actuator]
	pinMode(1, INPUT);  // button [Sensor]
}

void loop(){
	switch(currentState){
		case off :
			digitalWrite(2,LOW);
			digitalWrite(3,LOW);
			buttonBounceGuard = millis() - buttonLastDebounceTime > debounce;

			if(digitalRead(1) == HIGH && buttonBounceGuard){
				buttonLastDebounceTime = millis();
				currentState = buzzer;
			}
		break;

		case buzzer :
			digitalWrite(2,LOW);
			digitalWrite(3,HIGH);
			buttonBounceGuard = millis() - buttonLastDebounceTime > debounce;

			if(digitalRead(1) == HIGH && buttonBounceGuard){
				buttonLastDebounceTime = millis();
				currentState = led;
			}
		break;

		case led :
			digitalWrite(2,HIGH);
			digitalWrite(3,LOW);
			buttonBounceGuard = millis() - buttonLastDebounceTime > debounce;

			if(digitalRead(1) == HIGH && buttonBounceGuard){
				buttonLastDebounceTime = millis();
				currentState = off;
			}
		break;
	}
}
