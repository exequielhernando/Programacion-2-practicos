package Practico4.Ejercicio1;

import java.util.ArrayList;

public class Club {
	private String nombre;
	private ArrayList<Torneo> torneos;
	
	public Club(String nombre) {
		this.nombre = nombre;
		torneos = new ArrayList<>();
	}
	public void asignarJugador(Jugador j) {
		for (int i = 0; i < torneos.size(); i++) {
			Torneo t = torneos.get(i);
			if(j.cumpleEdadMinima(t)) {
				t.agregarJugador(j);
			}
		}
	}
}
