import SIGNAL from "../../kernel/model/SIGNAL.enum";
import AppBuilder from "../../embedded/AppBuilder";
import GenerateArduinoVisitor from "../../kernel/GenerateArduinoVisitor";

export function analogicalBricks(){
    let app = new AppBuilder("MAIN_APP").withInitialState("off")
        .addSensor("CAPTOR").onPin(7)
        .addActuator("BUZZER").onPin(12)
        .beginState("off")
        .set("BUZZER").to(SIGNAL.LOW)
        .when("CAPTOR").isGreaterThan(330).goToState("on")
        .endState()
        .beginState("on")
        .set("BUZZER").to(SIGNAL.HIGH)
        .when("CAPTOR").isLowerThan(330).goToState("off")
        .endState()
        .createModel()




    app.create('./src/exemple/AnalogicalBricks/AnalogicalBricksEmbedded.ino');
}
