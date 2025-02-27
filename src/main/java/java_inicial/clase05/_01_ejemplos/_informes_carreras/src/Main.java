package java_inicial.clase05._01_ejemplos._informes_carreras.src;

public class Main {

	public static void main(String[] args) {

		// Creo las materias
		Materia orgEmpresarialAprobada = new Materia("Organizacion Empresarial", "2019-01", Estado.APROBADA);
		Materia orgEmpresarialEnCurso = new Materia("Organizacion Empresarial", "2019-01", Estado.EN_CURSO);
		Materia introInformaticaAprobada = new Materia("Introduccion a la Informatica", "2019-01", Estado.APROBADA);

		// Creo los alumnos
		Alumno fernanda = new Alumno("Fernanda", "fernanda@mail.com");
		Alumno luis = new Alumno("Luis", "luis@mail.com");
		Alumno facundo = new Alumno("Facundo", "facundo@mail.com");
		Alumno melina = new Alumno("Melina", "melina@mail.com");

		fernanda.agregarMateria(orgEmpresarialEnCurso);
		luis.agregarMateria(introInformaticaAprobada);
		facundo.agregarMateria(introInformaticaAprobada);
		facundo.agregarMateria(orgEmpresarialAprobada);
		luis.agregarMateria(orgEmpresarialAprobada);

		// Creo las carreras
		Carrera analistaDeSistemas = new Carrera();
		Carrera biotecnologia = new Carrera();

		// Creo alumnos a las carreras
		analistaDeSistemas.agregarAlumno(fernanda);
		analistaDeSistemas.agregarAlumno(luis);
		analistaDeSistemas.agregarAlumno(facundo);

		// Creo Instituto
		Instituto instituto = new Instituto();
		instituto.agregarCarrera(analistaDeSistemas);
		instituto.agregarCarrera(biotecnologia);

		/*----------------------------------------------------------------------------*/

		// Test ejercicio
		analistaDeSistemas.mostrarInformeMaxMaterias();

	}

}
