package Practico4.Ejercicio2;

public class Sensor {
	private String zona;
	private boolean isDetectoMovimiento;
	
	public Sensor(String zona) {
		this.zona = zona;
		this.isDetectoMovimiento = false;
	}

	public String getZona() {
		return zona;
	}

	public boolean isDetectoMovimiento() {
		return isDetectoMovimiento;
	}

	public void setDetectoMovimiento(boolean isDetectoMovimiento) {
		this.isDetectoMovimiento = isDetectoMovimiento;
	}
	
}
