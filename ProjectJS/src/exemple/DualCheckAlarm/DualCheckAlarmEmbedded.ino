// Wiring code generated from an ArduinoML model
// Application name: MAIN_APP

long debounce = 200;

enum STATE
{
	off,
	on
};

STATE currentState = off;

boolean BUTTON2BounceGuard = false;
long BUTTON2LastDebounceTime = 0;
boolean BUTTONBounceGuard = false;
long BUTTONLastDebounceTime = 0;

void setup()
{
	pinMode(8, INPUT);	 // BUTTON2 [Sensor]
	pinMode(9, INPUT);	 // BUTTON [Sensor]
	pinMode(11, OUTPUT); // BUZZER [Actuator]
}

void loop()
{
	switch (currentState)
	{
	case off:
		digitalWrite(11, LOW);
		BUTTONBounceGuard = millis() - BUTTONLastDebounceTime > debounce;
		BUTTON2BounceGuard = millis() - BUTTON2LastDebounceTime > debounce;

		if (digitalRead(9) == HIGH && BUTTONBounceGuard && digitalRead(8) == HIGH && BUTTON2BounceGuard)
		{
			BUTTONLastDebounceTime = millis();
			BUTTON2LastDebounceTime = millis();
			currentState = on;
		}
		break;

	case on:
		digitalWrite(11, HIGH);
		BUTTONBounceGuard = millis() - BUTTONLastDebounceTime > debounce;
		BUTTON2BounceGuard = millis() - BUTTON2LastDebounceTime > debounce;

		if (digitalRead(9) == LOW && BUTTONBounceGuard)
		{
			BUTTONLastDebounceTime = millis();
			currentState = off;
		}

		if (digitalRead(8) == LOW && BUTTON2BounceGuard)
		{
			BUTTON2LastDebounceTime = millis();
			currentState = off;
		}
		break;
	}
}
