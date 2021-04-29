package IOStream;

import java.io.*;


public class LeerArchivo {
    
    public void leer() {
        try {
            FileReader entrada = new FileReader("C:/Users/cesar/AppData/ejemplo.txt");
            int c = entrada.read();
            while (c!=-1) {                
                c = entrada.read();
                char letra =(char)c;
                System.out.print(letra);
            }
            entrada.close();
        } catch (IOException e) {
            System.out.println(e);
            System.out.println("El archivo no esta disponible");
        }
    }
}
