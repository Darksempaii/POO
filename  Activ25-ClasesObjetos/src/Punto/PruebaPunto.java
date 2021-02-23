package Punto;

import java.text.DecimalFormat;

public class PruebaPunto {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("###.##");
        Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(5, 3);
        Punto p3 = new Punto((p1.getX() + p2.getX()) / 2, (p1.getY() + p2.getY()) / 2);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        try {
            System.out.println("Distancia p1 a p2: " + df.format(p1.distancia(p3)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
