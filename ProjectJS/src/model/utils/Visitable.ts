import AppVisitor from "./AppVisitor";

export default interface Visitable{
    accept(visitor:AppVisitor):any;
} 