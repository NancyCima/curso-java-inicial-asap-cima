package java_inicial.clase05._01_ejemplos._informes_carreras.src;


public class AlumnoSimplificado {

	private String nombre;
	private String mail;

	/*----------------------------------------------------------------------------*/

	public AlumnoSimplificado(String nombre, String mail) {
		this.nombre = nombre;
		this.mail = mail;
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public String toString() {
		return "\n\t\t" + nombre + ", " + mail;
	}

}
