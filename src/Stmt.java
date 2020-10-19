import java.util.*;

public  class Stmt {

    public Map<String, Integer> memoryVariables = new HashMap<String, Integer>();
    public Map<String, Integer> memoryLabels = new HashMap<String, Integer>();
    public  List<Stmt> staments = new ArrayList<Stmt>();

    public  int counter = 0;

    public void eval () {
        counter ++;
    }

     final void exec(){

        counter = 0;
        System.out.println(staments.size());
        while (counter < staments.size()){
            System.out.println(counter);
            staments.get(counter).eval();
        }

    }

}
