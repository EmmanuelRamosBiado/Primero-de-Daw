import java.util.Random;

public class Password {

	String contrase�a;

	public Password() {
		this.contrase�a = generarPassword();
	}

	public Password(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	public boolean esFuerte() {
		boolean valor = false;
		int contMin = 0;
		int contMay = 0;
		int contNum = 0;
		int contEsp = 0;

		char letra;

		for (int i = 0; i < contrase�a.length(); i++) {
			letra = contrase�a.charAt(i);

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

		if (this.contrase�a.length() >= 8 && contMin > 1 && contMay > 1 && contNum > 1 && contEsp > 1) {
			valor = true;
		}

		return valor;
	}

	private String generarPassword() {
		String contrase�a = "";
		Random rd = new Random();
		String aleatorio = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYX1234567890!#$%&'()*+,-./";

		int tama�o = rd.nextInt(15) + 10;
		
		for (int i = 0; i <= tama�o; i++) {
			contrase�a+=(aleatorio.charAt((int)(Math.random() * aleatorio.length())));
		}
		
		return contrase�a;
	}

	public String getPassword() {
		return contrase�a;
	}
}
