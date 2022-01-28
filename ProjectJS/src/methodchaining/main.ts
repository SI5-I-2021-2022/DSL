import AppBuilder from "./AppBuilder.js";
import Signal from "./Signal.enum.js";

export function appBuilderTest(){
let app = new AppBuilder("MAIN_APP").withInitialState("on")
    .addSensor("BUTTON").onPin(9)
    .addSensor("BUTTON2").onPin(8)
    .addActuator("LED").onPin(12)
    .beginState("off")
        .set("LED").to(Signal.LOW)
        .when("BUTTON").is(Signal.HIGH).andWhen("BUTTON2").is(Signal.LOW).goToState("on")
    .endState()
    .beginState("on")
        .set("LED").to(Signal.HIGH)
        .after(500).goToState("off")
    .endState().createModel()

console.log(app.Create())
}