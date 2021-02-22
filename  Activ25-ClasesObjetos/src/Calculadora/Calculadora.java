package Calculadora;

public class Calculadora {

    private static Pantalla P = new Pantalla();
    private static teclado t1 = new teclado();

    public Calculadora() {
    }

    public static void ejecutar() throws InterruptedException {
        do {
            int m = 0;
            System.out.print(P.mostrarMenu());
            m = t1.obtenerInt();
            System.out.println("");
            switch (m) {
                case 1:
                    Calculadora.suma();
                    break;
                case 2:
                    Calculadora.resta();
                    break;
                case 3:
                    Calculadora.multiplicar();
                    break;
                case 4:
                    Calculadora.dividir();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:

                    break;
            }
        } while (true);
    }

    private static void suma() throws InterruptedException {
        float resultado = 0;
        System.out.print("ingresa el primer numero: ");
        float a = t1.obtenerFloat();
        System.out.print("\ningresa el segundo numero: ");
        float b = t1.obtenerFloat();
        resultado = a + b;
        System.out.println(P.mostrarResultado(resultado));
        Thread.sleep(1000);
    }

    private static void resta() throws InterruptedException {
        
    }

    private static void multiplicar() throws InterruptedException {
        
    }

    private static void dividir() throws InterruptedException {
        
    }
}
