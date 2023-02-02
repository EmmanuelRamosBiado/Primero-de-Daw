
public class Alumno implements Comparable <Alumno>{
     int nummatricula;
     String nombre;
     float nota;
     
     
     public Alumno ( int nummatricula, String nombre, float nota){
       this.nombre = nombre;
       this.nota = nota;
       this.nummatricula = nummatricula;
     }
     
    public String toString () {
     
     return   String.format("%5d:%-10s:%5.2f",nummatricula,nombre,nota);
    }

	// Compara por numero de matricula
	public int compareTo(Alumno arg) {
		
		return this.nummatricula - arg.nummatricula;
	}
}
