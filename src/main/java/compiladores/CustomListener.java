package compiladores;

import java.util.HashMap;
import java.util.HashSet;

import compiladores.compiladoresParser.*;

public class CustomListener extends compiladoresBaseListener {
    private HashMap<String, SymbolInfo> symbolTable = new HashMap<>();
    private HashSet<String> usedIdentifiers = new HashSet<>();

    private class SymbolInfo {
        boolean initialized;
        String type;

        SymbolInfo(String type, boolean initialized) {
            this.type = type;
            this.initialized = initialized;
        }
    }

    @Override
    public void enterPrograma(ProgramaContext ctx) {
        symbolTable.clear();
        usedIdentifiers.clear();
    }

    @Override
    public void exitDeclaracion(DeclaracionContext ctx) {
        String id = ctx.ID().getText();
        String type = ctx.DT().getText();
        if (symbolTable.containsKey(id)) {
            System.out.println("Error semántico: Doble declaración del identificador '" + id + "'");
        } else {
            symbolTable.put(id, new SymbolInfo(type, false));
            if (ctx.asignacion() != null) { // Verifica si hay una asignación directa en la declaración
                symbolTable.get(id).initialized = true;
                checkTypeCompatibility(id, type, ctx.asignacion().expresiones().expr());
            }
        }
    }

    @Override
    public void exitAsignacion(AsignacionContext ctx) {
        String id = ctx.ID().getText();
        if (!symbolTable.containsKey(id)) {
            System.out.println("Error semántico: Uso de un identificador no declarado '" + id + "'");
        } else {
            symbolTable.get(id).initialized = true;
            checkTypeCompatibility(id, symbolTable.get(id).type, ctx.expresiones().expr());
        }
        usedIdentifiers.add(id); // Registra el uso del identificador
    }

    // Método para verificar la compatibilidad de tipos en expresiones
    private void checkTypeCompatibility(String id, String declaredType, ExprContext exprContext) {
        String exprType = resolveExprType(exprContext);
        if (!declaredType.equals(exprType)) {
            System.out.println("Error semántico: Tipo incompatible en la asignación a '" + id + "'. Esperado: " + declaredType + ", encontrado: " + exprType);
        }
    }

    // Resolver el tipo de una expresión basada en la gramática actual
    private String resolveExprType(ExprContext expr) {
        if (expr == null) {
            return "unknown"; // Caso base de la recursión, si no hay expresión.
        }
        if (expr.term() != null) {
            return resolveTermType(expr.term()); // Recursivamente resuelve el tipo del término
        }
        return "unknown"; // Si no se puede resolver el tipo, retorna desconocido
    }

    private String resolveTermType(TermContext term) {
        if (term == null) {
            return "unknown"; // Caso base de la recursión, si no hay término.
        }
        if (term.factor() != null) {
            return resolveFactorType(term.factor()); // Recursivamente resuelve el tipo del factor
        }
        return "unknown"; // Si no se puede resolver el tipo, retorna desconocido
    }

    private String resolveFactorType(FactorContext factor) {
        if (factor == null) {
            return "unknown"; // Caso base de la recursión, si no hay factor.
        }
        if (factor.NUMERO() != null) {
            return "int"; // Asumimos que todos los números son de tipo 'int'
        } else if (factor.ID() != null) {
            String id = factor.ID().getText();
            if (symbolTable.containsKey(id)) {
                return symbolTable.get(id).type; // Retorna el tipo del identificador desde la tabla de símbolos
            }
        } else if (factor.expr() != null) {
            return resolveExprType(factor.expr()); // Resuelve recursivamente para subexpresiones
        }
        return "unknown"; // Si no se puede resolver el tipo, retorna desconocido
    }

    @Override
    public void exitPrograma(ProgramaContext ctx) {
        for (String id : symbolTable.keySet()) {
            SymbolInfo info = symbolTable.get(id);
            if (!info.initialized) {
                System.out.println("Error semántico: Uso de un identificador sin inicializar '" + id + "'");
            }
            if (!usedIdentifiers.contains(id)) {
                System.out.println("Error semántico: Identificador declarado pero no usado '" + id + "'");
            }
        }
    }
}