import java.util.*;

public class Stmt {

    public Map<String, Integer> memoryVariables = new HashMap<String, Integer>();
    public Map<String, Integer> memoryLabels = new HashMap<String, Integer>();
    public List<Stmt> staments = new ArrayList<Stmt>();

    public int counter = 0;

    public int add () {
        return counter ++;
    }

    public void regresar(){



    }

}
