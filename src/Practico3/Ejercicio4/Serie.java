package Practico3.Ejercicio4;

public class Serie {
	private String titulo;
	private String descripcion;
	private String creador;
	private String genero;
	private Temporada temporadas [];
	
	public Serie(String titulo, String descripcion, String creador, String genero, Temporada temporadas[]) {
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.creador = creador;
		this.genero = genero;
		this.temporadas = temporadas;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getCreador() {
		return creador;
	}

	public String getGenero() {
		return genero;
	}

	public Temporada[] getTemporadas() {
		return temporadas;
	}
	public int getTotalEpisodiosSerie() {
		int totalEpisodios = 0;
		for (int i = 0; i < temporadas.length; i++) {
			totalEpisodios += temporadas[i].getTotalEpisodiosVistosTemporada();
		}
		return totalEpisodios;
	}
	public double getPromedioSerie() {
		double promedioSerie;
		double totalPromedios = 0;
		for (int i = 0; i < temporadas.length; i++) {
			totalPromedios += temporadas[i].getPromedioTemporada();
		}
		promedioSerie = totalPromedios/temporadas.length;
		return promedioSerie;
	}
	public boolean isSerieVista() {
		boolean isSerieVista = false;
		int i = 0;
        return false;
	}
}
