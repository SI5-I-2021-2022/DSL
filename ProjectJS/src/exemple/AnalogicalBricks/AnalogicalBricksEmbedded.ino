// Wiring code generated from an ArduinoML model
// Application name: MAIN_APP

long debounce = 200;

enum STATE {off,on};

STATE currentState = off;

boolean CAPTORBounceGuard = false;
long CAPTORLastDebounceTime = 0;

void setup(){
        pinMode(7, INPUT);  // CAPTOR [Sensor]
        pinMode(12, OUTPUT);  // BUZZER [Actuator]
}

void loop(){
        switch(currentState){
                case off :
                        digitalWrite(12,LOW);
                        CAPTORBounceGuard = millis() - CAPTORLastDebounceTime > debounce;

                        if(analogRead(7) > 330 && CAPTORBounceGuard){
                                CAPTORLastDebounceTime = millis();
                                currentState = on;
                        }
                break;

                case on :
                        digitalWrite(12,HIGH);
                        CAPTORBounceGuard = millis() - CAPTORLastDebounceTime > debounce;

                        if(analogRead(7) < 330 && CAPTORBounceGuard){
                                CAPTORLastDebounceTime = millis();
                                currentState = off;
                        }
                break;
        }
}
