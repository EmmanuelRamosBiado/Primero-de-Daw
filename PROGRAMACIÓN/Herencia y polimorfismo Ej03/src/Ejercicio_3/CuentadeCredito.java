package Ejercicio_3;

public class CuentadeCredito extends Cuenta {

	private double saldonegativofijo;
	
	public CuentadeCredito(String Titular, double Saldo, double saldonegativo) {
		super(Titular, Saldo);
		this.saldonegativofijo = saldonegativo;
	}
}
