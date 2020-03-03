public class Rectangulo extends Figura {
    double l1;
    double l2;
    public Rectangulo(double lado1, double lado2){
        this.l1=lado1;
        this.l2=lado2;
    }
    @Override
    public double area() {
        return l1*l2;
    }
}


