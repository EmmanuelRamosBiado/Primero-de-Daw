/**
 * Clase que implementa una cefetera 
 * @author Emmanuel Ramos Biado
 *
 */
public class Cafetera implements Comparable <Cafetera>{
	
	/**
	 * int que indica la capacidad m�xima
	 */
	private int capacidadM�xima;
	
	/**
	 * int que indica la capacidad actual
	 */
	private int capacidadActual;
	
	/**
	 * 
	 * @param capacidadM�xima - Es la cantidad m�xima que recibe
	 * @param cantidad - Es la cantidad que tiene la cafetera
	 */
	Cafetera( int capacidadM�xima, int cantidad){
		this.capacidadM�xima = capacidadM�xima;
		this.capacidadActual = (capacidadM�xima > cantidad)? cantidad: capacidadM�xima;
	}
	
	/**
	 * Constructor que se usa cuando no recibe ning�n par�metro
	 */
	Cafetera (){
		this(1000,0);
	}
	
	/**
	 * Constructor que se usa cuando s�lo recibe la capacidad m�xima
	 * @param valor
	 */
	Cafetera( int valor){
		this(valor,0);
	}
	
	
	/**
	 * Sirve para obtener la capcidad m�xima
	 * @return int con la capacidad m�xima
	 */
	public int getCapacidadM�xima() {
		return capacidadM�xima;
	}

	/**
	 * Sirve para obtener la capacidad actual
	 * @return int con la capacidad actual
	 */
	public int getCapacidadActual() {
		return capacidadActual;
	}
	
	/**
	 * Llena la cafetera hasta el m�ximo
	 */
	public void llenarCafetera(){
		capacidadActual = capacidadM�xima;
	}
	
	/**
	 * Vac�a la cafetera
	 */
	public void vaciarCafetera(){
		capacidadActual = 0;
	}
	
	/**
	 * Vac�a la cafetera con una cantidad indicada
	 * @param vtaza - N�mero que indica la cantidad de caf� que se va a servir
	 */
	public void servirTaza ( int vtaza){
		capacidadActual -= vtaza;
		if ( capacidadActual <0) capacidadActual = 0;
	}
	
	/**
	 * Llena de caf� la cafetera con una cantidad indicada
	 * @param vcafe - Cantidad de caf� que se le a�ade a la cafetera
	 */
	public void agregarCafe ( int vcafe){
		capacidadActual += vcafe;
		if ( capacidadActual > capacidadM�xima) capacidadActual = capacidadM�xima;
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