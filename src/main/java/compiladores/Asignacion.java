package compiladores;

import java.util.Stack;

import compiladores.compiladoresParser.ExpContext;
import compiladores.compiladoresParser.ExpresionContext;
import compiladores.compiladoresParser.FactorContext;
import compiladores.compiladoresParser.TermContext;
import compiladores.compiladoresParser.TerminoContext;

public class Asignacion {
    private int tempVarCounter = 0;

    String generateIntermediateCode(ExpresionContext ctx, Stack<String> tempStack) {
        StringBuilder code = new StringBuilder();
        
        // Procesar el término
        code.append(generateIntermediateCode(ctx.termino(), tempStack));
        if (ctx.exp() != null && !ctx.exp().getText().isEmpty()) {
            code.append(generateIntermediateCode(ctx.exp(), tempStack));
        }
        return code.toString();
    }

    private String generateIntermediateCode(TerminoContext ctx, Stack<String> tempStack) {
        StringBuilder code = new StringBuilder();
        // Procesar el factor
        code.append(generateIntermediateCode(ctx.factor(), tempStack));
        if (ctx.term() != null && !ctx.term().getText().isEmpty()) {
            code.append(generateIntermediateCode(ctx.term(), tempStack));
        }
        
        if (ctx.getChildCount() == 3) {
            String right = tempStack.pop();
            String left = tempStack.pop();
            String tempVar = getNewTempVar();
            code.append(tempVar).append(" = ").append(left).append(" ").append(ctx.getChild(1).getText()).append(" ").append(right).append("\n");
            tempStack.push(tempVar);
        }

        return code.toString();
    }

    private String generateIntermediateCode(FactorContext ctx, Stack<String> tempStack) {
        StringBuilder code = new StringBuilder();
        
        if (ctx.ID() != null) {
            tempStack.push(ctx.ID().getText());
        } else if (ctx.NUMERO() != null) {
            tempStack.push(ctx.NUMERO().getText());
        } else if (ctx.PA() != null && ctx.expresion() != null) {
            code.append(generateIntermediateCode(ctx.expresion(), tempStack));
        }

        return code.toString();
    }

    private String generateIntermediateCode(ExpContext ctx, Stack<String> tempStack) {
        StringBuilder code = new StringBuilder();
        
        if (ctx.expresion() != null) {
            code.append(generateIntermediateCode(ctx.expresion(), tempStack));
        }
        
        if (ctx.MAS() != null || ctx.MENOS() != null || ctx.MULTIPLICACION() != null || ctx.DIVISION() != null) {

            String right = tempStack.pop();
            String left = tempStack.pop();
            String tempVar = getNewTempVar();
            code.append(tempVar).append(" = ").append(left).append(" ").append(ctx.getChild(0).getText()).append(" ").append(right).append("\n");
            tempStack.push(tempVar);
        }

        return code.toString();
    }

    private String generateIntermediateCode(TermContext ctx, Stack<String> tempStack) {
        StringBuilder code = new StringBuilder();

        
        // Generar código intermedio para el factor
        code.append(generateIntermediateCode(ctx.factor(), tempStack));
        
        // Generar código intermedio para el siguiente término, si existe
        if (ctx.term() != null && !ctx.term().getText().isEmpty()) {
            code.append(generateIntermediateCode(ctx.term(), tempStack));
        }
        
        // Si hay un operador, procesar los operandos
        if (ctx.getChildCount() == 3) {
            String right = tempStack.pop();
            String left = tempStack.pop();
            String tempVar = getNewTempVar();
            code.append(tempVar).append(" = ").append(left).append(" ").append(ctx.getChild(0).getText()).append(" ").append(right).append("\n");
            tempStack.push(tempVar);
        }
    
        return code.toString();
    }

    private String getNewTempVar() {
        return "t" + (tempVarCounter++);
    }
}
