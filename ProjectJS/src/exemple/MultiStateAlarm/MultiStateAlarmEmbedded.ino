// Wiring code generated from an ArduinoML model
// Application name: MAIN_APP

long debounce = 200;

enum STATE {off,buzzerState,ledState};

STATE currentState = off;

boolean BUTTONBounceGuard = false;
long BUTTONLastDebounceTime = 0;

void setup(){
        pinMode(9, INPUT);  // BUTTON [Sensor]
        pinMode(12, OUTPUT);  // LED [Actuator]
        pinMode(11, OUTPUT);  // BUZZER [Actuator]
}

void loop(){
        switch(currentState){
                case off :
                        digitalWrite(11,LOW);
                        digitalWrite(12,LOW);
                        BUTTONBounceGuard = millis() - BUTTONLastDebounceTime > debounce;

                        if(digitalRead(9) == HIGH && BUTTONBounceGuard){
                                BUTTONLastDebounceTime = millis();
                                currentState = buzzerState;
                        }
                break;

                case buzzerState :
                        digitalWrite(11,HIGH);
                        digitalWrite(12,LOW);
                        BUTTONBounceGuard = millis() - BUTTONLastDebounceTime > debounce;

                        if(digitalRead(9) == HIGH && BUTTONBounceGuard){
                                BUTTONLastDebounceTime = millis();
                                currentState = ledState;
                        }
                break;

                case ledState :
                        digitalWrite(11,LOW);
                        digitalWrite(12,HIGH);
                        BUTTONBounceGuard = millis() - BUTTONLastDebounceTime > debounce;

                        if(digitalRead(9) == HIGH && BUTTONBounceGuard){
                                BUTTONLastDebounceTime = millis();
                                currentState = off;
                        }
                break;
        }
}

