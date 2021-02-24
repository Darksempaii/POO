
package Punto;

public class Linea {
   private Punto p1;
   private Punto p2;

    public Linea(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    @Override
    public String toString() {
        return "("+ p1 + " , " + p2 + ')';
    }
    
    public double calcularLongitud() throws Exception {
     return p1.distancia(p2);
    }
   
    public Punto getP1() {
        return p1;
    }

    public Punto getP2() {
        return p2;
    }

    public void setP1(Punto P1) {
        this.p1 = P1;
    }

    public void setP2(Punto p2) {
        this.p2 = p2;
    }
   
   
    
}
