package compiladores;

import java.util.Stack;

public class While {
    private int labelCounter = 0;
    private int tempVarCounter = 0;

    public String generateIntermediateCode(compiladoresParser.WhileContext ctx, Stack<String> tempStack) {
        StringBuilder code = new StringBuilder();
        

        // Generar una nueva etiqueta para el inicio del bucle
        String startLabel = getNewLabel();
        String endLabel = getNewLabel();

        // Etiqueta de inicio del bucle
        code.append("label ").append(startLabel).append("\n");

        // Generar código intermedio para la condición del bucle
        code.append(generateIntermediateCode(ctx.condicion(), tempStack));

        // Añadir instrucción de salto condicional
        String tempVar = tempStack.pop();
        code.append("if ").append(tempVar).append(" njmp ").append(endLabel).append("\n");

        // Añadir instrucción de salto incondicional al inicio del bucle
        code.append("jmp ").append(startLabel).append("\n");

        // Etiqueta de fin del bucle
        code.append("label ").append(endLabel).append("\n");

        return code.toString();
    }

    private String generateIntermediateCode(compiladoresParser.CondicionContext ctx, Stack<String> tempStack) {
        StringBuilder code = new StringBuilder();
        String tempVar = getNewTempVar();
        code.append(generateIntermediateCode(ctx.comparacion(), tempStack));
        code.append(tempVar).append(" = ").append(tempStack.pop()).append("\n");
        tempStack.push(tempVar);

        return code.toString();
    }

    
    private String generateIntermediateCode(compiladoresParser.ComparacionContext ctx, Stack<String> tempStack) {
        StringBuilder code = new StringBuilder();
        String tempVar = getNewTempVar();
        tempStack.push(tempVar);
        code.append(tempVar).append(" = ").append(ctx.getChild(0).getText()).append(" ").append(ctx.getChild(1).getText()).append(" ").append(ctx.getChild(2).getText()).append("\n");
        return code.toString();
    }

    private String getNewLabel() {
        return "l" + (labelCounter++);
    }

    private String getNewTempVar() {
        return "t" + (tempVarCounter++);
    }
}
