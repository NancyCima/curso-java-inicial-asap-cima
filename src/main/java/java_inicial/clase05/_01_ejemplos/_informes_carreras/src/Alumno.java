package java_inicial.clase05._01_ejemplos._informes_carreras.src;


import java.util.ArrayList;
import java.util.List;

public class Alumno {

	private String nombre;
	private String mail;
	private List<Materia> materias;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param nombre
	 * @param mail
	 */
	public Alumno(String nombre, String mail) {
		this.nombre = nombre;
		this.mail = mail;
		this.materias = new ArrayList<>();
	}

	/*----------------------------------------------------------------------------*/

	public void agregarMateria(Materia materia) {
		this.materias.add(materia);
	}

	public String getNombre() {
		return nombre;
	}

	public String getMail() {
		return mail;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @return
	 */
	public int getCantMateriasAprobadas() {
		int cant = 0;
		for (Materia materia : this.materias) {
			if (materia.getEstado() == Estado.APROBADA) {
				cant++;
			}
		}
		return cant;
	}

}
