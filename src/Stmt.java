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

        while (counter < staments.size()){
            staments.get(counter).eval();
        }

        System.out.println("memory variables" + memoryVariables);
        System.out.println("memory labels" + memoryLabels);
        System.out.println("lista statements" + staments);


    }

}
