package java_inicial.clase05._01_ejemplos._informes_carreras.src;

import java.util.ArrayList;
import java.util.List;

public class Instituto {

	private List<Carrera> carreras;

	/*----------------------------------------------------------------------------*/

	public Instituto() {
		this.carreras = new ArrayList<>();
	}

	/*----------------------------------------------------------------------------*/

	public void agregarCarrera(Carrera carrera) {
		carreras.add(carrera);
	}

}
