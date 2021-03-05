package Calculadora;

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