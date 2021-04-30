package SecuenciasDeCaracteres;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestiionArchivoCaracteres {

    public GestiionArchivoCaracteres() {

    }

    public void escribirCaracteres() {
        try {
            FileWriter salida = new FileWriter("DatosPersonales");
            salida.write("Cesar Enoc Rodriguez Villanueva \n15 de Mayo del 2001 \nCiudad Victoria, Tamaulipas");
            salida.close();
        } catch (IOException ex) {
            Logger.getLogger(GestiionArchivoCaracteres.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("el archivo no se pudo escribir");
        }
    }

    public void leerCaracteres() {
        try {
            BufferedReader entrada = new BufferedReader(new FileReader("DatosPersonales"));
            String cadena;
            while ((cadena = entrada.readLine()) != null) {
                System.out.println(""+ cadena);
            }
            entrada.close();
        } catch (IOException e) {
            Logger.getLogger(GestiionArchivoCaracteres.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("El archivo no esta disponible");
        }

    }
}
