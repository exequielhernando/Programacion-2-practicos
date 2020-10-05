package Practico4.Ejercicio1;

public class AlarmaLuminosa extends Alarma {
	private Luz l;

	public AlarmaLuminosa() {
		super();
		l = new Luz();

	}
	@Override
	public void activarAlarma() {
		super.activarAlarma();
		l.encender();
	}
	
}
