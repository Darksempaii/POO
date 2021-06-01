package ITCV_Biblioteca;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Visor {

    public Visor() {
    }

    public void mostrarMensajeJO(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, " ", JOptionPane.DEFAULT_OPTION);
    }
    
    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }

    public void mostrarMensajeError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, " ", JOptionPane.ERROR_MESSAGE);
    }

    public void mostrarCatalogo(ArrayList listaLibros) {
        ArrayList<Libros> listaP = listaLibros;
        if (listaP != null) {
            for (int i = 0; i < listaP.size(); i++) {
                System.out.println(listaP.get(i).getCodigo_Libro()+"\t"+listaP.get(i).getNombre_Libro()+"\t"+listaP.get(i).getEditorial()+"\t"+listaP.get(i).getNombre_Autor()+"\t"+listaP.get(i).getGenero()+"\t"+listaP.get(i).getNumero_Paginas()+"\t"+listaP.get(i).getAño_Edicion());
            }
        }
    }
    
    public int menuOpciones() {
        int opcion = 0;
        while (true) {
            System.out.println("\nGestion de Libros");
            System.out.println("1.   Ingresar un libro al catálogo.");
            System.out.println("2.   Modificar la información de un libro previamente registrado en el catálogo");
            System.out.println("3.   Eliminar a un libro del catálogo.");
            System.out.println("4.   Consultar la información de todos los libros del catálogo.");
            System.out.println("5.   salir");
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese una opcion", opcion));
            return opcion;
        }
    }
    
    public String solicitarEntrada(String mensaje) {
        return JOptionPane.showInputDialog(mensaje);
    }
}
