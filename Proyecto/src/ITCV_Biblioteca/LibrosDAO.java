package ITCV_Biblioteca;

import java.io.*;
import java.util.ArrayList;

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
            } catch (IOException e) {
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
            } while (true);
        } catch (ClassNotFoundException e) {
            System.err.println("No se pudo crear el arreglo de Objetos" + e);
        } catch (EOFException ex) {
            System.out.println("Cargando libros...");
        } catch (IOException es) {
            System.err.println("No se pudo crear el arreglo de Objetos" + es);
        }
        cerrarArchivoLectura();
        return lista;
    }

    public void abrirArchivoLectura() {
        try {
            entrada = new ObjectInputStream(new FileInputStream("Libros.obj"));

        } catch (IOException e) {
            System.err.println("Error al abrir el archivo de entrada de personas....");
        }
    }

    public void abrirArchivoEscritura() {
        try {
            salida = new ObjectOutputStream(new FileOutputStream("Libros.obj"));
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
