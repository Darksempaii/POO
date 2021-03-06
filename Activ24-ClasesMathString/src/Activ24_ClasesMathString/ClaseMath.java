package Activ24_ClasesMathString;

import java.util.Random;

public class ClaseMath {

    public static void main(String[] args) {
        Random rGenerador = new Random();
        int jugador1;
        int jugador2;
        jugador1 = rGenerador.nextInt(6) + 1;
        jugador2 = rGenerador.nextInt(6) + 1;
        System.out.println("Jugador 1: "+jugador1+"\njugador 2: "+jugador2);
        System.out.println("El numero mayor es: "+Math.max(jugador1, jugador2));
    }

}
