package Practico4.Ejercicio3;

public class Empleado {
	
	private String nombre;
	private double sueldoFijo;
	
	public Empleado(String nombre, double sueldoFijo) {
		this.nombre = nombre;
		this.sueldoFijo = sueldoFijo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSueldoFijo() {
		return sueldoFijo;
	}
	public void setSueldoFijo(double sueldoFijo) {
		this.sueldoFijo = sueldoFijo;
	}
	public double calcularSueldo() {
		return getSueldoFijo();
	}
	@Override
	public String toString() {
		return "Empleado [ Salario =" + calcularSueldo() + "]";
	}
}
