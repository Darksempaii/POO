/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionPersonas;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author cesar
 */
public class PersonaDAO {

    ObjectOutputStream salida;
    ObjectInputStream entrada;

    public void escribirPersonas(ArrayList<Persona> personas) {

    }

    public ArrayList<Persona> leerPersonas() {
        ArrayList<Persona> listaPersona = new ArrayList();

        return listaPersona;
    }

    public void abrirArchivoLectura() {
        try {
            entrada = new ObjectInputStream(new FileInputStream("personas.ser"));
        } catch (IOException e) {
            System.err.println("Error al abrir el archivo de entrada de personas....");
        }
    }

    public void abrirArchivoEscritura() {
        try {
            salida = new ObjectOutputStream(new FileOutputStream("personas.ser"));
        } catch (IOException e) {
            System.err.println("Error al abrir el archivo de Salida de personas....");
        }
    }

    public void cerrarArchivoLectura() {
        try {
            if (entrada != null) {
                entrada.close();
            }
        } catch (IOException e) {
            System.err.println("Error al cerrar el archivo de entrada...");
            System.exit(1);
        }
    }

    public void cerrarArchivoEscritura() {
        try {
            if (salida != null) {
                salida.close();
            }
        } catch (IOException e) {
            System.err.println("Error al cerrar el archivo de salida...");
            System.exit(1);
        }
    }
}
