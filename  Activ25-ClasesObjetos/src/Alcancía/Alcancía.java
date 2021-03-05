/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alcancía;

/**
 *
 * @author cesar
 */
public class Alcancía {
    //Variables de la clase
    private String Nombre;
    private int[] billetes = {0, 0, 0, 0, 0};
    private int[] cantidades = {20, 50, 100, 200, 500};

    //constructor de la clase Alcancia
    public Alcancía(String nom) {
        this.Nombre = nom;

    }

    @Override
    public String toString() {

        return "El ahorro total de " + Nombre + " es de: " + calcualarTotalAhorrado() + "\ny el total de billetes es de \n" + mostrarMonedas();
    }

    //metodo ahorrar
    public void ahorrar(int monto) {
        int Monto = monto;
        switch (Monto) {
            case 20:
                billetes[0]++;
                break;
            case 50:
                billetes[1]++;
                break;
            case 100:
                billetes[2]++;
                break;
            case 200:
                billetes[3]++;
                break;
            case 500:
                billetes[4]++;
                break;
            default:
                System.out.println("Monto Invalido intente, con otro monto");
                break;
        }
    }

    //metodo Mostrar ahorros indexados
    private String mostrarMonedas() {
        String mostrar = "";
        for (int i = 0; i < billetes.length; i++) {
            mostrar = mostrar + (cantidades[i] + "\t" + billetes[i] + "\n");
        }
        return mostrar;
    }

    //Metodo Calculo del total del ahorro
    private int calcualarTotalAhorrado() {
        int ahorro = 0;
        for (int i = 0; i < cantidades.length; i++) {
            for (int j = 1; j <= billetes[i]; j++) {
                ahorro = ahorro + cantidades[i];
            }
        }
        return ahorro;
    }

    //Metodo borrar ahorro
    public String romperAlcancia() {
        for (int i = 0; i < billetes.length; i++) {
            billetes[i] = 0;
        }
        //noAhorrado = 0;
        return Nombre + " haz roto la alcancia\n" + "Tu Ahorro es de " + calcualarTotalAhorrado() + "\ny tu total de billetes es de \n" + mostrarMonedas();
    }
}
