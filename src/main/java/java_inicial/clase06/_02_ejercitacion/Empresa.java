package java_inicial.clase06._02_ejercitacion;

import java.util.List;

public class Empresa {
	private List<Empleado> empleados;

	public Empresa(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	public void mostrarSalarios() {
		for (Empleado empleado : this.empleados) {
			System.out.println(empleado.getNombreCompleto() + ": " + empleado.mostrarSalario());
		}
	}

	public Empleado empleadoConMasClientes() {

		int maxClientes = 0;
		EmpleadoComision ecmc = null;

		for (Empleado empleado : this.empleados) {
			if (empleado instanceof EmpleadoComision) {
				EmpleadoComision eac = (EmpleadoComision) empleado;
				int cantidadClientes = eac.getClientes();

				if (cantidadClientes > maxClientes) {
					maxClientes = cantidadClientes;
					ecmc = eac;
				}
			}
		}
		return ecmc;
	}

	public void agregarEmpleado(Empleado empleado) {
		this.empleados.add(empleado);
	}
}