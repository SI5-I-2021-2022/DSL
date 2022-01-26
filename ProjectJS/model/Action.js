
function Action(brick, value){
    this.brick = brick;
    this.value = value;

    this.Loop = function(){
        return `digitalWrite(${this.brick.pin},${this.value});`
    }
}

export default Action