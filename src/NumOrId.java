public class NumOrId extends Stmt{
    Number number;
    Id id;

    public NumOrId(int number) {
        this.number = new Number(number);
    }

    public NumOrId(String id) {
        this.id = new Id(id);
    }

    public int getVal() {
        return number.getNumber();
    }



}
