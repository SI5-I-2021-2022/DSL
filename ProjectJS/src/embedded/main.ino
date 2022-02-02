// Wiring code generated from an ArduinoML model
// Application name: MAIN_APP

long delayGuard = 0;
long debounce = 200;

enum STATE {off,on};

STATE currentState = on;

boolean BUTTONBounceGuard = false;
long BUTTONLastDebounceTime = 0;
boolean CAPTORBounceGuard = false;
long CAPTORLastDebounceTime = 0;
boolean BUTTON2BounceGuard = false;
long BUTTON2LastDebounceTime = 0;

void setup(){
	pinMode(9, INPUT);  // BUTTON [Sensor]
	pinMode(7, INPUT);  // CAPTOR [Sensor]
	pinMode(8, INPUT);  // BUTTON2 [Sensor]
	pinMode(12, OUTPUT);  // LED [Actuator]
	delayGuard = millis();  //For temporal state
}

void loop(){
	switch(currentState){
		case off :
			digitalWrite(12,LOW);
			BUTTONBounceGuard = millis() - BUTTONLastDebounceTime > debounce;
			BUTTON2BounceGuard = millis() - BUTTON2LastDebounceTime > debounce;
			CAPTORBounceGuard = millis() - CAPTORLastDebounceTime > debounce;

			if(digitalRead(9) == HIGH && BUTTONBounceGuard && digitalRead(8) == LOW && BUTTON2BounceGuard){
				BUTTONLastDebounceTime = millis();
				BUTTON2LastDebounceTime = millis();
				delayGuard = millis();
				currentState = on;
			}

			if(analogRead(7) > 40 && CAPTORBounceGuard){
				CAPTORLastDebounceTime = millis();
				delayGuard = millis();
				currentState = off;
			}
		break;

		case on :
			digitalWrite(12,HIGH);

			if(millis() - delayGuard > 500){
				currentState = off;
				delayGuard = millis();
			}
		break;
	}
}
