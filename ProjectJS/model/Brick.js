import NamedElement from './NamedElement.js'


function Brick(name,pin) {
    NamedElement.call(this,name);
    this.pin=pin;
}

export default Brick;