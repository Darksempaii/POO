package SecuenciasDeCaracteres;

public class AplicacionGestionArchivosCaracteres {

    public static void main(String[] args) {
        GestiionArchivoCaracteres archivo = new GestiionArchivoCaracteres();
        archivo.escribirCaracteres("DatosPersonales.txt", "Cesar Enoc Rodriguez Villanueva \n15 de Mayo del 2001 \nCiudad Victoria, Tamaulipas");
        System.out.println(archivo.leerCaracteres("DatosPersonales.txt")+"\n");
        archivo.escribirCaracteres("NuevosDatosPersonales.txt", "Cesar Enoc Rodriguez Villanueva \n15 de Mayo del 2001 \nCiudad Victoria, Tamaulipas");
        System.out.println(archivo.leerCaracteres("NuevosDatosPersonales.txt"));
    }
}
