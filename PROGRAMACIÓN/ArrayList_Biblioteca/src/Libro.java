
/**
 * Write a description of class Libro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Libro
{
    // instance variables - replace the example below with your own
    int id; // Identificador o clave del libro
    String titulo;
    String autor;
    Genero genero;
    int    edicion;
    
    Libro siguiente;

    /**
     * Constructor for objects of class Libro
     */
    public Libro( int id, String titulo, String Autor, Genero genero, int edicion)
    {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.edicion = edicion;
        this.siguiente = null;
    }
    
    public String toString(){
        return titulo+", "+autor+", "+ genero +", "+ edicion + ".";
    }

}
