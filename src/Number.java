public class Number extends Expr{
    int numero;

    public Number(int numero) {
        this.numero = numero;

    }

    @Override
    public String toString() {
        return "  " + numero +" ";
    }
}
