public class IfTrue extends Stmt{

    Condition condicion;
    GoTo goTo;

    public IfTrue(Condition condicion, GoTo goTo){
        this.condicion = condicion;
        this.goTo = goTo;
    }

}
