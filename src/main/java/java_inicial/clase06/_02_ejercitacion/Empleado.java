package java_inicial.clase06._02_ejercitacion;

public abstract class Empleado {

	private int dni;
	private String nombre;
	private String apellido;
	private Integer ingreso;
	private double salario;

	public Empleado(int dni, String nombre, String apellido, int ingreso, double salario) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.ingreso = ingreso;
		this.salario = salario;
	}

	public abstract double mostrarSalario();

	public String getNombreCompleto() {
		return this.nombre + " " + this.apellido;
	}

	/* Getters y Setters */

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getIngreso() {
		return ingreso;
	}

	public void setIngreso(Integer ingreso) {
		this.ingreso = ingreso;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}