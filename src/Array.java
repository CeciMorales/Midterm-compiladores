public class Array extends Expr {
    Id id;
    Expr brackets;

    public Array(Id id, Expr expr) {
        this.id = id;
        this.brackets = expr;

    }

    public void gen() {

        Main.out.print(id+"[");
    }
}
