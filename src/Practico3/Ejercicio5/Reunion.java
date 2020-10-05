package Practico3.Ejercicio5;

import java.util.ArrayList;

public class Reunion {
	private String lugar;
	private String tema;
	private double duracion;
	private ArrayList<Usuario> participantes;
	private String telefonos[];
	private String mail[];
	
	public Reunion(String lugar, String tema, double duracion, ArrayList<Usuario> participantes) {
		this.lugar = lugar;
		this.tema = tema;
		this.duracion = duracion;
		this.participantes = participantes;
	}
	
	public ArrayList<Usuario> getParticipantes() {
		return participantes;
	}
	
	public void setParticipantes(ArrayList<Usuario> participantes) {
		this.participantes = participantes;
	}
	
	
	
}
