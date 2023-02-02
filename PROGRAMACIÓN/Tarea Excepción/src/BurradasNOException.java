
public class BurradasNOException extends Exception {
	/**
	 * Lanza un mensaje e indica la palabra obscena que el usuario ha introducido
	 * @param valor - Es una de las palabras obscenas 
	 */
	public BurradasNOException(String valor) {
		super("Error, no se permite lenguaje obsceno. Has introducido: " + valor);
	}
}
