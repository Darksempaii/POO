package IOStream;

import java.io.*;

public class EscribirArchivo {

    public void leerstatic() {
        
        try {
            FileReader entrada = new FileReader("C:/Users/cesar/AppData/ejemplo.txt");
            int c = entrada.read();
            while (c!=-1) {                
                c = entrada.read();
                char letra =(char)c;
                System.out.print(letra);
            }
        } catch (IOException e) {
            System.out.println(e);
            System.out.println("El archivo no esta disponible");
        }
    }
}
