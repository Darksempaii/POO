
package Punto;


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
    
    public double distancia(){
        
        return 0;
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
