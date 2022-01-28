import alarmVisitor from "./gen/alarmVisitor.js";

export default class TreeToKernelVisitor extends alarmVisitor{
    visit(ctx){
        console.log("im call")
        super.visit(ctx);
    }

    visitAlarm(ctx){
        //parse tree
        const appName = ctx.name.text; 
        const appInitial = ctx.initial.text;        

        const bricks = this.visit(ctx.alarmBricks);
        const alarmStates = this.visit(ctx.alarmStates);

        //construct model
        this.app = {name:appName,initial:appInitial}
        this.app.name = appName;
        this.app.initial = appInitial;
        this.states = alarmStates;
        this.bricks=bricks;

        console.log("im call")
        console.log(this.app,this.states,this.bricks)

        return this.app;
    }

    visitAction(ctx){
        //parse tree
        const actionActuator = ctx.actionActuator.text; 
        const actionValue = ctx.actionSignal.text; 

        return {actuator:actionActuator,value:actionValue};
    }

    visitSensor_transition(ctx){
        return {nextState:ctx.nextState.text,actionActivator:ctx.actionActivator.text}
    }

    visitSensor(ctx){
        console.log( {name:ctx.name.text,pin:ctx.pin.text})
        return {name:ctx.name.text,pin:ctx.pin.text}
    }
    visitActuator(ctx){
        console.log( {name:ctx.name.text,pin:ctx.pin.text})
        return {name:ctx.name.text,pin:ctx.pin.text}
    }


    visitAlarm_state(ctx){
        return {name:ctx.name.text,actions:this.visit(ctx.actions),transitions:this.visit(ctx.transitions)}
    }

    visitAlarm_state_actions(ctx){
        return this.visitChildren(ctx).filter((elt)=>elt!==undefined)
    }

    visitBricks(ctx){
        return this.visitChildren(ctx).filter((elt)=>elt!==undefined) 
    }

    visitAlarm_state_transitions(ctx){
        return this.visitChildren(ctx).filter((elt)=>elt!==undefined) 
    }

    
}