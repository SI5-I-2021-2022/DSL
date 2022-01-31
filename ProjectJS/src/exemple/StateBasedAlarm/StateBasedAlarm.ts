import SIGNAL from "../../kernel/model/SIGNAL.enum";
import AppBuilder from "../../embedded/AppBuilder";
import GenerateArduinoVisitor from "../../kernel/GenerateArduinoVisitor";

export function stateBasedAlarm(){
    const app = new AppBuilder("MAIN_APP").withInitialState("off")
        .addSensor("BUTTON").onPin(9)
        .addActuator("LED").onPin(12)
        .beginState("off")
        .set("LED").to(SIGNAL.LOW)
        .when("BUTTON").is(SIGNAL.HIGH).goToState("on")
        .endState()
        .beginState("on")
        .set("LED").to(SIGNAL.HIGH)
        .when("BUTTON").is(SIGNAL.HIGH).goToState("off")
        .endState()
        .createModel()



    const generator = new GenerateArduinoVisitor();
    const inoString = app.accept(generator)
    console.log(inoString);
}
