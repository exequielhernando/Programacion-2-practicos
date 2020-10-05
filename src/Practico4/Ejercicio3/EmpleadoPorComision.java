package Practico4.Ejercicio3;

public class EmpleadoPorComision extends Empleado{
	
	private double totalVentas;
	private double porcentaje;
	
	public EmpleadoPorComision(String nombre, double sueldoFijo, double totalVentas, double porcentaje) {
		super(nombre, sueldoFijo);
		this.totalVentas = totalVentas;
		this.porcentaje = porcentaje;
	}

	public double getTotalVentas() {
		return totalVentas;
	}

	public void setTotalVentas(double totalVentas) {
		this.totalVentas = totalVentas;
	}

	public double getPorcentaje() {
		double porc = this.porcentaje/100;
		return porc;
	}

	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}

	@Override
	public double calcularSueldo() {
		double sueldo;
		sueldo = super.getSueldoFijo() + (this.getTotalVentas()*this.getPorcentaje());
		return sueldo;
	}
	@Override
	public String toString() {
		return "EmpleadoComision [ventas=" + totalVentas + ", porcentaje=" + porcentaje + ", Porcentaje ="
				+ getPorcentaje() + ", Ventas =" + getTotalVentas() + ", Salario =" + calcularSueldo() + "]";
	}
	
}
