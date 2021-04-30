package SecuenciasDeCaracteres;

public class AplicacionGestionArchivosCaracteres {

    public static void main(String[] args) {
        GestiionArchivoCaracteres archivo = new GestiionArchivoCaracteres();
        archivo.escribirCaracteres("DatosPersonales.txt");
        archivo.leerCaracteres("DatosPersonales.txt");
        System.out.println("");
        archivo.escribirCaracteres("NuevosDatosPersonales.txt");
        archivo.leerCaracteres("NuevosDatosPersonales.txt");
    }

}
