package compiladores;

import java.util.Stack;
public class If {
    private int labelCounter = 0;

    public String generateIntermediateCode(compiladoresParser.IfContext ctx, Stack<String> tempStack) {
        StringBuilder code = new StringBuilder();

        // Generar código para la condición
        String conditionCode = generateIntermediateCode(ctx.condicion(), tempStack);
        code.append(conditionCode);

        // Generar etiquetas
        String labelElse = getNewLabel();
        String labelEnd = getNewLabel();

        // Saltar al bloque else si la condición es falsa
        code.append("if ").append(tempStack.pop()).append(" njmp ").append(labelElse).append("\n");

        // Agregar lineas de codigo que se encuentran en el bloque if
        String[] instrucciones = ctx.bloque().instrucciones().getText().split(";");
        for (String instruccion : instrucciones) {
            code.append("\t").append(instruccion).append(";").append("\n");
        }

        // Saltar al final después de ejecutar el bloque if
        code.append("\t").append("jmp ").append(labelEnd).append("\n");

        // Etiqueta else
        code.append("label ").append(labelElse).append("\n");
        // Agregar lineas de codigo que se encuentran en el bloque else
        if (ctx.else_().bloque() != null) {
            instrucciones = ctx.else_().bloque().instrucciones().getText().split(";");
            for (String instruccion : instrucciones) {
                code.append("\t").append(instruccion).append(";").append("\n");
            }
        }
        // Etiqueta de fin
        code.append("label ").append(labelEnd).append("\n");

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
        return "t" + (labelCounter++);
    }
}
