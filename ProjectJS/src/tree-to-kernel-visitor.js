import alarmVisitor from "./gen/alarmVisitor.js";

export default class TreeToKernelVisitor extends alarmVisitor{
    visitAlarm(ctx){
        console.log(ctx.name.text);
        super.visitAlarm(ctx);
    }
    
}