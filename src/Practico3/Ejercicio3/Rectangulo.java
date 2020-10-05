package Practico3.Ejercicio3;

public class Rectangulo {
	private int valorInicialVerticeX;
	private int valorInicialVerticeY;
	private int base;
	private int altura;
	private PuntoGeometrico vertice1;
	private PuntoGeometrico vertice2;
	private PuntoGeometrico vertice3;
	private PuntoGeometrico vertice4;
	
	public Rectangulo(int valorInicialVerticeX, int valorInicialVerticeY, int base, int altura) {
		this.valorInicialVerticeX = valorInicialVerticeX;
		this.valorInicialVerticeY = valorInicialVerticeY;
		this.base = base;
		this.altura = altura;
		armarRectangulo();
	}
	private void armarRectangulo() {
		vertice1 = new PuntoGeometrico(valorInicialVerticeX, valorInicialVerticeY);
		vertice2 = vertice1.desplazarPuntoEnElPlano(0,altura);
		vertice3 = vertice1.desplazarPuntoEnElPlano(base, 0);
		vertice4 = vertice4.desplazarPuntoEnElPlano(base, altura);
	}
	public Rectangulo desplazarRectangulo(int x, int y) {
		Rectangulo r1 = new Rectangulo((valorInicialVerticeX + x),(valorInicialVerticeY + y), base, altura);
		return r1;
	}
	public int calcularAreaRectangulo() {
		return base * altura;
	}
	public int compararRectangulo(Rectangulo r) {
		if(this.calcularAreaRectangulo() > r.calcularAreaRectangulo()) {
			return 1;
		}
		else if(this.calcularAreaRectangulo() < r.calcularAreaRectangulo()) {
			return -1;
		}
		else {
			return 0;
		}
	}
	public boolean esCuadrado() {
		boolean esCuadrado = false;
		if(base == altura) {
			esCuadrado = true;
		}
		return esCuadrado;
	}
	public int calcularLadoSuperior() {
		if(base > altura) {
			return base;
		}
		else {
			return altura;
		}
	}
	public boolean estaAcostado() {
		boolean estaAcostado = false;
		if(base > altura) {
			estaAcostado = true;
		}
		return estaAcostado;
	}
}
