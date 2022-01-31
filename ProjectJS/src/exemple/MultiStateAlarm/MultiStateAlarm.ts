import SIGNAL from "../../kernel/model/SIGNAL.enum";
import AppBuilder from "../../embedded/AppBuilder";
import GenerateArduinoVisitor from "../../kernel/GenerateArduinoVisitor";

export function multiStateAlarm(){
    const app = new AppBuilder("MAIN_APP").withInitialState("off")
        .addSensor("BUTTON").onPin(9)
        .addActuator("LED").onPin(12)
        .addActuator("BUZZER").onPin(11)
        .beginState("off")
        .set("BUZZER").to(SIGNAL.LOW)
        .set("LED").to(SIGNAL.LOW)
        .when("BUTTON").is(SIGNAL.HIGH).goToState("buzzerState")
        .endState()
        .beginState("buzzerState")
        .set("BUZZER").to(SIGNAL.HIGH)
        .set("LED").to(SIGNAL.LOW)
        .when("BUTTON").is(SIGNAL.HIGH).goToState("ledState")
        .endState()
        .beginState("ledState")
        .set("BUZZER").to(SIGNAL.LOW)
        .set("LED").to(SIGNAL.HIGH)
        .when("BUTTON").is(SIGNAL.HIGH).goToState("off")
        .endState()
        .createModel()




    const generator = new GenerateArduinoVisitor();
    const inoString = app.accept(generator)
    console.log(inoString);
}
