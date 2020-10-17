public class Operation extends Stmt{
    Expr leftExpr;
    String signo;
    Expr rightExpr;

    public Operation(Expr leftExpr, String signo, Expr rightExpr){
        this.leftExpr = leftExpr;
        this.signo = signo;
        this.rightExpr = rightExpr;
    }

    public void gen() {

    }
}
