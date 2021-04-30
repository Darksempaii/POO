
package SecuenciasDeCaracteres;

import java.io.IOException;


public class AplicacionGestionArchivosCaracteres {


    public static void main(String[] args) throws IOException {
        GestiionArchivoCaracteres archivo = new GestiionArchivoCaracteres();
        archivo.escribirCaracteres();
        archivo.leerCaracteres();
    }
    
}
