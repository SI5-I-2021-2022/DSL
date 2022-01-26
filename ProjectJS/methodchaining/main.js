import AppBuilder from "./AppBuilder.js";
let HIGH = "HIGH"
let LOW = "LOW"
let app = new AppBuilder("Switch!")
    .sensor("BUTTON").on_pin(9)
    .actuator("LED").on_pin(12)
    .state("off")
    .set("LED").to(LOW)
    .when("BUTTON").has_value(HIGH).go_to_state("on")
    .state("on")
    .set("LED").to(HIGH)
    .when("BUTTON").has_value(HIGH).go_to_state("off").get_content()
console.log(app.Create())