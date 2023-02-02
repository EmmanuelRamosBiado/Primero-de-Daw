import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestArraylist {

	
	public static void  main ( String argv[]) {
		
		ArrayList  <Alumno> ar = new ArrayList <Alumno> ();
		
		// Método de interfaz Collection
		ar.add( new Alumno(9101, "Juan",  8.5f));
		ar.add( new Alumno(9010, "Eva",   7.7f));
		ar.add( new Alumno(9052, "Elena", 5.5f));
		ar.add( new Alumno(9023, "Pedro", 6.5f));
		
		// Recorrido como un array
		System.out.println("Recorrido de la lista 1º");
		for (int i=0; i < ar.size(); i++) {
			System.out.println(i+"->"+ ar.get(i));
	    }
	
		// Métodos de List 
	    ar.add(2, new Alumno(9030,"Andrés", 3.5f));
	    Alumno alr = ar.remove(1);
	    System.out.println(" El alumno eliminado "+alr);
	    
	    
	    System.out.println("Recorrido de la lista 2º");
	    for (int i=0; i < ar.size(); i++) {
			System.out.println(i+"->"+ar.get(i));
	    }
	
	    // Ordenación natural del objeto debe implementar el Interfaz Comparable  
	    Collections.sort(ar);
	   
	    System.out.println("Recorrido de la lista 3º ORDENADO por nº de matricula");
	    for ( Alumno al: ar) {
	    	System.out.println("->"+al);
	    }
		
	    // Ordenación mediante un comparador especifico 
	    ComparaPorNombre micomparador = new ComparaPorNombre();
	    Collections.sort(ar, micomparador);
	    System.out.println("Recorrido de la lista 4º ORDENADO por nombre");
	    for ( Alumno al: ar) {
	    	System.out.println("->"+al);
	    }
	    
	    // Expresión lambda ( novedad a partir de java 8 )
	    // Debe devolver un entero, no vale al1.nota - al2.nota son float, *100 Para no perder decimales
	    Collections.sort(ar, (al1, al2) ->  Math.round((al1.nota - al1.nota)*100) );
	    
	    System.out.println("Recorrido de la lista 4º ORDENADO por NOTA");
	    for ( Alumno al: ar) {
	    	System.out.println("->"+al);
	    }
	}
	    
}
