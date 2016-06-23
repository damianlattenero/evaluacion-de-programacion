/**
 * Created by damian on 20/05/16.
 */
public class Cuadrilatero implements Figura{


    public Punto<Double,Double> esquinaInferiorIzquierda;
    public Punto<Double,Double> esquinaSuperiorDerecha;

    public Cuadrilatero(Punto p1, Punto p2) {
        this.esquinaInferiorIzquierda = p1;
        this.esquinaSuperiorDerecha = p2;
    }

    public double area() {
        double ladoX = Math.abs(this.esquinaInferiorIzquierda.coordenadaX - this.esquinaSuperiorDerecha.coordenadaX);
        double ladoY = Math.abs(this.esquinaInferiorIzquierda.coordenadaY - this.esquinaSuperiorDerecha.coordenadaY);
        return ladoX * ladoY;


    }

  /*  public int perimetro() {
        int ladoX = Math.abs(this.esquinaInferiorIzquierda.coordenadaX - this.esquinaSuperiorDerecha.coordenadaX);
        int ladoY = Math.abs(this.esquinaInferiorIzquierda.coordenadaY - this.esquinaSuperiorDerecha.coordenadaY);
        return ladoX * 2 + ladoY * 2;
    }*/
}
