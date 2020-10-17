public abstract class Expr extends Stmt {

    // checa valor de la izquierda
    // checa si es id solito o si es array
    static Expr leftValue(Expr expr) {
        if (expr instanceof Id) {
            return expr;
        } else if (expr instanceof Array) {
            Array auxArray = (Array) expr;
            return new Array(auxArray.id, rightValue(auxArray.brackets));
        }
        return null;
    }

    static Expr rightValue(Expr expr) {
        if (expr instanceof Id || expr instanceof Number) {
            return expr;
        }

        return null;

    }

}
