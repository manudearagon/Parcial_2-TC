package compiladores;

import java.util.HashMap;
import java.util.Map;
import java.util.LinkedList;
import java.util.List;
public class TablaSimbolos {
    private static TablaSimbolos instance;

    private List<Map<String, Id>> symbolTable;

    private TablaSimbolos() {
        symbolTable = new LinkedList<>();
    }

    public static TablaSimbolos getInstance() {
        if (instance == null) {
            instance = new TablaSimbolos();
        }
        return instance;
    }

    public void addScope() {
        symbolTable.add(new HashMap<>());
    }

    public void removeScope() {
        if(symbolTable.isEmpty()) return;
        symbolTable.remove(symbolTable.size() - 1);
    }

    public void addSymbol(String name , Id id) {
        if(symbolTable.isEmpty() && Boolean.TRUE.equals(containsSymbol(name))) return;
        Map<String, Id> currentScope = symbolTable.get(symbolTable.size() - 1);
        currentScope.put(name, id);
    }

    public Id getSymbol(String name) {
        for (int i = symbolTable.size() - 1; i >= 0; i--) {
            Map<String, Id> actualContext = symbolTable.get(i);
            if (actualContext.containsKey(name)) {
                return actualContext.get(name);
            }
        }
        return null;
    }

    public Boolean containsSymbol(String name) {
        for (int i = symbolTable.size() - 1; i >= 0; i--) {
            Map<String, Id> actualContext = symbolTable.get(i);
            if (actualContext.containsKey(name)) {
                return true;
            }
        }
        return false;
    }

    public Boolean validateActualContext(String name) {
        Map<String, Id> contextoActual = symbolTable.get(symbolTable.size() - 1);
        return contextoActual.containsKey(name);
    }
}
abstract class Id {
    private String nombre;
    private String tipoDato;
    private Boolean initialized;
    private Boolean used;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDato() {
        return tipoDato;
    }

    public void setTipoDato(String tipoDato) {
        this.tipoDato = tipoDato;
    }

    public Boolean getinitialized() {
        return initialized;
    }

    public void setinitialized(Boolean initialized) {
        this.initialized = initialized;
    }

    public Boolean getUsado() {
        return used;
    }

    public void setUsado(Boolean used) {
        this.used = used;
    }
}

class Variable extends Id {}

class Funcion extends Id {
    private List<TipoDato> argumentos;
}

enum TipoDato {
    VOID, 
    INT, 
    DOUBLE
}
