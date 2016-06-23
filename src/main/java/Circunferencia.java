/**
 * Created by Damián on 23/6/2016.
 */
public class Circunferencia implements Figura{

    Punto<Double,Double> centro;
    Punto<Double,Double> radio;

    public Circunferencia(Punto<Double, Double> centro, Punto<Double, Double> radio) {
        this.centro = centro;
        this.radio = radio;
    }

    public double area() {
        return Math.PI * Math.sqrt(Math.abs(this.centro.coordenadaX - this.radio.coordenadaX));
    }
}
