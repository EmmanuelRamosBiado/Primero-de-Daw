// ---- PROGRAMAR EL RESTO DE LOS M�TODOS ----

public class CuentaBancaria {

	// -------------------------------------
	// Atributos de Clase
	// -------------------------------------

	private int saldo; // Saldo actual de la cuenta
	private int numMovimientos; // N�mero de movimientos realizados
	private static int numCuentas = 0; // N�mero de cuentas creadas

	// -------------------------------------
	// METODOS:
	// -------------------------------------

	// --METODOS EST�TICOS (CLASE)----------------------------
	public static int totalCuentas() {

		return numCuentas;
	}

	// --METODOS DE INSTANCIA (OBJETOS) ----------------------------
	// Constructores
	public CuentaBancaria(int saldo) {
		// Atributo de instancia (objeto)
		this.saldo = saldo;
		this.numMovimientos = 0;
		// Atributo de clase
		CuentaBancaria.numCuentas++;
	}

	public CuentaBancaria() {
		this(0); // Llamo al primer constructor
	}

	// Resto de los M�TODOS

	// Ingreso, incrementa el saldo en una cantidad indicada como par�metro.
	public void ingreso(int cantidad) {
		if (cantidad >= 0) {
			saldo += cantidad;
			numMovimientos++;
		} else {
			System.out.println("Ha inroducido un valor err�neo.");
		}
	}

	// Abono, decremento el saldo en la cantidad indicada como par�metro.
	public void abono(int cantidad) {
		if (cantidad >= 0 && cantidad <= saldo) {
			saldo -= cantidad;
			numMovimientos++;
		}
	}

	// Anotar gastos decrementa el saldo en 20 euros si
	// el saldo de la cuenta es menor 1000
	public void anotarGastos() {
		if (saldo < 1000) {
			saldo -= 20;
			numMovimientos++;
		}
	}

	// Anotar Intereses incrementa la cuenta seg�n valor de inter�s indicado
	// como par�metro en tanto por ciento.
	public void anotarIntereses(int interes) {
		saldo = saldo + ((saldo * interes) / 100);
		numMovimientos++;
	}

	// Realizar transferencia a cuenta, decrementa el saldo
	// en la cantidad indicada
	// como par�metro, realizando un ingreso en la cuenta destino.
	public void transferencia(int importe, CuentaBancaria destino) {
		if (importe <= saldo) {
			saldo -= importe;
			destino.ingreso(importe);
			numMovimientos++;
		}
	}

	// Consultar estado de la cuenta, mostr� el saldo actual y
	// el n�mero de operaciones realizadas
	public String consultarEstado() {
		return " Saldo = " + saldo + " N� operaciones = " + numMovimientos;
	}
}
