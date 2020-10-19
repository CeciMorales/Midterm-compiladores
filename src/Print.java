public class Print extends Stmt {
    NumOrId numero;
    NumOrId id;
    // falta array

    public Print (int numero) {
        this.numero = new NumOrId(numero);
    }

    public Print (String id) {
        this.id = new NumOrId(id);
    }

    public void eval() {
        super.eval();
        int n = numero.number.number;
        System.out.println(n);
        Main.out.println(n);
    }



}
