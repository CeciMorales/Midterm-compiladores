public class IfFalse extends Stmt{

    Condition condicion;
    GoTo goTo;

    public IfFalse(Condition condicion, GoTo goTo){
        this.condicion = condicion;
        this.goTo = goTo;
    }

}
