public class GoTo extends Stmt {
    Stmt stmt;
    Id id;

    public GoTo (String id) {
        this.id = new Id(id);
    }

    public void eval(){
        super.eval();
        if (stmt.memoryLabels.containsKey(id)){
            stmt.counter = stmt.memoryLabels.get(id);
        }

    }

}
