package JuegoDado;

public class Dado {
	private int cara;
	private int cantidadCaras;

	public Dado() {
		this.cantidadCaras = 6;
		tirar();
	}
	public Dado(int cantidadCaras) {
		this.setCantidadCaras(cantidadCaras);
		tirar();
	}

	public int getCara() {
		return cara;
	}

	public int getCantidadCaras() {
		return cantidadCaras;
	}

	public void setCantidadCaras(int cantidadCaras) {
		if (cantidadCaras <= 0) {
			cantidadCaras = 6;
		}
		this.cantidadCaras=cantidadCaras;
		tirar();
	}

	public int tirar() {
		cara =  (int)  (Math.random()*cantidadCaras)+1;
		return cara;
	}
}
