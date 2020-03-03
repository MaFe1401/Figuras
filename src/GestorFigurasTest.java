import java.util.Arrays;
import java.util.Comparator;

public class GestorFigurasTest
{
    public static void main (String [] args)
    {
        Figura[] vec = new Figura[4];
        vec[0]= new Rectangulo(2,3);
        vec[1]= new Circulo(5);
        vec[2]= new Triangulo(4,2);
        vec[3]= new Cuadrado(3);
        GestorFiguras g = new GestorFiguras();
        double s=g.suma(vec);
        System.out.println("La suma de las areas es "+ s);
        Arrays.sort(vec);
        int i=0;
        while(i<vec.length)
        {
            System.out.println(vec[i].area());
            i++;
        }

    }

}
