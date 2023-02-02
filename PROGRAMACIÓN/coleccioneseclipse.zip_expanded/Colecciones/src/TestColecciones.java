/**
 *      TestColecciones
 *      
 *      Muestras los métodos más importantes de la colecciones con dos implementaciones
 *      List -> ArrayList ( Lista implementada por un array )
 *      Set  -> TreeSet   ( Conjunto ordenado )
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestColecciones {

	public static void main(String[] args) {
		/*
		 * Creo dos colecciones con distintas implementaciones pero que ámbas tienen 
		 * interfaz común Collection, es decir tiene los mismos métodos
		 */
		
		Collection<String> lista     = new ArrayList<String>();
		Collection<String> conjunto  = new TreeSet<String>();

		/*********  LIST ***************************/
		
		System.out.println(" OPERACIONES SOBRE UNA LISTA");
		
		lista.add("Pepe");
		lista.add("Luis");
		lista.add("Ana");
		lista.add("Luis");
		
		System.out.println(" Nº de elementos ="+lista.size());
		
		if ( lista.contains("Pepe") ) System.out.println(" Contiene a Pepe");
		
		lista.remove("Pepe"); // Usa método equals 
		
		if ( !lista.contains("Pepe") ) System.out.println("No contiene a Pepe");
		
		// Recorrido de una coleccion foreach
		System.out.println(" Contenido de la lista: 1º");
		for ( String cadena: lista) {
			System.out.println(">"+cadena);
		}
		// Borrar los elementos con longitud igual a 3 ( Ana)
		lista.removeIf(cadena -> cadena.length() == 3);
		
		System.out.println(" Contenido de la lista: 2º");
		// Recorrido con un Iterador
		Iterator<String>  itl = lista.iterator();
		while (itl.hasNext()) {
			System.out.println(itl.next());
			//it.remove();  con un iterador puedo eliminar elementos, con un for no
		}
		
		System.out.println(" Nº de elementos ="+lista.size());
		
		/********************** SET ***********************************/
		
		System.out.println(" \n OPERACIONES SOBRE UN CONJUNTO");
		
		conjunto.add("Pepe");
		conjunto.add("Luis");
		conjunto.add("Ana");
		conjunto.add("Luis");
		
		System.out.println(" Nº de elementos ="+conjunto.size());
		
		if ( conjunto.contains("Pepe") ) System.out.println(" Contiene a Pepe");
		
		conjunto.remove("Pepe");
		
		if ( !lista.contains("Pepe") ) System.out.println("No contiene a Pepe");
		
		// Recorrido de una coleccion foreach
		System.out.println(" Contenido del conjunto: 1º");
		for ( String cadena: conjunto) {
			System.out.println(">"+cadena);
		}
		// Borrar los elementos con longitud igual a 3 ( Ana)
		conjunto.removeIf(cadena -> cadena.length() == 3);
		
		System.out.println(" Contenido del conjunto: 2º");
		// Recorrido con un Iterador
		Iterator<String>  its = conjunto.iterator();
		while (its.hasNext()) {
			System.out.println(its.next());
			//it.remove();  con un iterador puedo eliminar elementos, con un for no
		}
		
		System.out.println(" Nº de elementos ="+conjunto.size());
		
		lista.addAll(conjunto);   // Añado todos los elementos del conjunto a la lista (HAY REPES)
		System.out.println(" Contenido de la lista: 3º");
		for ( String cadena: lista) {
			System.out.println(">"+cadena);
		}
		
		conjunto.addAll(lista); // Añado todos los elementos de la lista al conjunto (NO HAY REPES)
		System.out.println(" Contenido de la Conjunto: 3º");
		for ( String cadena: conjunto) {
			System.out.println(">"+cadena);
		}
		
		
		
	}

}
