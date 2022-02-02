// Wiring code generated from an ArduinoML model
// Application name: MAIN_APP

long delayGuard = 0;
long debounce = 200;

enum STATE
{
	off,
	on
};

STATE currentState = off;

boolean BUTTONBounceGuard = false;
long BUTTONLastDebounceTime = 0;

void setup()
{
	pinMode(9, INPUT);	   // BUTTON [Sensor]
	pinMode(12, OUTPUT);   // LED [Actuator]
	delayGuard = millis(); //For temporal state
}

void loop()
{
	switch (currentState)
	{
	case off:
		digitalWrite(12, LOW);
		BUTTONBounceGuard = millis() - BUTTONLastDebounceTime > debounce;

		if (digitalRead(9) == HIGH && BUTTONBounceGuard)
		{
			BUTTONLastDebounceTime = millis();
			delayGuard = millis();
			currentState = on;
		}
		break;

	case on:
		digitalWrite(12, HIGH);

		if (millis() - delayGuard > 800)
		{
			currentState = off;
			delayGuard = millis();
		}
		break;
	}
}
