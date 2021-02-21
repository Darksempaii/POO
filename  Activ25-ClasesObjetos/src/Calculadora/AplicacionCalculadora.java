
package Calculadora;


public class AplicacionCalculadora {

    
    public static void main(String[] args) {
        System.out.print("escribe un numero: ");
        Teclado a = new Teclado();
        System.out.println(a.obtenerEntrada());
        Pantalla p1 = new Pantalla();
        System.out.println(p1.mostrarMenu());
    }
   
}
