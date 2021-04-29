public class Triangulo extends Figura{
    private double base;
    private double altura;

    public double Area(){
        return (this.base*this.altura)/2;
    }

    public Triangulo( double base, double altura){
        this.base = base;
        this.altura = altura;
    }
}
