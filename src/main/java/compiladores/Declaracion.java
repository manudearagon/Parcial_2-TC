package compiladores;

import org.antlr.v4.runtime.tree.ParseTree;

import compiladores.compiladoresParser.DeclaracionContext;

public class Declaracion {
    public String generateIntermediateCode(DeclaracionContext ctx) {
        StringBuilder code = new StringBuilder();
        
        String id = ctx.ID().getText();
        
        if (ctx.inicializacion_variable() != null) {
            code.append(id).append(" = ").append(ctx.inicializacion_variable().getText());
        }
        
        if (ctx.lista_identificadores() != null) {
            code.append(generateIntermediateCode(ctx.lista_identificadores()));
        }
        return code.toString();
    }

    private String generateIntermediateCode(ParseTree parseTree) {
        StringBuilder code = new StringBuilder();
        for(int i = 0; i < parseTree.getChildCount(); i++) {
            if(parseTree.getChild(i).getText().equals(",")) {
                code.append(", ");
            } else {
                if(parseTree.getChild(i).getText().contains(",")){
                    code.append(generateIntermediateCode(parseTree.getChild(i)));
                } else {
                    code.append(parseTree.getChild(i).getText());
                }
            }
        }
        return code.toString();
    }
}
