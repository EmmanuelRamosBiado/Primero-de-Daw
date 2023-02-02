

/*
 * Pruebas de métodos en java
 */


public class EjemploMetodos {
	
	public static void main (String args[]) {
		
		EjemploMetodos.mostrar('*',5);
		EjemploMetodos.mostrar('A',15);
		EjemploMetodos.mostrar('>',10);
		
		int numero = 1;
		int tnumeros [] = { 1 };
		Miclase objeto = new Miclase();
		objeto.atributo = 1;
		String mensaje = "Hola";
		Integer numo = 1;
		
		incrementar(numero);
		incrementar(tnumeros);
		incrementar(objeto);
		cambiarString(mensaje);
		incrementar(numo);
		
		System.out.println( "La suma de 10 + 5 es "+suma(10,5)); 
		System.out.println(" Número =" + numero);
		System.out.println(" tabla de Número =" + tnumeros[0]);
		System.out.println(" Objecto atributo =" +objeto.atributo);
		System.out.println("  Mensaje = "+mensaje);
		System.out.println("  Integer = " + numo);
		
		System.out.println(" Suma de enteros "+ calcularSuma(10,20));
		System.out.println(" Suma de reales " + calcularSuma(10.0,20.0));
		
		System.out.println(" Sumar serie " + sumarSerie(2,4));
		System.out.println(" Sumar serie " + sumarSerie(2,4,8,12,-4));
		System.out.println(" Sumar serie " + sumarSerie());
		
		
		
	}
	
	public static void mostrar( char letra, int veces){
		
		for (int i=0; i <= veces; i++){
			System.out.print(letra);
		}
		System.out.println();
	}
	
	
	public static int suma (int a, int b){
	int valor;
	valor = a + b;
	return valor;
   }

	// Parámetro: tipo primitivos 
    // Paso por valor no puede modificar el parámetro
	public  static void incrementar ( int num ){
	
	   num = num +1;
	}
	// Parámetro una tabla
	// Paso por referencia puede modificar el parámetro
	public static  void incrementar  ( int tnum[]){
	
	 tnum[0]++;
    }
 
	// Parámetro un objeto
    // Paso por referencia puede modificar el parámetro
    public static void incrementar  ( Miclase obj ){
		
	  obj.atributo++;	
    }
    
    // Parámetro Integer no se puede alterar
    public static void incrementar ( Integer num) {
	
	   num++;	
	}
    
    // Parámetro String no se puede alterar
    public static void cambiarString ( String msg){
	  msg = "Adios";
	}
	// Sobrecarga del identificador de método calcularSuma
	static double calcularSuma ( double num1, double num2){
		return num1 + num2;
	}
	
	// Sobrecarga del identificador de método calcularSuma
	static int calcularSuma ( int num1, int num2 ){
		return num1 + num2;
	}
	
	// Ejemplo de método con un número variable de parámetros
	static int sumarSerie ( int...numeros){
	
			int suma = 0;
			// Se procesa somo si fuera una tabla de parámetros 
			for (int i= 0; i < numeros.length; i++){
				suma = suma + numeros[i];
			}
			return suma;
	}	
		
}

class Miclase {
   
   int atributo;	
	
}
