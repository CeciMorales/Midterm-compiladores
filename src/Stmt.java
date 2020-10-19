import java.util.*;

public abstract class Stmt {

    public static Map<String, Integer> memoryVariables = new HashMap<String, Integer>();
    public static Map<String, Integer> memoryLabels = new HashMap<String, Integer>();
    public static List<Stmt> staments = new ArrayList<Stmt>();

    public static int counter = 0;

    void eval () {
        counter ++;
    }

     static final void exec(){

        counter = 0;
        System.out.println("size statements" + staments.size());
        while (counter < staments.size()){
            System.out.println("counte stament while" + counter);
            staments.get(counter).eval();
        }

    }

}
