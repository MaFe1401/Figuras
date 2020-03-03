public class GestorFiguras {

    public double suma (Figura[] x){
        double res=0;
        for (int i=0; i<x.length; i++){
            res= res+x[i].area();
        }
        return res;

    }

}
