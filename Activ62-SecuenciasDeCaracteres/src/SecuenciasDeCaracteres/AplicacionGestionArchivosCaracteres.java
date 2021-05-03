package SecuenciasDeCaracteres;

public class AplicacionGestionArchivosCaracteres {

    public static void main(String[] args) {
        GestiionArchivoCaracteres archivo = new GestiionArchivoCaracteres();
        archivo.escribirCaracteres("DatosPersonales.txt");
        System.out.println(archivo.leerCaracteres("DatosPersonales.txt"));
        System.out.println("");
        archivo.escribirCaracteres("NuevosDatosPersonales.txt");
        System.out.println(archivo.leerCaracteres("NuevosDatosPersonales.txt"));
    }

}
