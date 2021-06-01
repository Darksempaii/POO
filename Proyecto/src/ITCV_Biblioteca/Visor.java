package ITCV_Biblioteca;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Visor {

    public Visor() {
    }

    public void mostrarMensaje(String mensaje) {
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
            System.out.println("1.   Agregar");
            System.out.println("2.   Modificar");
            System.out.println("3.   Eliminar");
            System.out.println("4.   Mostrar catalago");
            System.out.println("5.   salir");
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, this, opcion));
            return opcion;
        }
    }
    
    public String solicitarEntrada(String mensaje) {
        return JOptionPane.showInputDialog(mensaje);
    }
}
