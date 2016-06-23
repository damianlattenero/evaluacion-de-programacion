import java.util.ArrayList;
import java.util.List;

/**
 * Created by Damián on 23/6/2016.
 */
public class Main {
    public static void main(String[] args) {
        Punto<Integer, Integer> miQueridoPunto = new Punto(2,3);
        Punto<Punto<Boolean,String>, Integer>
                otro = new Punto( new Punto(true,"casa") , 3 );
        Punto<Boolean,String> coordenadaXOtro = otro.coordenadaX;
        String coordenadaYDeCoordenadaXDeOtro = coordenadaXOtro.coordenadaY;
        System.out.println(otro.coordenadaX.coordenadaY);
        System.out.println(miQueridoPunto.coordenadaX);

        List<Circunferencia> figuras = new ArrayList<Circunferencia>();


    }
}
