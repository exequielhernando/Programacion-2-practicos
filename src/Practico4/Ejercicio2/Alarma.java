package Practico4.Ejercicio2;

import java.util.ArrayList;

public class Alarma {
	private ArrayList<Sensor> sensores;
	private Timbre t;

	public Alarma() {
		this.sensores = new ArrayList<>();
		t =  new Timbre();
	}
	
	
	public ArrayList<Sensor> getSensores() {
		return sensores;
	}


	public void setSensores(ArrayList<Sensor> sensores) {
		this.sensores = sensores;
	}
	public void addSensor(Sensor sensor) {
		sensores.add(sensor);
	}

	public void comprobar() {
		for (int i = 0; i < sensores.size(); i++) {
			if(sensores.get(i).isDetectoMovimiento()) {
				System.out.println("Hay movimiento en la zona " + sensores.get(i).getZona());
				activarAlarma();
			}
		}
	}
	public void activarAlarma() {
		t.hacerSonar();
	}
}
