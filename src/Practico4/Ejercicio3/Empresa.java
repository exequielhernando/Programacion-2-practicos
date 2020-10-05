package Practico4.Ejercicio3;

import java.util.ArrayList;

public class Empresa {
	private ArrayList<Empleado> empleados;

	public Empresa() {
		this.empleados = new ArrayList<>();
	}

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}
	public void addEmpleado(Empleado e) {
		empleados.add(e);
	}
	public void mostrarSaldoAPagar() {
		for (int i = 0; i < empleados.size(); i++) {
			System.out.println("Nombre: " + empleados.get(i).getNombre() + " | Saldo a pagar: " + empleados.get(i).calcularSueldo());
		}
	}
}
