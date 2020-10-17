public class Assign extends Stmt{
    // AssignIdNumOrId
    Id id;
    String equal;
    Number number;
    Id idRes;

    public Assign (Id id, String equal, Number number) {
        this.id = id;
        this.equal = equal;
        this.number = number;
    }

    public void gen() {


    }
}
