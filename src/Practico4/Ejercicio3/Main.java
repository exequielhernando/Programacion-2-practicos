package Practico4.Ejercicio3;

public class Main {

	public static void main(String[] args) {
		Empleado e1 = new Empleado("Exequiel", 20000);
		Empleado e2 = new EmpleadoPorComision("Sebastian", 40000, 10000, 10);
		Empleado e3 = new EmpleadoPorHora("Nahuel", 50000, 25, 300);
		Empresa e = new Empresa();
		e.addEmpleado(e1);
		e.addEmpleado(e2);
		e.addEmpleado(e3);
		e.mostrarSaldoAPagar();
	}

}
