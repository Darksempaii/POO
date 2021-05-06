package activ64.secuenciasdecaracteresconbuffers;

import java.io.*;

public class GestionArchivosConBuffers {

    public GestionArchivosConBuffers() {
    }

    public void escribirCaracteres(String archivo1, String archivo2) {
        String leer = "";
        try {
            BufferedWriter salida = new BufferedWriter(new FileWriter(archivo2));
            BufferedReader entrada = new BufferedReader(new FileReader(archivo1));
            String cadena;
            while ((cadena = entrada.readLine()) != null) {
                leer = leer + cadena + "\n";
            }
            System.out.print(leer);
            salida.write(leer);
            entrada.close();
            salida.close();
        } catch (IOException e) {
            System.out.println("el archivo no se pudo escribir: " + e);
        }
    }
}
