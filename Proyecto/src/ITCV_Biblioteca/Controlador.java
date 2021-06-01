package ITCV_Biblioteca;

import java.util.ArrayList;
import java.util.Iterator;

public class Controlador {

    Visor visor;
    LibrosDAO modelo;
    ArrayList listaP;

    public Controlador(Visor visor, LibrosDAO modelo) {
        this.visor = visor;
        this.modelo = modelo;
        listaP = modelo.leerLibros();
//        visor.mostrarMensaje("\nCATALOGO DE PERSONAS");
//        visor.mostrarCatalogo(listaP);
        while (true) {
            realizarAcciones(visor.menuOpciones());
        }
    }

    public void eliminar(int indice) {
        listaP.remove(indice);
    }

    public void modificar(int indice) {
        Libros p;
        int Codigo_Libro = Integer.parseInt(visor.solicitarEntrada("NUEVO codigo del libro: "));
        String Nombre_Libro = visor.solicitarEntrada("NUEVO Nombre del libro: ");
        String Editorial = visor.solicitarEntrada("NUEVA Editorial: ");
        String Nombre_Autor = visor.solicitarEntrada("NUEVO Autor: ");
        String Genero = visor.solicitarEntrada("NUEVO Genero: ");
        int Numero_Paginas = Integer.parseInt(visor.solicitarEntrada("NUEVA Cantidad de Paginas: "));
        int Año_Edicion = Integer.parseInt(visor.solicitarEntrada("NUEVO Año de Edicion: "));
        p = new Libros(Codigo_Libro, Nombre_Libro, Editorial, Nombre_Autor, Genero, Numero_Paginas, Año_Edicion);
        listaP.set(indice, p);
    }

    public void insertar() {
        int Codigo_Libro = Integer.parseInt(visor.solicitarEntrada("NUEVO codigo del libro: "));
        String Nombre_Libro = visor.solicitarEntrada("NUEVO Nombre del libro: ");
        String Editorial = visor.solicitarEntrada("NUEVA Editorial: ");
        String Nombre_Autor = visor.solicitarEntrada("NUEVO Autor: ");
        String Genero = visor.solicitarEntrada("NUEVO Genero: ");
        int Numero_Paginas = Integer.parseInt(visor.solicitarEntrada("NUEVA Cantidad de Paginas: "));
        int Año_Edicion = Integer.parseInt(visor.solicitarEntrada("NUEVO Año de Edicion: "));
        Libros p = new Libros(Codigo_Libro, Nombre_Libro, Editorial, Nombre_Autor, Genero, Numero_Paginas, Año_Edicion);
        listaP.add(p);
        visor.mostrarMensaje("Se a incertado el libro " + Nombre_Libro + " del Autor " + Nombre_Autor + " con Codigo "+ Codigo_Libro);
    }

    public int buscarLibro(String nombre, String autor) {

        int indice = 0;
        Iterator recorrerLista = listaP.iterator();
        Libros p;
        System.out.println("Voy a buscar a la persona" + nombre + "" + autor);
        while (recorrerLista.hasNext()) {
            p = (Libros) recorrerLista.next();
            if (p.getNombre_Libro().equals(nombre) && p.getNombre_Autor().equals(autor)) {
                System.out.println("La encontre en la pocision" + indice);
                return indice;
            }
            indice++;
        }
        return indice;
    }

    public void realizarAcciones(int opcion) {
        int indice;

        switch (opcion) {

            case 1:
                insertar();
                break;

            case 2:
                indice = buscarLibro(visor.solicitarEntrada("Nombre: "), visor.solicitarEntrada("Apellido: "));

                if (indice != 1) {
                    modificar(indice);
                } else {
                    visor.mostrarMensajeError("La persona no exixte!!");

                }

                break;

            case 3:
                indice = buscarLibro(visor.solicitarEntrada("Nombre: "), visor.solicitarEntrada("Autor: "));

                if (indice != 1) {
                    eliminar(indice);
                } else {
                    visor.mostrarMensajeError("El libro que buscastes no exixte!!");

                }

                break;

            case 4:
                visor.mostrarMensaje("\tCATALOGO PERSONA");
                visor.mostrarCatalogo(listaP);
                break;

            case 5:
                modelo.escribirPersonas(listaP);
                System.exit(0);
                break;

            default:
                visor.mostrarMensajeError("La opcion debe ser 1,2,3,4,5");
        }
    }
}
