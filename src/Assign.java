public class Assign extends Stmt {


    Number number;
    Id id1;
    Id id2;
    Operation op;

    public Assign(Id id1, Number number) {
        this.id1 = id1;
        this.number = number;

    }

    public Assign(Id id1, Id id2) {
        this.id1 = id1;
        this.id2 = id2;
    }
}