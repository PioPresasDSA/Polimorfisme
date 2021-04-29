public abstract class Figura implements Comparable<Figura> {
    public abstract double Area();

    public int compareTo(Figura o) {
        double d = this.Area() - o.Area();
        return (int) d;
    }
}