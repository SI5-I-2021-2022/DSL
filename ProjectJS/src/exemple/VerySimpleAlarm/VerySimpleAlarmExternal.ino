// Wiring code generated from an ArduinoML model
// Application name: app1

long debounce = 200;

enum STATE {alarmOff,alarmOn};

STATE currentState = alarmOff;

boolean buttonBounceGuard = false;
long buttonLastDebounceTime = 0;

void setup(){
	pinMode(2, OUTPUT);  // led [Actuator]
	pinMode(3, OUTPUT);  // buzzer [Actuator]
	pinMode(1, INPUT);  // button [Sensor]
}

void loop(){
	switch(currentState){
		case alarmOff :
			digitalWrite(2,LOW);
			digitalWrite(3,LOW);
			buttonBounceGuard = millis() - buttonLastDebounceTime > debounce;

			if(digitalRead(1) == HIGH && buttonBounceGuard){
				buttonLastDebounceTime = millis();
				currentState = alarmOn;
			}
		break;

		case alarmOn :
			digitalWrite(2,HIGH);
			digitalWrite(3,HIGH);
			buttonBounceGuard = millis() - buttonLastDebounceTime > debounce;

			if(digitalRead(1) == LOW && buttonBounceGuard){
				buttonLastDebounceTime = millis();
				currentState = alarmOff;
			}
		break;
	}
}
