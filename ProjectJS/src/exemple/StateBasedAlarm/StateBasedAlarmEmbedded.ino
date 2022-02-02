// Wiring code generated from an ArduinoML model
// Application name: MAIN_APP

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
	pinMode(9, INPUT);	 // BUTTON [Sensor]
	pinMode(12, OUTPUT); // LED [Actuator]
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
			currentState = on;
		}
		break;

	case on:
		digitalWrite(12, HIGH);
		BUTTONBounceGuard = millis() - BUTTONLastDebounceTime > debounce;

		if (digitalRead(9) == HIGH && BUTTONBounceGuard)
		{
			BUTTONLastDebounceTime = millis();
			currentState = off;
		}
		break;
	}
}
