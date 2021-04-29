public class Circulo extends Figura {
    private double radio;

    public double Area(){
        return Math.PI*radio*radio;
    }
    public Circulo (double radio){
        this.radio = radio;
    }

}
