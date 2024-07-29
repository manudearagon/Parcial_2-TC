package compiladores;

import java.util.Stack;

import compiladores.compiladoresParser.DeclaracionContext;
import compiladores.compiladoresParser.Lista_identificadoresContext;

public class Declaracion {
    private int tempVarCounter = 0;

    public String generateIntermediateCode(DeclaracionContext ctx, Stack<String> tempStack) {
        StringBuilder code = new StringBuilder();

        String type = ctx.tipo().getText();
        String id = ctx.ID().getText();
        code.append(type).append(" ").append(id);

        if (ctx.inicializacion_variable() != null) {
            code.append(" = ").append(ctx.inicializacion_variable().getText());
        }

        if (ctx.lista_identificadores() != null) {
            code.append(generateIntermediateCode(ctx.lista_identificadores(), tempStack));
        }

        code.append(";\n");
        return code.toString();
    }

    private String generateIntermediateCode(Lista_identificadoresContext ctx, Stack<String> tempStack) {
        StringBuilder code = new StringBuilder();

        for (int i = 0; i < ctx.getChildCount(); i += 2) {
            String id = ctx.getChild(i).getText();
            code.append(", ").append(id);

            if (i + 1 < ctx.getChildCount() && ctx.getChild(i + 1).getText().equals("=")) {
                code.append(" = ").append(ctx.getChild(i + 2).getText());
                i += 2;
            }
        }

        return code.toString();
    }

    public String getNewTempVar() {
        return "t" + (tempVarCounter++);
    }
}
