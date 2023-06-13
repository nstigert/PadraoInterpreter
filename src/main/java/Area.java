import java.util.ArrayList;
import java.util.List;

public class Area {

    public static String formulaAreaTriangulo = "base * altura / 2";
    public static String formulaAreaTrapezio = "baseMaior + baseMenor * altura / 2";

    public static double calcularAreaTriangulo(double base, double altura) {
        String expressao;
        expressao = formulaAreaTriangulo.replace("base", Double.toString(base));
        expressao = expressao.replace("altura", Double.toString(altura));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }

    public static double calcularAreaTrapezio(double baseMaior, double baseMenor, double altura) {
        String expressao;
        expressao = formulaAreaTrapezio.replace("baseMaior", Double.toString(baseMaior));
        expressao = expressao.replace("baseMenor", Double.toString(baseMenor));
        expressao = expressao.replace("altura", Double.toString(altura));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}

