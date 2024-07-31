package compiladores;

import java.util.Stack;

import compiladores.compiladoresParser.BloqueContext;
import compiladores.compiladoresParser.ComparacionContext;
import compiladores.compiladoresParser.ExpresionContext;
import compiladores.compiladoresParser.FactorContext;
import compiladores.compiladoresParser.ForContext;
import compiladores.compiladoresParser.TerminoContext;

public class For {
    private int tempVarCounter = 0;
    private int labelCounter = 0;
    private String increaseVariable = "";
    private String increaseCondition = "";
    private String getNewTempVar() {
        return "t" + (tempVarCounter++);
    }
    
    private String getNewLabel() {
        return "l" + (labelCounter++);
    }

    private String setincreaseCondition(String incremento) {
        if(incremento.contains("++")) {
            this.increaseCondition =  " + 1";
        } else if(incremento.contains("--")) {
            this.increaseCondition = " - 1";
        }
        return incremento;
    }

    private String setincreaseVariable(String increaseVariable) {
        this.increaseVariable = increaseVariable;
        return increaseVariable;
    }
    
    public String generateIntermediateCode(ForContext ctx) {
        
        if(ctx == null) {
            return "";
        }

        StringBuilder code = new StringBuilder();
        Stack<String> tempStack = new Stack<>();
        // Aca declaramos la variable del for
        setincreaseVariable(ctx.ciclo().declaracion().getChild(1).getText());
        code.append(this.increaseVariable).append(" = ").append(ctx.ciclo().declaracion().getChild(3).getText()).append("\n");
        setincreaseCondition(ctx.ciclo().cambio_variable().getText());
        // Etiqueta de inicio del bucle
        String loopStartLabel = getNewLabel();
        code.append("label ").append(loopStartLabel).append("\n");
        
        // Condición del for
        if (ctx.ciclo().comparacion() != null) {
            code.append(generateIntermediateCode(ctx.ciclo().comparacion(), tempStack));
            String conditionTempVar = tempStack.pop();
            String loopEndLabel = getNewLabel();
            code.append("if ").append(conditionTempVar).append(" njmp ").append(loopEndLabel).append("\n");
            
            // Bloque de código dentro del for
            code.append(generateIntermediateCode(ctx.bloque(), tempStack));
            
            // Salto al inicio del bucle
            code.append("jmp ").append(loopStartLabel).append("\n");
            
            // Etiqueta de fin del bucle
            code.append("label ").append(loopEndLabel).append("\n");
        }
        
        return code.toString();
    }
    
    private String generateIntermediateCode(ExpresionContext ctx, Stack<String> tempStack) {
        StringBuilder code = new StringBuilder();
        
        code.append(generateIntermediateCode(ctx.termino(), tempStack));
        
        return code.toString();
    }
    
    private String generateIntermediateCode(TerminoContext ctx, Stack<String> tempStack) {
        StringBuilder code = new StringBuilder();
        
        code.append(generateIntermediateCode(ctx.factor(), tempStack));
        
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
    
    private String generateIntermediateCode(ComparacionContext ctx, Stack<String> tempStack) {
        StringBuilder code = new StringBuilder();
        if (ctx.factor(0) != null && ctx.factor(1) != null) {
            String left = ctx.factor(0).getText();
            String right = ctx.factor(1).getText();
            String tempVar = getNewTempVar();
            code.append(tempVar).append(" = ").append(left).append(" ").append(ctx.comparador().getText()).append(" ").append(right).append("\n");
            tempStack.push(tempVar);
        }
        
        return code.toString();
    }

    private String generateIntermediateCode(BloqueContext ctx, Stack<String> tempStack) {
        StringBuilder code = new StringBuilder();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i).getText().equals("{") || ctx.getChild(i).getText().equals("}")) {
                continue;
            }
            
            String[] instrucciones = ctx.getChild(1).getText().split(";");
            
            for (String instruccion : instrucciones) {
                code.append("\t").append(instruccion).append("\n");
            }
            
            
            code.append("\t").append(this.increaseVariable).append(" = ").append(increaseVariable).append(this.increaseCondition).append("\n");
            
        
        }
        
        return code.toString();
    }
    
}