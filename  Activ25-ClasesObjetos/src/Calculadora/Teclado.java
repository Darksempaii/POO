
package Calculadora;

import java.util.Scanner;


public class Teclado {

    private static float entrada;

    public Teclado() {
        Teclado.entrada = 0;
    }

    private static void leerTeclado() throws InterruptedException {
        Teclado.entrada = 0;
            Scanner sc = new Scanner(System.in);
            try {
                Teclado.entrada = sc.nextFloat();
            } catch (Exception e) {
                System.out.println("ingresastes un dato no valido. intentalo de nuevo");
                System.out.println(e);
                Thread.sleep(1500);
            }
    }

    public Float obtenerFloat() throws InterruptedException {
        Teclado.leerTeclado();
        return entrada;
    }

    public int obtenerInt() throws InterruptedException {
        Teclado.leerTeclado();
        int a = (int) Teclado.entrada;
        return a;
    }
}
