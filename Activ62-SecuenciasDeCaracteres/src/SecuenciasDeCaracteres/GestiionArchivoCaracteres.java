package SecuenciasDeCaracteres;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestiionArchivoCaracteres {

    public GestiionArchivoCaracteres() {

    }

    public void escribirCaracteres(String archivo, String Datos) {
        try {
            FileWriter salida = new FileWriter(archivo);
            salida.write(Datos);
            salida.close();
        } catch (IOException ex) {
            Logger.getLogger(GestiionArchivoCaracteres.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("el archivo no se pudo escribir");
        }
    }

    public String leerCaracteres(String archivo) {
        String leer = "";
        try {
            FileReader entrada = new FileReader(archivo);
            int cadena;
            while ((cadena = entrada.read()) != -1) {
                leer = leer + (char)cadena;
            }
            entrada.close();
        } catch (IOException e) {
            Logger.getLogger(GestiionArchivoCaracteres.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("El archivo no esta disponible");
        }
        return leer;
    }
}
