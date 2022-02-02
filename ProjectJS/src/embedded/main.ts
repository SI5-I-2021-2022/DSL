import Verifier from "../kernel/Verifier";
import SIGNAL from "../kernel/model/SIGNAL.enum";
import AppBuilder from "./AppBuilder";
import GenerateArduinoVisitor from "../kernel/GenerateArduinoVisitor";

export function appBuilderTest(){
    let app = new AppBuilder("MAIN_APP").withInitialState("on")
        .addSensor("BUTTON").onPin(9)
        .addSensor("CAPTOR").onPin(7)
        .addSensor("BUTTON2").onPin(8)
        .addActuator("LED").onPin(12)
        .beginState("off")
            .set("LED").to(SIGNAL.LOW)
            .when("BUTTON").is(SIGNAL.HIGH).andWhen("BUTTON2").is(SIGNAL.LOW).goToState("on")
            .when("CAPTOR").isGreaterThan(40).goToState("off")
        .endState()
        .beginState("on")
            .set("LED").to(SIGNAL.HIGH)
            .after(500).goToState("off")
        .endState().createModel()

    app.create('./src/embedded/main.ino');

}
