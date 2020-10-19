public class IfTrue extends Stmt{

    Condition condicion;
    GoTo goTo;
    Boolean result;

    int line;

    public IfTrue(Condition condicion, GoTo goTo,Boolean result, int line ){
        this.condicion = condicion;
        this.goTo = goTo;
        this.result =  result;
        this.line = line;
    }

    public IfTrue(GoTo goTo, Boolean result, int line ){
        this.goTo = goTo;
        this.result =  result;
        this.line = line;
    }



    public void eval() {
        super.eval();
        if (result == false){
            Stmt.counter = line;
        }

    }
}
