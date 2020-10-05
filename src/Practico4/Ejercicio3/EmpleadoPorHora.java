package Practico4.Ejercicio3;

public class EmpleadoPorHora extends Empleado{

	private double horasExtras;
	private double montoExtra;

	public EmpleadoPorHora(String nombre, double sueldoFijo, double horasExtras, double montoExtra) {
		super(nombre, sueldoFijo);
		this.horasExtras = horasExtras;
		this.montoExtra = montoExtra;
	}

	public double getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(double horasExtras) {
		this.horasExtras = horasExtras;
	}

	public double getMontoExtra() {
		return montoExtra;
	}

	public void setMontoExtra(double montoExtra) {
		this.montoExtra = montoExtra;
	}
	@Override
	public double calcularSueldo() {
		return super.getSueldoFijo() + (this.horasExtras * this.montoExtra);
	}
	@Override
	public String toString() {
		return "EmpleadoComision [horasExtras=" + horasExtras + ", montoExtra=" + montoExtra + ", Salario =" + calcularSueldo() + "]";
	}

}
