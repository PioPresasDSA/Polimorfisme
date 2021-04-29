public class Rectangulo extends Figura{
    private double x; //ancho
    private double y; //alto

    public double Area(){
        return this.x * this.y;
    }
    public Rectangulo (double x, double y){
        this.x = x;
        this.y = y;
    }
}
