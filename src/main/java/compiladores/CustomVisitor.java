package compiladores;
import compiladores.compiladoresParser.ProgramaContext;

public class CustomVisitor extends compiladoresBaseVisitor<String> {
   private Integer assignments = 0;
   private Integer declarations = 0;

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
        System.out.println("Soy una hoja y tengo " + ctx.getChildCount() + " hijos");
        System.out.println("    -> asignando valor a " + ctx.getChild(0).getText());
        return super.visitAsignacion(ctx);
    }

    @Override
    public String visitDeclaracion(compiladoresParser.DeclaracionContext ctx) {
        declarations++;
        System.out.println("Soy una hoja y tengo " + ctx.getChildCount() + " hijos");
        System.out.println("    -> declarando variable " + ctx.getChild(1).getText());
        return super.visitDeclaracion(ctx);
    }

    
}