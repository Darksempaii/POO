package ITCV_Biblioteca;

import java.io.*;
import java.util.ArrayList;

public class LibrosDAO {

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
        ArrayList<Libros> listaLibros = new ArrayList();

        return listaLibros;
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
