package Practico3.Ejercicio4;

public class Episodio {
	private String titulo;
	private String descripcion;
	private boolean capVisto; 
	private int calificacion;
	public Episodio(String titulo, String descripcion) {
		this.titulo = titulo;
		this.descripcion = descripcion;
		capVisto = false;
		calificacion = -1;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public boolean isCapVisto() {
		return capVisto;
	}
	public void setCapVisto(boolean capVisto) {
		this.capVisto = capVisto;
	}
	public int getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(int calificacion) {
		if(calificacion >= 1 && calificacion <=5) {
			this.calificacion = calificacion;
		}
		else {
			System.out.println("El valor ingresado es incorrecto");
		}
	}
	
}
