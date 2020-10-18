public class Operation extends Stmt{
    NumOrId leftValue;
    NumOrId rightValue;
    String signo;



    public Operation(NumOrId leftValue, String signo, NumOrId rightValue){
        this.leftValue = leftValue;
        this.signo = signo;
        this.rightValue = rightValue;
    }


    public int makeOperation(){
        switch (signo){
            case "+":
                return leftValue.getVal() + rightValue.getVal();
            case "-":
                return leftValue.getVal() - rightValue.getVal();
            case "*":
                return leftValue.getVal() * rightValue.getVal();
            case "/":
                return (int) leftValue.getVal() / rightValue.getVal();
            case "%":
                return leftValue.getVal() % rightValue.getVal();
            default:
                break;

        }

        return -1;

    }




}
