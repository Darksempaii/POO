package Alcancía;

public class AplicacionAlcancia {

    public static void main(String[] args) throws InterruptedException {
        //declaracion de Objetos
        Alcancía alcanciaDeJose = new Alcancía("Jose");
        Alcancía alcanciaDeMaria = new Alcancía("Maria");
        //Ingreso de ahorros de jose
        alcanciaDeJose.ahorrar(200);
        alcanciaDeJose.ahorrar(200);
        alcanciaDeJose.ahorrar(50);
        //Ingreso de ahorros de maria
        alcanciaDeMaria.ahorrar(200);
        alcanciaDeMaria.ahorrar(100);
        alcanciaDeMaria.ahorrar(20);
        alcanciaDeMaria.ahorrar(20);
        alcanciaDeMaria.ahorrar(20);
        alcanciaDeMaria.ahorrar(20);
        //muestra de ahorros
        System.out.println(alcanciaDeJose);
        Thread.sleep(500);
        System.out.println(alcanciaDeMaria);
        Thread.sleep(500);
        //Vaciado de alcancias
        System.out.println(alcanciaDeJose.romperAlcancia());
        Thread.sleep(500);
        System.out.println(alcanciaDeMaria.romperAlcancia());
        Thread.sleep(500);

        //Fin del programa
        System.exit(0);
    }

}
