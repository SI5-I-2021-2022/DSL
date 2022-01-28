import AppBuilder from "./AppBuilder.js";
let HIGH = "HIGH"
let LOW = "LOW"
let app = new AppBuilder("MAIN_APP").withInitialState("on")
    .addSensor("BUTTON").onPin(9)
    .addSensor("BUTTON2").onPin(8)
    .addActuator("LED").onPin(12)
    .beginState("off")
        .set("LED").to(LOW)
        .when("BUTTON").is(HIGH).andWhen("BUTTON2").is(LOW).goToState("on")
    .endState()
    .beginState("on")
        .set("LED").to(HIGH)
        .after(500).goToState("off")
    .endState().createModel()

console.log(app.Create())