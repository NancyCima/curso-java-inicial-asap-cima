package java_inicial.clase07._01_ejemplos.puerto_parana.src;


public class DeportivoLujo extends Deportivo {

	/**
	 * 
	 * @param matricula
	 * @param eslora
	 * @param anioFabricacion
	 * @param duenio
	 * @param valorBase
	 * @param valorAdicional
	 * @param potenciaMotor
	 * @param factorAerodinamico
	 */
	public DeportivoLujo(String matricula, double eslora, int anioFabricacion, String duenio, double valorBase,
			double valorAdicional, int potenciaMotor, int factorAerodinamico) {
		super(matricula, eslora, anioFabricacion, duenio, valorBase, valorAdicional, potenciaMotor, factorAerodinamico);
	}

	/**
	 * 
	 */
	@Override
	public double calcularConsumo() {
		return 2 * getPotenciaMotor() * GET_INDICE_CALCULO_POTENCIA();
	}
}
