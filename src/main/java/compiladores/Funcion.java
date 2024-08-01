package compiladores;

import java.util.List;
import java.util.Stack;

import compiladores.compiladoresParser.FuncionContext;

public class Funcion {
    public String generateIntermediateCode(FuncionContext ctx, Stack<String> tempStack) {
        String code = "";
        // Generar etiqueta de inicio
        String startLabel = "l0";
        String startTempVar = "t0";
        code += "label " + startLabel + "\n";
        code += "pop " + startTempVar + "\n";
        // Manejar argumentos
        code += handleArguments(ctx.parametros(), tempStack);
        // Generar código para el cuerpo
        code += generateBodyCode(ctx.bloque_funcion(), tempStack);
        // Manejar retorno
        code += handleReturn(ctx.bloque_funcion(), tempStack);
        // Generar etiqueta de fin
        String endLabel = "l1";
        code += "label " + endLabel + "\n";

        return code;
    }


    private String handleArguments(compiladoresParser.ParametrosContext ctx, Stack<String> tempStack) {
        String code = "";
        if(ctx.getChildCount() == 0) {
            return code;
        }
        code += "pop " + ctx.getChild(1).getText() + "\n";
        if(ctx.getChildCount() > 2) {
            String[] params = ctx.getChild(2).getText().split(",");
            // Obtenemos de compiladoresParser las distintas posibilidades que puede tener un tipo de dato
            
            // Declarar un array de strings con valores definidos de los distintos tipos de datos
            String[] dt = {
                "int",
                "float",
                "void",
                "char",
                "double",
                "string",
            };
            
            for (int i = 0; i < params.length; i++) {
                // Si el valor de params[i] es igual a "int", "float", "void", "char", "double" o "string" entonces a esa parte del string la rremplazamos por un ""
                for (int j = 0; j < dt.length; j++) {
                    if (params[i].contains(dt[j])) {
                        params[i] = params[i].replace(dt[j], "");
                    }
                }
                if(params[i] != ""){
                    code += "pop " + params[i] + "\n";
                }
            }
        }
        return code;
    }

    private String generateBodyCode(compiladoresParser.Bloque_funcionContext ctx, Stack<String> tempStack) {
        StringBuilder code = new StringBuilder();
        String[] instrucciones = ctx.instrucciones().getText().split(";");
        String[] dt = {
            "int",
            "float",
            "void",
            "char",
            "double",
            "string",
        };
    for (String instruccion : instrucciones) {
        for (int j = 0; j < dt.length; j++) {
            if (instruccion.contains(dt[j])) {
                instruccion = instruccion.replace(dt[j], "");
            }
        } 
        if(instruccion != ""){
            code.append("\t").append(instruccion).append("\n");
            }
        }
        return code.toString();
    }

    private String handleReturn(compiladoresParser.Bloque_funcionContext ctx, Stack<String> tempStack) {
        String code = "";
        if(ctx.return_() == null) {
            return code;
        } else {
            if(ctx.return_().getChild(1) != null){
                code += "t1 " + ctx.return_().getChild(1).getText() + "\n";
            }
        }

        code += "push t1\n";
        return code;
    }
}
