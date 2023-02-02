import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Servidor Multihilo TCP, hace eco de lo que recibe
 */

public class ServerMTCP_Eliza {

	static HashMap<String, String> theliza = new HashMap<String, String>();
	static String msgPorDefecto = "Lo siento, no te comprendo.";

	public static void main(String args[]) {

		// Establecemos el número de puerto a utilizar.
		int serverPort = 4444;

		// Creamos una instancia para esperar las peticiones de los clientes.
		ServerSocket listenSocket;

		// Socket para conexión.
		Socket clientSocket;

		// Usamos la clase conection.
		Connection c;

		initHashMap(theliza);

		try {

			// Creamos el objeto para esperar peticiones de los clientes.
			listenSocket = new ServerSocket(serverPort);

			// CICLO DEL SERVIDOR
			while (true) {

				// Dejamos invocado el servidor esperando haste que un cliente
				// se conecte. clientSocket = Socket nuevo para comunicaciones.
				clientSocket = listenSocket.accept();
				System.out.println(
						" NUEVO CLIENTE: " + clientSocket.getInetAddress() + " PUERTO:" + clientSocket.getPort());
				// Se establece la conexión, y se vuelve a esperar un nuevo cliente.

			}

			// Control de excepciones.
		} catch (IOException e) {
			System.out.println("Error en socket: " + e.getMessage());
		}
	}

	public static void initHashMap(HashMap<String, String> th) {
		th.put("HOLA", "Hola, ¿qué tal?");
		th.put("ENCANTADO", "Encantado de conocerte yo también");
		th.put("ADIOS", "Adiós, espero volverte a ver pronto");
		th.put("HORA", "Los siento no llevo reloj");
		th.put("NOMBRE", "Mi nombre es Eliza");
		th.put("CACA", "Creo que tu lenguaje no es adecuado");
	}

	/**
	 *
	 * @author Iván Durango Hilo de ejecución que procesa cada una de la peticiones
	 */
	class Connection extends Thread {

		// Instanciamos los flujos de datos de entrada y salida,y el socket para
		// conexión.
		Socket clientSocket;
		BufferedReader entrada = null;
		PrintWriter salida = null;

		// No hace nada
		public static String procesarMensaje(String cadena) {

			HashMap<String, String> th = ServerMTCP_Eliza.theliza;

			String linea = cadena;

			linea = linea.toUpperCase();

			String respuesta = ServerMTCP_Eliza.msgPorDefecto;

			for (Map.Entry<String, String> entrada : th.entrySet()) {

				if (linea.contains(entrada.getKey())) {
					respuesta = entrada.getValue();
					break;
				}
			}
			return respuesta;

		}

		// Constructor.
		public Connection(Socket aSocket) {

			// Asocia el Socket(this) con el del cliente que conecta.
			clientSocket = aSocket;

			try {

				// Creamos los flujos de entrada y salida de datos, y lo se los
				// asociamos al socket cliente.
				// Establece canal de entrada
				entrada = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
				// Establece canal de salida
				salida = new PrintWriter(new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream())),
						true);

			} catch (IOException ex) {
				System.out.println("Error en conexion: " + ex.getMessage());
			}

			// Lanzamos el método run.
			this.start();
		}

		public void run() {

			try {

				while (true) {
					// Recibe los datos mandados por el cliente.
					String msg = entrada.readLine();
					System.out.println("Cliente: " + msg);
					salida.println(">>" + procesarMensaje(msg));
					// Si el mensaje es de terminar
					if (msg.toUpperCase().contains("ADIOS")) {
						salida.close();
						entrada.close();
						System.out.println("Fin de conexión");
						break;
					}

				}

				// Control de excepciones.
			} catch (Exception ex) {
				System.err.println(" Fin / Error de conexión." + clientSocket.getInetAddress() + "\n");
			}
		}
	}
}
