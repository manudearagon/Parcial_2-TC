package compiladores;

import java.util.Stack;

import compiladores.compiladoresParser.FuncionContext;

public class Funcion {
    public String generateIntermediateCode(FuncionContext ctx, Stack<String> tempStack) {
        String code = "";
        // Generar etiqueta de inicio
        String startLabel = generateLabel();
        code += "label " + startLabel + "\n";
        // Manejar argumentos
        code += handleArguments(ctx.parametros(), tempStack);
        // Generar código para el cuerpo
        code += generateBodyCode(ctx.bloque_funcion(), tempStack);
        // Manejar retorno
        code += handleReturn(ctx.bloque_funcion(), tempStack);
        // Generar etiqueta de fin
        String endLabel = generateLabel();
        code += "label " + endLabel + "\n";
        return code;
    }

    private String generateLabel() {
        return "L" + Math.random();
    }

    private String handleArguments(compiladoresParser.ParametrosContext ctx, Stack<String> tempStack) {
        String code = "";
        for (int i = 0; i < ctx.getChildCount(); i++) {
            code += "param " + ctx.getChild(i).getText() + "\n";
        }
        return code;
    }

    private String generateBodyCode(compiladoresParser.Bloque_funcionContext ctx, Stack<String> tempStack) {
        String code = "";
        for (int i = 0; i < ctx.getChildCount(); i++) {
            code += new CustomVisitor().visit(ctx.getChild(i));
        }
        return code;
    }

    private String handleReturn(compiladoresParser.Bloque_funcionContext ctx, Stack<String> tempStack) {
        String code = "";
        code += "return " + ctx.getChild(1).getText() + "\n";
        return code;
    }
}
