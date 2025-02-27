package java_inicial.clase08;

public class Vehiculo {

	/**
	 * Clase que representa un vehículo. Contiene información básica como patente,
	 * marca y cilindrada.
	 */

	private String patente;
	private String marca;
	private int cilindrada;

	public Vehiculo(String patente, String marca, int cilindrada) {
		this.patente = patente;
		this.marca = marca;
		this.cilindrada = cilindrada;
	}

	// Métodos getters y setters

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
}
