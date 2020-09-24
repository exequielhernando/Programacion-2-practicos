package Ejercicio4;

public class Temporada {
	private Episodio episodios [];
	private String nombre;
	public Temporada(Episodio[] episodios, String nombre) {
		this.episodios = episodios;
		this.nombre = nombre;
	}
	public Episodio[] getEpisodios() {
		return episodios;
	}
	public void setEpisodios(Episodio[] episodios) {
		this.episodios = episodios;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTotalEpisodiosVistosTemporada() {
		int totalEpisodios = 0;
		for (int i = 0; i < episodios.length; i++) {
			if(episodios[i].isCapVisto() == true) {
				totalEpisodios++;	
			}
			
		}
		return totalEpisodios;
	}
	public double getPromedioTemporada() {
		double promedioTemporada;
		int calificacionTemporada = 0;
		for (int i = 0; i < episodios.length; i++) {
			if(episodios[i].isCapVisto() == true) {
				calificacionTemporada += episodios[i].getCalificacion();
			}
		}
		promedioTemporada = calificacionTemporada/getTotalEpisodiosVistosTemporada();
		return promedioTemporada;
	}
	public boolean isEpisodiosTemporadaVistos() {
		boolean isEpisodiosVistos = false;
		int i = 0;
		while(i > episodios.length) {
			if (episodios[i].isCapVisto() == true) {
				isEpisodiosVistos = true;
			}
			else {
				isEpisodiosVistos = false;
				break;
			}
			i++;
		}
		return isEpisodiosVistos;
	}
}
