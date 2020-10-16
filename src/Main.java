import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintWriter;

import org.antlr.v4.runtime.tree.*;

public class Main {

    static PrintWriter out;
    public static void main(String [] args) throws Exception {

        try {
            out = new PrintWriter((args.length==0)?"salida.txt" : args[0]);

            InputStream is = (args.length == 0)
                    ?  System.in
                    : new FileInputStream(args[0]);

            CharStream input = CharStreams.fromStream(is);
            TACLexer lexer = new TACLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            TACParser parser = new TACParser(tokens);

            ParseTree tree = parser.program();
            System.out.println(tree.toStringTree(parser));

            MyVisitorTAC visitorTAC = new MyVisitorTAC();
            visitorTAC.visit(tree);

            //Node n = visitorTAC.visit(tree);
            //n.gen();
            out.close();
        }
        catch(Exception e) {
            System.out.println("Error " + e );
        }
        out.close();
    }
}
