package compiladores;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

// Las diferentes entradas se explicaran oportunamente
public class App {
    public static void main(String[] args) throws Exception {
        // create a CharStream that reads from file
        CharStream input = CharStreams.fromFileName("input/codigo.c");

        // create a lexer that feeds off of input CharStream
        compiladoresLexer lexer = new compiladoresLexer(input);
        
        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        // create a parser that feeds off the tokens buffer
        compiladoresParser parser = new compiladoresParser(tokens);
        
        CustomListener escucha = new CustomListener();
        
        parser.addParseListener(escucha);
        
        ParseTree tree =  parser.programa();

        CustomVisitor visitor = new CustomVisitor();

        visitor.visit(tree);

        System.out.println(tree.toStringTree(parser));
    }
}
