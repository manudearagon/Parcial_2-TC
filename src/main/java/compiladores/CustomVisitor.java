package compiladores;
import java.util.HashMap;


import compiladores.compiladoresParser.AsignacionContext;
import compiladores.compiladoresParser.DeclaracionContext;

public class CustomVisitor extends compiladoresBaseVisitor<Void> {
    private HashMap<String, String> symbolTable = new HashMap<>();

    @Override
    public Void visitDeclaracion(DeclaracionContext ctx) {
        
        return null;
   
    }

    @Override
    public Void visitAsignacion(AsignacionContext ctx) {
       
        return null;
    }
}