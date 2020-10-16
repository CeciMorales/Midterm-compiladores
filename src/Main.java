import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.InputStream;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String [] args) throws Exception {
        InputStream is = (args.length == 0)
                ?  System.in
                : new FileInputStream(args[0]);

        CharStream input = CharStreams.fromStream(is);
        TACLexer lexer = new TACLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TACParser parser = new TACParser(tokens);

        ParseTree tree = parser.program();

        MyVisitorTAC visitorTAC = new MyVisitorTAC();
        visitorTAC.visit(tree);
    }
}
