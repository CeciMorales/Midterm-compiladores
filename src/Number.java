public class Number extends Stmt{
    int numero;

    public Number(int numero) {
        numero = numero;

    }

    public void gen() {
        System.out.print("entrando a gen");
        Main.out.println(" " + numero + " ");
    }

    @Override
    public String toString() {
        return "  " + numero +" ";
    }
}
