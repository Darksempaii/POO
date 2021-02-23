package Calculadora;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Pantalla {

    public Pantalla() {}

    public String mostrarMensaje(String a) {
        return a;
    }

    public String mostrarLineaMensaje(String a) {
        return "\n"+a;
    }

    public String mostrarResultado(float R) {
        DecimalFormat df = new DecimalFormat("###.##");
        System.out.println(df.format(R));
        return "";
    }

    public String mostrarMenu() {
        System.out.println("Menu de opciones");
        System.out.println("\t1.Suma\n\t2.Resta\n\t3.Multiplicar\n\t4.dividir\n\t5.Salir");
        return "introduce tu opcion: ";
    }
}

public class teclado {

    private static float entrada;

    public teclado() {
        teclado.entrada = 0;
    }

    private static void leerTeclado() throws InterruptedException {
        teclado.entrada = 0;
            Scanner sc = new Scanner(System.in);
            try {
                teclado.entrada = sc.nextFloat();
            } catch (Exception e) {
                System.out.println("ingresastes un dato no valido. intentalo de nuevo");
                System.out.println(e);
                Thread.sleep(1500);
            }
    }

    public Float obtenerFloat() {
        teclado.leerTeclado();
        return entrada;
    }

    public int obtenerInt() {
        teclado.leerTeclado();
        int a = (int) teclado.entrada;
        return a;
    }
}
