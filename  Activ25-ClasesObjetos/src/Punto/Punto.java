
package Punto;

import java.text.DecimalFormat;


public class Punto {
    private double x, y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "{" + x + " , " + y + '}';
    }
    
public double distancia(Punto p) throws Exception{
        if (p == null)
            throw new Exception("Ups! Debe inicializar el objeto punto");
        double diferenciaX = x - p.getX();
        double diferenciaY = y - p.getY();
        double respuesta = Math.sqrt(Math.pow(diferenciaX, 2) + Math.pow(diferenciaY, 2));
        return respuesta;
    }
    
    //Getter`s
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    //Setter`s
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}
