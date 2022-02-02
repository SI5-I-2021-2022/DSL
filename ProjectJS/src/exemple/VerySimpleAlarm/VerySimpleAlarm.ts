import SIGNAL from "../../kernel/model/SIGNAL.enum";
import AppBuilder from "../../embedded/AppBuilder";
import GenerateArduinoVisitor from "../../kernel/GenerateArduinoVisitor";

export function verySimpleAlarm(){
    const app = new AppBuilder("MAIN_APP").withInitialState("off")
        .addSensor("BUTTON").onPin(9)
        .addActuator("BUZZER").onPin(11)
        .addActuator("LED").onPin(12)
        .beginState("off")
        .set("LED").to(SIGNAL.LOW)
        .set("BUZZER").to(SIGNAL.LOW)
        .when("BUTTON").is(SIGNAL.HIGH).goToState("on")
        .endState()
        .beginState("on")
        .set("LED").to(SIGNAL.HIGH)
        .set("BUZZER").to(SIGNAL.HIGH)
        .when("BUTTON").is(SIGNAL.LOW).goToState("off")
        .endState()
        .createModel()

    app.create('./src/exemple/VerySimpleAlarm/VerySimpleAlarmEmbedded.ino');
}
