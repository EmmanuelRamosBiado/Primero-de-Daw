import java.util.Random;

public class Password {

	String contraseña;

	public Password() {
		this.contraseña = generarPassword();
	}

	public Password(String contraseña) {
		this.contraseña = contraseña;
	}

	public boolean esFuerte() {
		boolean valor = false;
		int contMin = 0;
		int contMay = 0;
		int contNum = 0;
		int contEsp = 0;

		char letra;

		for (int i = 0; i < contraseña.length(); i++) {
			letra = contraseña.charAt(i);

			// Comparo el caracter usando la tabla ASCII
			if (letra >= 97 && letra <= 127) {
				contMin++;
			} else if (letra >= 65 && letra <= 90) {
				contMay++;
			} else if (letra >= 48 && letra <= 57) {
				contNum++;
			} else if (letra >= 33 && letra <= 47) {
				contEsp++;
			}
		}

		if (this.contraseña.length() >= 8 && contMin > 1 && contMay > 1 && contNum > 1 && contEsp > 1) {
			valor = true;
		}

		return valor;
	}

	private String generarPassword() {
		String contraseña = "";
		Random rd = new Random();
		String aleatorio = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYX1234567890!#$%&'()*+,-./";

		int tamaño = rd.nextInt(15) + 10;
		
		for (int i = 0; i <= tamaño; i++) {
			contraseña+=(aleatorio.charAt((int)(Math.random() * aleatorio.length())));
		}
		
		return contraseña;
	}

	public String getPassword() {
		return contraseña;
	}
}
