package compiladores;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import compiladores.compiladoresParser.*;

public class CustomListener extends compiladoresBaseListener {
    private Integer nodes = 0;
    private Integer tokens = 0;
    private Integer errors = 0;
    private TablaSimbolos symbolTable = TablaSimbolos.getInstance();

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        nodes++;
        super.enterEveryRule(ctx);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        errors++;
        super.visitErrorNode(node);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        tokens++;
        super.visitTerminal(node);
    } 

    @Override
    public void enterPrograma(ProgramaContext ctx){
        System.out.println("Analisis del codigo fuente");
        symbolTable.addScope();
        super.enterPrograma(ctx);
    }

    @Override
    public void exitPrograma(ProgramaContext ctx){
        symbolTable.removeScope();
        super.exitPrograma(ctx);
        System.out.println("Cantidad de nodos -> " + nodes);
        System.out.println("Cantidad de tokens -> " + tokens);
        System.out.println("Cantidad de errores -> " + errors);
    }

    @Override
    public void enterBloque(BloqueContext ctx) {
        symbolTable.addScope();
        super.enterBloque(ctx);
    }

    @Override
    public void exitBloque(BloqueContext ctx) {
        symbolTable.removeScope();
        super.exitBloque(ctx);
        if (ctx.getChild(0).getText().equals("{") == false) {
            System.out.println("Error sintactico: Falta llave de apertura en el bloque: " + ctx.getText());
            errors++;
        }
        if (ctx.getChild(ctx.getChildCount() - 1).getText().equals("}") == false) {
            System.out.println("Error sintactico: Falta llave de cierre en el bloque: " + ctx.getText());
            errors++;
        }
    }

    @Override
    public void exitReturn(ReturnContext ctx) {
        super.exitReturn(ctx);
        if (ctx.getChild(0).getText().equals("return") == false) {
            System.out.println("Error sintactico: Falta la palabra reservada return en la sentencia: " + ctx.getText());
            errors++;
        }
        if (ctx.getChild(ctx.getChildCount() - 1).getText().equals(";") == false) {
            System.out.println("Error sintactico: Falta punto y coma en la sentencia: " + ctx.getText());
            errors++;
        }
    }

    @Override
    public void exitComparador(ComparadorContext ctx) {
        super.exitComparador(ctx);
        if (ctx.getChildCount() != 1 || ctx.getChild(0).getText().equals("==") == false && ctx.getChild(0).getText().equals("!=") == false && ctx.getChild(0).getText().equals(">") == false && ctx.getChild(0).getText().equals("<") == false && ctx.getChild(0).getText().equals(">=") == false && ctx.getChild(0).getText().equals("<=") == false){
            System.out.println("Error sintactico: Comparador invalido o inexistente en la condicion: " + ctx.getText());
            errors++;
        }
    }

    @Override
    public void exitCondicion(CondicionContext ctx) {
        super.exitCondicion(ctx);
        if (ctx.getChild(0).getText().equals("(") == false) {
            System.out.println("Error sintactico: Falta parentesis de apertura en la condicion: " + ctx.getText());
            errors++;
        }
        if (ctx.getChild(ctx.getChildCount() - 1).getText().equals(")") == false) {
            System.out.println("Error sintactico: Falta parentesis de cierre en la condicion: " + ctx.getText());
            errors++;
        }
    }

    @Override
    public void exitDeclaracion(DeclaracionContext ctx){
        super.exitDeclaracion(ctx);
        String name = ctx.ID().getText();
        if (symbolTable.containsSymbol(name) == false) {
            Variable var = new Variable();
            String tipo = ctx.getChild(0).getText();
            var.setDataType(tipo);
            var.setName(name);
            if (ctx.getChild(2).getText().isBlank()) {
                var.setInitialized(false);
            }
            else {
                var.setInitialized(true);
            }
            var.setUsed(false);
            symbolTable.addSymbol(name, var);
        }
        else {
            System.out.println("Error semantico: Doble declaracion del mismo identificador: " + ctx.getText());
            errors++;
        }

        String[] identificadores = ctx.lista_identificadores().getText().split(",");
        
        
    if(ctx.lista_identificadores().getText() != "") { 
        for (String identificador : identificadores) {
            var id = identificador.split("=")[0];
            
            var valor = "";
            if (identificador.contains("=")) {
                valor = identificador.split("=")[1];
            }
            
            if (symbolTable.containsSymbol(id) == false) {
                Variable var = new Variable();
                String tipo = ctx.getChild(0).getText();
                var.setDataType(tipo);
                var.setName(id);
                if (valor.isBlank()) {
                    var.setInitialized(false);
                }
                else {
                    var.setInitialized(true);
                }
                var.setUsed(false);
                symbolTable.addSymbol(id, var);
            }
            else {
                System.out.println("Error semantico: Doble declaracion del mismo identificador: " + id);
                errors++;
            }
        }
        }
    }


    @Override
    public void exitFuncion(FuncionContext ctx){
        super.exitFuncion(ctx);

        String id = ctx.ID().getText();

        // if (symbolTable.containsSymbol(id) == false) {
        //     Funcion function = new Funcion();

        //     String tipo = ctx.getChild(0).getText();

        //     function.setName(id);
        //     function.setDataType(tipo);
        //     function.setUsed(false);

        //     symbolTable.addSymbol(id, function);
        //  }
        // else {
        //     System.out.println("Error semantico: Doble declaracion del mismo identificador: " + ctx.getText());
        //     errors++;
        // }
    }

    

    @Override
    public void exitDeclaracion_funcion(Declaracion_funcionContext ctx) {
        super.exitDeclaracion_funcion(ctx);
        String nombre = ctx.ID().getText();

        // if (symbolTable.validateActualContext(nombre) == false) {
        //     Funcion function = new Funcion();

        //     String tipo = ctx.getChild(0).getText();

        //     function.setName(nombre);
        //     function.setDataType(tipo);
        //     function.setUsed(false);

        //     symbolTable.addSymbol(nombre, function);

        //   }
        // else {
        //     System.out.println("Error semantico: Doble declaracion del mismo identificador: " + ctx.getText());
        //     errors++;
        // }
    }

    
    @Override
    public void exitAsignacion(AsignacionContext ctx) {
        super.exitAsignacion(ctx);
        if (ctx.ID() != null) {
            Variable symbol = symbolTable.getSymbol(ctx.ID().getText());
            if (symbol == null) {
                System.out.println("Error semantico: Uso de un identificador no declarado: " +  ctx.ID().getText() );
                errors++;             
            }
            else if (symbol != null && symbol.getInitialized() == false) {
                System.out.println("Error semantico: Uso de un identificador no inicializado: "  + ctx.ID().getText() );
                errors++;
            }
        }
    }

    @Override
    public void exitCambio_variable(Cambio_variableContext ctx) {
        super.exitCambio_variable(ctx);
       if (ctx.ID() != null) {
            Variable symbol = symbolTable.getSymbol(ctx.ID().getText());
            if (symbol == null) {
                System.out.println("Error semantico: Uso de un identificador no declarado: " + ctx.ID().getText());
                errors++;             
            }
            else if (symbol != null && symbol.getInitialized() == false) {
                System.out.println("Error semantico: Uso de un identificador no inicializado: "+ ctx.ID().getText());
                errors++;
            }
        } 
    }

    @Override
    public void exitFactores_funcion(Factores_funcionContext ctx) {
        super.exitFactores_funcion(ctx);
        if (ctx.ID() != null) {
            Variable symbol = symbolTable.getSymbol(ctx.ID().getText());
            if (symbol == null) {
                System.out.println("Error semantico: Uso de un identificador no declarado: " + ctx.ID().getText());
                errors++;             
            }
            else if (symbol != null && symbol.getInitialized() == false) {
                System.out.println("Error semantico: Uso de un identificador no inicializado: "+ ctx.ID().getText());
                errors++;
            }
        } 
    }

    @Override
    public void exitIf(IfContext ctx) {
        
        super.exitIf(ctx);
        if (ctx.getChild(0).getText().equals("if") == false) {
            System.out.println("Error sintactico: Falta la palabra reservada if en la sentencia: " + ctx.getText());
            errors++;
        }
        // Validamos que se se hayan usado las llaves
        if (ctx.getChild(1).getChild(0).getText().equals("(") == false) {
            System.out.println("Error sintactico: Falta parentesis de apertura en la condicion: " + ctx.getText());
            errors++;
        }
        // Validamos que se se hayan usado las llaves
        if (ctx.getChild(1).getChild(ctx.getChildCount() - 1).getText().equals(")") == false) {
            System.out.println("Error sintactico: Falta parentesis de cierre en la condicion: " + ctx.getText());
            errors++;
        }
        // if (ctx.instruccion().bloque() != null) {
        //     var bloque = ctx.getChild(2);
        //     if(bloque.getChild(0).getText().equals("{") == false) {
        //         System.out.println("Error sintactico: Falta llave de apertura en el bloque: " + bloque.getText());
        //         errors++;
        //     }
        //     if(bloque.getChild(bloque.getChildCount() - 1).getText().equals("}") == false) {
        //         System.out.println("Error sintactico: Falta llave de cierre en el bloque: " + bloque.getText());
        //         errors++;
        //     }
        // }
    }

    @Override
    public void exitLlamada_funcion(Llamada_funcionContext ctx) {
        super.exitLlamada_funcion(ctx);
       if (ctx.ID() != null) {
            Variable symbol = symbolTable.getSymbol(ctx.ID().getText());
            if (symbol == null) {
                System.out.println("Error semantico: Uso de un identificador no declarado: "+ ctx.ID().getText());
                errors++;             
            }
            else if (symbol != null && symbol.getInitialized() == false) {
                System.out.println("Error semantico: Uso de un identificador no inicializado: " + ctx.ID().getText());
                errors++;
            }
        } 
        if (ctx.getChild(ctx.getChildCount() - 1).getText().equals(";") == false) {
            System.out.println("Error sintactico: Falta punto y coma al final de la sentencia: " + ctx.getText());
            errors++;
        }
    }

    @Override
    public void exitExp(ExpContext ctx) {
        super.exitExp(ctx);
        if(ctx.getText() != null && ctx.getText().length() > 1){
            if (ctx.getChild(0).getText().equals("+") == false && ctx.getChild(0).getText().equals("-") == false && ctx.getChild(0).getText().equals("*") == false && ctx.getChild(0).getText().equals("/") == false) {
                System.out.println("Error sintactico: Operador invalido en la expresion: " + ctx.getText());
                errors++;
            }
        }
    }
}