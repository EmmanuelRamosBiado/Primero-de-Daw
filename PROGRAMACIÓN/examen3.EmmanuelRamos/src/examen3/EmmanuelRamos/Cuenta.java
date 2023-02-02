package examen3.EmmanuelRamos;

public class Cuenta implements Comparable<Cuenta> {

	long numcuenta;
	String nombrecliente;
	float saldo;

	Cuenta(long numcuenta, String nombre, float saldo) {
		this.numcuenta = numcuenta;
		this.nombrecliente = nombre;
		this.saldo = saldo;
	}

	public String toString() {
		return String.format(" %10d,%10s, Saldo actual = %10.2f ", numcuenta, nombrecliente, saldo);
	}

	public float getSaldo() {
		return saldo;
	}

	public long getNumcuenta() {
		return numcuenta;
	}

	public int compareTo(Cuenta o) {
		return (Math.round(this.saldo - o.saldo));
	}

}