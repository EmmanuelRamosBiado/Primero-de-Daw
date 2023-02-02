package Ejercicio_3;

public class Cuenta {

	private String Titular;
	protected double Saldo;

	public Cuenta(String nombre, double cantidad) {
		this.Titular = nombre;
		this.Saldo = cantidad;
	}

	public double reintegro(double cantidad) {
		return Saldo -= cantidad;
	}

	public double ingreso(double valor) {
		return Saldo += valor;
	}

	public String toString() {
		return "Titular: " + Titular + " Saldo: " + Saldo + " Euros";
	}

}
