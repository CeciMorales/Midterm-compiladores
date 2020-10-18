public class Condition extends Stmt{
    NumOrId leftValue;
    NumOrId rightValue;
    String signo;

    public Condition(NumOrId leftValue, String signo, NumOrId rightValue){
        this.leftValue = leftValue;
        this.signo = signo;
        this.rightValue = rightValue;
    }

    public boolean makeOperation(){
        switch (signo){
            case ">":
                return leftValue.getVal() > rightValue.getVal();
            case ">=":
                return leftValue.getVal() >= rightValue.getVal();
            case "<":
                return leftValue.getVal() < rightValue.getVal();
            case "<=":
                return leftValue.getVal() <= rightValue.getVal();
            case "==":
                return leftValue.getVal() == rightValue.getVal();
            case "!=":
                return leftValue.getVal() != rightValue.getVal();
            default:
                break;

        }

        return false;

    }

}
