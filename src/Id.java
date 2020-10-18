public class Id extends Expr{
    String id;

    public Id(String id) {
        this.id = id;
    }

    public String hola() {
        return "id " + id;
    }

    public void gen() {
        Main.out.println(" " + id + " ");
    }

    @Override
    public String toString() {
        return "  " + id +" ";
    }
}
