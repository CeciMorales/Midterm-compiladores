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

    // tostring?





}
