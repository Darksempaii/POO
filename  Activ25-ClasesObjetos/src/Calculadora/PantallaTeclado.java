
package Calculadora;
import java.util.Scanner;

public class Pantalla {
    private int a = 0;
    
    public Pantalla(){
    
    }

    protected String mostrarMensaje(){
        return "hola " + a;
    }
    
    public String mostrarLineaMensaje(){
        
        return "";
    }
    public String mostrarResultado(){
        
        return "";
    }
    public String mostrarMenu(){
        
        return "regrese menu";
    }
}

public class Teclado {

    private int entrada;
    public Teclado(){
        Scanner sc = new Scanner(System.in);
        this.entrada = sc.nextInt();
    }
    
    public int obtenerEntrada(){
        return entrada;
    }
}
