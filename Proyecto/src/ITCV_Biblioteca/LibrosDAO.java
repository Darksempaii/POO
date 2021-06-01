package ITCV_Biblioteca;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LibrosDAO {

    Security_Module Secure = new Security_Module();
    ObjectOutputStream salida;
    ObjectInputStream entrada;

    public void escribirLibros(ArrayList<Libros> Libro) {
        abrirArchivoEscritura();
        Libros p;
        for (int i = 0; i < Libro.size(); i++) {
            p = (Libros) Libro.get(i);
            try {
                if (p != null) {
                    salida.writeObject(p);
                }
            } catch (Exception e) {
                System.out.println("error al escribir libros");
            }
        }
        cerrarArchivoEscritura();
    }

    public ArrayList<Libros> leerLibros() {
        abrirArchivoLectura();
        ArrayList<Libros> lista = new ArrayList();
        Libros p;
        try {
            do {
              p = (Libros) entrada.readObject();
                if (p != null) {
                    lista.add(p);
                }
            } while (entrada != null);
            cerrarArchivoLectura();
        } catch (Exception e){ 
            System.err.println("No se pudo crear el arreglo de Objetos" + e);
        }
        return lista;
    }

    public void abrirArchivoLectura() {
        try {
            entrada = new ObjectInputStream(new FileInputStream("Libros.aes"));

        } catch (IOException e) {
            System.err.println("Error al abrir el archivo de entrada de personas....");
        }
    }

    public void abrirArchivoEscritura() {
        try {
            salida = new ObjectOutputStream(new FileOutputStream("Libros.aes"));
        } catch (IOException e) {
            System.err.println("Error al abrir el archivo de Salida de Libros....");
        }
    }

    public void cerrarArchivoLectura() {
        try {
            if (entrada != null) {
                entrada.close();
            }
        } catch (IOException e) {
            System.err.println("Error al cerrar el archivo de entrada...");
        }
    }

    public void cerrarArchivoEscritura() {
        try {
            if (salida != null) {
                salida.close();
            }
        } catch (IOException e) {
            System.err.println("Error al cerrar el archivo de salida...");
        }
    }
}
