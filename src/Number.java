public class Number extends Expr{
    int number;

    public Number(int numero) {
        this.number = numero;

    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "  " + number +" ";
    }
}
