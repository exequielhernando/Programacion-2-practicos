package Practico4.Ejercicio2;

import Practico4.Ejercicio1.Luz;

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
