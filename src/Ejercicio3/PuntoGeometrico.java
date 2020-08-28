package Ejercicio3;

public class PuntoGeometrico {
	private int x;
	private int y;

	public PuntoGeometrico(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public PuntoGeometrico() {
		x = 0;
		y = 0;
	}
	
	public void desplazarPuntoEnElPlano(int x, int y) {
		this.x += x;
		this.y += y;
	}
	public int calcularDistanciaEuclidea(int x, int y) {
		int distancia = (int) Math.sqrt((Math.pow((this.x-x), 2)) + (Math.pow((this.y - y), 2) ));
		return distancia;
	}
}
