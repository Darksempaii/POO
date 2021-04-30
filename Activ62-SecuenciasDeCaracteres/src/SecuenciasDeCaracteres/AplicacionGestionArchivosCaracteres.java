package SecuenciasDeCaracteres;

import java.io.IOException;

public class AplicacionGestionArchivosCaracteres {

    public static void main(String[] args) throws IOException {
        GestiionArchivoCaracteres archivo = new GestiionArchivoCaracteres();
        archivo.escribirCaracteres("DatosPersonales.txt");
        archivo.leerCaracteres("DatosPersonales.txt");
        System.out.println("");
        archivo.escribirCaracteres("NuevosDatosPersonales.txt");
        archivo.leerCaracteres("NuevosDatosPersonales.txt");
    }

}
