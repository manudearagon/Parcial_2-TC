package compiladores;
import java.util.Stack;

import compiladores.compiladoresParser.ExpContext;
import compiladores.compiladoresParser.ExpresionContext;
import compiladores.compiladoresParser.FactorContext;
import compiladores.compiladoresParser.ProgramaContext;


public class CustomVisitor extends compiladoresBaseVisitor<String> {
   private Integer assignments = 0;
   private Integer declarations = 0;
   private Asignacion asignacion = new Asignacion();

   @Override
   public String visitPrograma(ProgramaContext ctx) {
        String returnValue = super.visitPrograma(ctx);
        System.out.println("Cantidad de declaraciones: " + declarations);
        System.out.println("Cantidad de asignaciones: " + assignments);
        return returnValue;
   }

   @Override
   public String visitAsignacion(compiladoresParser.AsignacionContext ctx) {
       assignments++;
       String variable = ctx.getChild(0).getText();
       
       // Generar código intermedio
       Stack<String> tempStack = new Stack<>();
       String intermediateCode = asignacion.generateIntermediateCode(ctx.expresion(), tempStack);
       String finalTemp = tempStack.pop();
   
       System.out.println(intermediateCode);
       System.out.println(variable + " = " + finalTemp);
       return super.visitAsignacion(ctx);
   }

    @Override
    public String visitDeclaracion(compiladoresParser.DeclaracionContext ctx) {
        declarations++;
        System.out.println("Declarando variable --> " + ctx.getChild(1).getText());
        return super.visitDeclaracion(ctx);   
    }

   
}