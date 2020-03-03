public abstract class Figura implements Comparable<Figura> {
    public abstract double area();

    @Override
    public int compareTo(Figura p) {
        return (int)(this.area()- p.area());
    }


}
