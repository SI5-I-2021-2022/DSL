import SIGNAL from "../../kernel/model/SIGNAL.enum";
import AppBuilder from "../../embedded/AppBuilder";
import GenerateArduinoVisitor from "../../kernel/GenerateArduinoVisitor";

export function dualCheckAlarm(){
    const app = new AppBuilder("MAIN_APP").withInitialState("off")
        .addSensor("BUTTON2").onPin(8)
        .addSensor("BUTTON").onPin(9)
        .addActuator("BUZZER").onPin(11)
        .beginState("off")
        .set("BUZZER").to(SIGNAL.LOW)
        .when("BUTTON").is(SIGNAL.HIGH).andWhen("BUTTON2").is(SIGNAL.HIGH).goToState("on")
        .endState()
        .beginState("on")
        .set("BUZZER").to(SIGNAL.HIGH)
        .when("BUTTON").is(SIGNAL.LOW).goToState("off")
        .when("BUTTON2").is(SIGNAL.LOW).goToState("off")
        .endState()
        .createModel()


        app.create('./src/exemple/DualCheckAlarm/DualCheckAlarmEmbedded.ino');
}
