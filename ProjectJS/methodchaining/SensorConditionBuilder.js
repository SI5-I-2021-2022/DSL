import SensorCondition from "../model/SensorCondition.js";

class SensorConditionBuilder {
    constructor(rootBuilder,sensor) {
        this.rootBuilder = root;
        this.sensor = sensor;
        this.value = null;
    }

    is(value){
        this.value = value;
        return this.rootBuilder;
    }

    createModel(bricks) {
        if(this.sensor in bricks){
            return new SensorCondition(bricks[this.sensor],this.value);
        } else { throw "UNDEFINED SENSOR" }
    }
}

export default SensorConditionBuilder