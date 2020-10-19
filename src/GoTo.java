public class GoTo extends Stmt {

    Id id;

    public GoTo (String id) {
        this.id = new Id(id);
    }

    public void eval(){
        super.eval();
        if (Stmt.memoryLabels.containsKey(id)){
            Stmt.counter = Stmt.memoryLabels.get(id);
        }

    }

}
