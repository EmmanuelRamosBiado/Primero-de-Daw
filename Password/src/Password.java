import java.util.Random;

public class Password {

	String contraseņa;

	public Password() {
		this.contraseņa = generarPassword();
	}

	public Password(String contraseņa) {
		this.contraseņa = contraseņa;
	}

	public boolean esFuerte() {
		boolean valor = false;
		int contMin = 0;
		int contMay = 0;
		int contNum = 0;
		int contEsp = 0;

		char letra;

		for (int i = 0; i < contraseņa.length(); i++) {
			letra = contraseņa.charAt(i);

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

		if (this.contraseņa.length() >= 8 && contMin > 1 && contMay > 1 && contNum > 1 && contEsp > 1) {
			valor = true;
		}

		return valor;
	}

	private String generarPassword() {
		String contraseņa = "";
		Random rd = new Random();
		String aleatorio = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYX1234567890!#$%&'()*+,-./";

		int tamaņo = rd.nextInt(15) + 10;
		
		for (int i = 0; i <= tamaņo; i++) {
			contraseņa+=(aleatorio.charAt((int)(Math.random() * aleatorio.length())));
		}
		
		return contraseņa;
	}

	public String getPassword() {
		return contraseņa;
	}
}
