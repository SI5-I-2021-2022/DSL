import Verifier from "../kernel/Verifier";
import SIGNAL from "../kernel/model/SIGNAL.enum";
import AppBuilder from "./AppBuilder";
import GenerateArduinoVisitor from "../kernel/GenerateArduinoVisitor";
import createFile from "../utils";

export function appBuilderTest(){
    let app = new AppBuilder("MAIN_APP").withInitialState("on")
        .addSensor("BUTTON").onPin("A9")
        .addSensor("CAPTOR").onPin("A7")
        .addSensor("BUTTON2").onPin("A8")
        .addActuator("LED").onPin("A12")
        .beginState("off")
            .set("LED").to(SIGNAL.LOW)
            .when("BUTTON").is(SIGNAL.HIGH).andWhen("BUTTON2").is(SIGNAL.LOW).goToState("on")
            .when("CAPTOR").isGreaterThan(40).goToState("off")
        .endState()
        .beginState("on")
            .set("LED").to(SIGNAL.HIGH)
            .after(500).goToState("off")
        .endState().createModel()


    const generator = new GenerateArduinoVisitor();
    const inoString = app.accept(generator);
    createFile('./src/embedded/main.ino',inoString);
    // EQUIVALENT TO  app.create('./src/embedded/main.ino');

}
