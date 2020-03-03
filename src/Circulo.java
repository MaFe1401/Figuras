public class Circulo extends Figura {
    double radio;
    public Circulo (double r)
    {
        this.radio=r;
    }
    @Override
    public double area()
    {
        return Math.PI*radio*radio;
    }
}
