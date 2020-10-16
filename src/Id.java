public class Id extends Stmt{
    String id;

    public Id(String id) {
        id = id;

    }

    public void gen() {
        Main.out.println(" " + id + " ");
    }

    @Override
    public String toString() {
        return "  " + id +" ";
    }
}
