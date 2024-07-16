package compiladores;

import java.util.HashMap;
import java.util.Map;
import java.util.LinkedList;
import java.util.List;
public class TablaSimbolos {
    private static TablaSimbolos instance;

    private List<Map<String, Variable>> symbolTable;

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

    public void addSymbol(String name , Variable id) {
        if(symbolTable.isEmpty() && Boolean.TRUE.equals(containsSymbol(name))) return;
        Map<String, Variable> currentScope = symbolTable.get(symbolTable.size() - 1);
        currentScope.put(name, id);
    }

    public Variable getSymbol(String name) {
        for (int i = symbolTable.size() - 1; i >= 0; i--) {
            Map<String, Variable> actualContext = symbolTable.get(i);
            if (actualContext.containsKey(name)) {
                return actualContext.get(name);
            }
        }
        return null;
    }

    public Boolean containsSymbol(String name) {
        for (int i = symbolTable.size() - 1; i >= 0; i--) {
            Map<String, Variable> actualContext = symbolTable.get(i);
            if (actualContext.containsKey(name)) {
                return true;
            }
        }
        return false;
    }

    public Boolean validateActualContext(String name) {
        Map<String, Variable> contextoActual = symbolTable.get(symbolTable.size() - 1);
        return contextoActual.containsKey(name);
    }
}



class Variable 
 {
    private String name;
    private String dataType;
    private Boolean initialized;
    private Boolean used;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public Boolean getInitialized() {
        return initialized;
    }

    public void setInitialized(Boolean initialized) {
        this.initialized = initialized;
    }

    public Boolean getUsed() {
        return used;
    }

    public void setUsed(Boolean used) {
        this.used = used;
    }
 }

class Funcion extends Variable {
    @SuppressWarnings("unused")
    private List<DataType> args;
}

enum DataType {
    VOID, 
    INT, 
    DOUBLE,
    STRING,
    CHAR,
    BOOL
}