package Practico4.Ejercicio1;

import Practico4.Ejercicio2.Timbre;

public class Alarma {
	private boolean isVidrioRoto;
	private boolean isPuertaAbierta;
	private boolean isVentanaAbierta;
	private boolean isMoviemientoEnLaCasa;
	private Timbre t;

	public Alarma() {
		isVidrioRoto = false;
		isPuertaAbierta = false;
		isVentanaAbierta = false;
		isMoviemientoEnLaCasa = false;
		t =  new Timbre();

	}

	public boolean isVidrioRoto() {
		return isVidrioRoto;
	}

	public void setVidrioRoto(boolean isVidrioRoto) {
		this.isVidrioRoto = isVidrioRoto;
	}

	public boolean isPuertaAbierta() {
		return isPuertaAbierta;
	}

	public void setPuertaAbierta(boolean isPuertaAbierta) {
		this.isPuertaAbierta = isPuertaAbierta;
	}

	public boolean isVentanaAbierta() {
		return isVentanaAbierta;
	}

	public void setVentanaAbierta(boolean isVentanaAbierta) {
		this.isVentanaAbierta = isVentanaAbierta;
	}

	public boolean isMoviemientoEnLaCasa() {
		return isMoviemientoEnLaCasa;
	}

	public void setMoviemientoEnLaCasa(boolean isMoviemientoEnLaCasa) {
		this.isMoviemientoEnLaCasa = isMoviemientoEnLaCasa;
	}
	public void comprobar() {
		if(isMoviemientoEnLaCasa == true || isPuertaAbierta == true || isVentanaAbierta == true || isVidrioRoto == true) {
			activarAlarma();
		}
	}
	public void activarAlarma() {
		t.hacerSonar();
	}
}
