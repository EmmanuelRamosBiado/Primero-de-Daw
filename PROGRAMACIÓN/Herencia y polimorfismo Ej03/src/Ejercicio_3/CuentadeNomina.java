package Ejercicio_3;

public class CuentadeNomina extends Cuenta {

	private double nomina;
	
	public CuentadeNomina(String Titular, double Saldo, double nomina) {
		super(Titular, Saldo);
		this.nomina = nomina;
	}
}
