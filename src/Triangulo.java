public class Triangulo extends Figura {
    double b;
    double h;
    public Triangulo (double base, double altura)
    {
        this.b=base;
        this.h=altura;
    }
    @Override
    public double area() {
        return (b*h)/2;
    }
}
