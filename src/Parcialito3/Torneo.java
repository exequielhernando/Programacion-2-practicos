package Practico4.Ejercicio1;

import java.util.ArrayList;

public class Torneo {
	private String nombre;
	private int edadMinima;
	private ArrayList<Jugador> jugadores;
	
	public Torneo(String nombre, int edadMinima) {
		this.nombre = nombre;
		this.edadMinima = edadMinima;
		jugadores = new ArrayList<>();
	}
	public void agregarJugador(Jugador j) {
		this.jugadores.add(j);
	}
	public int getEdadMinima() {
		return edadMinima;
	}
}
