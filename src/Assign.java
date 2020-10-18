public class Assign extends Stmt {


    Id id1;
    NumOrId numOrId;
    Operation op;

    public Assign(Id id1, NumOrId numOrId) {
        this.id1 = id1;
        this.numOrId = numOrId;

    }


}