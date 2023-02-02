/**
 * Clase que implementa una cefetera 
 * @author Emmanuel Ramos Biado
 *
 */
public class Cafetera implements Comparable <Cafetera>{
	
	/**
	 * int que indica la capacidad máxima
	 */
	private int capacidadMáxima;
	
	/**
	 * int que indica la capacidad actual
	 */
	private int capacidadActual;
	
	/**
	 * 
	 * @param capacidadMáxima - Es la cantidad máxima que recibe
	 * @param cantidad - Es la cantidad que tiene la cafetera
	 */
	Cafetera( int capacidadMáxima, int cantidad){
		this.capacidadMáxima = capacidadMáxima;
		this.capacidadActual = (capacidadMáxima > cantidad)? cantidad: capacidadMáxima;
	}
	
	/**
	 * Constructor que se usa cuando no recibe ningún parámetro
	 */
	Cafetera (){
		this(1000,0);
	}
	
	/**
	 * Constructor que se usa cuando sólo recibe la capacidad máxima
	 * @param valor
	 */
	Cafetera( int valor){
		this(valor,0);
	}
	
	
	/**
	 * Sirve para obtener la capcidad máxima
	 * @return int con la capacidad máxima
	 */
	public int getCapacidadMáxima() {
		return capacidadMáxima;
	}

	/**
	 * Sirve para obtener la capacidad actual
	 * @return int con la capacidad actual
	 */
	public int getCapacidadActual() {
		return capacidadActual;
	}
	
	/**
	 * Llena la cafetera hasta el máximo
	 */
	public void llenarCafetera(){
		capacidadActual = capacidadMáxima;
	}
	
	/**
	 * Vacía la cafetera
	 */
	public void vaciarCafetera(){
		capacidadActual = 0;
	}
	
	/**
	 * Vacía la cafetera con una cantidad indicada
	 * @param vtaza - Número que indica la cantidad de café que se va a servir
	 */
	public void servirTaza ( int vtaza){
		capacidadActual -= vtaza;
		if ( capacidadActual <0) capacidadActual = 0;
	}
	
	/**
	 * Llena de café la cafetera con una cantidad indicada
	 * @param vcafe - Cantidad de café que se le añade a la cafetera
	 */
	public void agregarCafe ( int vcafe){
		capacidadActual += vcafe;
		if ( capacidadActual > capacidadMáxima) capacidadActual = capacidadMáxima;
	}

    /**
     * Compara
     * @param o - Otra cafetera
     * @result int con la diferencia de capacidad
     */
	public int compareTo(Cafetera o) {	
		return this.capacidadActual - o.capacidadActual;
	}
	
	
}