public class IfFalse extends Stmt{

    Condition condicion;
    GoTo goTo;
    Boolean result;
    Stmt stmt;
    int line;

    public IfFalse(Condition condicion, GoTo goTo,Boolean result, int line ){
        this.condicion = condicion;
        this.goTo = goTo;
        this.result =  result;
        this.line = line;
    }

    public IfFalse(GoTo goTo, Boolean result, int line ){
        this.goTo = goTo;
        this.result =  result;
        this.line = line;
    }

    public void eval() {
        super.eval();
        if (result == false){
            stmt.counter = line;
        }

    }
}
