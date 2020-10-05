package Practico4.Ejercicio1;

public class Luz {
	
	private boolean isLuzEncendida;
	
	public Luz() {
		isLuzEncendida = false;
	}

	public boolean isLuzEncendida() {
		return isLuzEncendida;
	}

	public void setLuzEncendida(boolean isLuzEncendida) {
		this.isLuzEncendida = isLuzEncendida;
	}
	public void encender() {
		System.out.println("Se encendioo la luzz");
		setLuzEncendida(true);
	}
}
