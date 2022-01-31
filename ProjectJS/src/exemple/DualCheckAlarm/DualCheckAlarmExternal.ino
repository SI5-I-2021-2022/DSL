// Wiring code generated from an ArduinoML model
// Application name: app1

long debounce = 200;

enum STATE {off,on};

STATE currentState = off;

boolean buttonBounceGuard = false;
long buttonLastDebounceTime = 0;
boolean button2BounceGuard = false;
long button2LastDebounceTime = 0;

void setup(){
	pinMode(3, OUTPUT);  // buzzer [Actuator]
	pinMode(1, INPUT);  // button [Sensor]
	pinMode(2, INPUT);  // button2 [Sensor]
}

void loop(){
	switch(currentState){
		case off :
			digitalWrite(3,LOW);
			buttonBounceGuard = millis() - buttonLastDebounceTime > debounce;
			button2BounceGuard = millis() - button2LastDebounceTime > debounce;

			if(digitalRead(1) == HIGH && buttonBounceGuard && digitalRead(2) == HIGH && button2BounceGuard){
				buttonLastDebounceTime = millis();
				button2LastDebounceTime = millis();
				currentState = on;
			}
		break;

		case on :
			digitalWrite(3,HIGH);
			buttonBounceGuard = millis() - buttonLastDebounceTime > debounce;
			button2BounceGuard = millis() - button2LastDebounceTime > debounce;

			if(digitalRead(1) == LOW && buttonBounceGuard){
				buttonLastDebounceTime = millis();
				currentState = off;
			}

			if(digitalRead(2) == LOW && button2BounceGuard){
				button2LastDebounceTime = millis();
				currentState = off;
			}
		break;
	}
}
