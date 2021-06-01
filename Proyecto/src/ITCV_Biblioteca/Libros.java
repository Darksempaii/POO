
package ITCV_Biblioteca;

import java.io.Serializable;

public class Libros implements Serializable {
    private int Codigo_Libro;
    private String Nombre_Libro;
    private String Editorial;
    private String Nombre_Autor;
    private String Genero;
    private int Numero_Paginas;
    private int Año_Edicion;
    
    public Libros(int Codigo_Libro, String Nombre_Libro, String Editorial, String Nombre_Autor, String Genero, int Numero_Paginas, int Año_Edicion) {
        this.Codigo_Libro = Codigo_Libro;
        this.Nombre_Libro = Nombre_Libro;
        this.Editorial = Editorial;
        this.Nombre_Autor = Nombre_Autor;
        this.Genero = Genero;
        this.Numero_Paginas = Numero_Paginas;
        this.Año_Edicion = Año_Edicion;
    }
    
    //Getters
    public int getCodigo_Libro() {
        return Codigo_Libro;
    }

    public String getNombre_Libro() {
        return Nombre_Libro;
    }

    public String getEditorial() {
        return Editorial;
    }

    public String getNombre_Autor() {
        return Nombre_Autor;
    }

    public String getGenero() {
        return Genero;
    }

    public int getNumero_Paginas() {
        return Numero_Paginas;
    }

    public int getAño_Edicion() {
        return Año_Edicion;
    }

    //Setters
    public void setCodigo_Libro(int Codigo_Libro) {
        this.Codigo_Libro = Codigo_Libro;
    }

    public void setNombre_Libro(String Nombre_Libro) {
        this.Nombre_Libro = Nombre_Libro;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public void setNombre_Autor(String Nombre_Autor) {
        this.Nombre_Autor = Nombre_Autor;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public void setNumero_Paginas(int Numero_Paginas) {
        this.Numero_Paginas = Numero_Paginas;
    }

    public void setAño_Edicion(int Año_Edicion) {
        this.Año_Edicion = Año_Edicion;
    }
    
    
}
