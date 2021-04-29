import java.util.Arrays;

public class GestorFiguras {
    public static double suma (Figura[] vec){
        double resultado = 0;
        for (Figura o:vec){
            resultado += o.Area();
        }
        return resultado;
    }

public static Figura[] sort(Figura[]vec){
    Arrays.sort(vec);
    return vec;

}

public static void main(String[] args) {
    Circulo circulo = new Circulo(2);
    Rectangulo rectangulo = new Rectangulo(3,5);
    Cuadrado cuadrado = new Cuadrado(2);
    Triangulo triangulo = new Triangulo(5,3);

    Figura[] figuras = new Figura[]{
            circulo,rectangulo,cuadrado,triangulo
    };
    System.out.println("El area es de " +GestorFiguras.suma(figuras)+"");
    Figura [] a = GestorFiguras.sort(figuras);
    System.out.println(Arrays.asList(figuras));
}
}
