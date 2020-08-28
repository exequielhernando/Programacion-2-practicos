package Ejercicio2;

public class Electrodomestico {
	private String nombre;
	private double precioBase;
	private String color;
	private int consumoEnergetico;
	private double peso;

	public Electrodomestico(String nombre) {
		this.nombre = nombre;
		precioBase = 100;
		color = "Gris Plata";
		consumoEnergetico = 10;
		peso = 2;
	}

	public Electrodomestico(String nombre, double precioBase) {
		this.nombre = nombre;
		this.precioBase = precioBase;
		color = "Gris Plata";
		consumoEnergetico = 10;
		peso = 2;
	}

	public Electrodomestico(String nombre, double precioBase, String color) {
		this.nombre = nombre;
		this.precioBase = precioBase;
		this.color = color;
		consumoEnergetico = 10;
		peso = 2;

	}

	public Electrodomestico(String nombre, double precioBase, String color, int consumoEnergetico) {
		this.nombre = nombre;
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		peso = 2;
	}

	public Electrodomestico(String nombre, double precioBase, String color, int consumoEnergetico, double peso) {
		this.nombre = nombre;
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getConsumoEnergetico() {
		return consumoEnergetico;
	}
	public void setConsumoEnergetico(int consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public boolean esBajoConsumo() {
		boolean esBajoConsumo = false;
		final int MAXCONSUMO = 45;
		if(consumoEnergetico < MAXCONSUMO) {
			esBajoConsumo = true;
		}
		return esBajoConsumo;
	}
	public double calcularBalance() {
		return precioBase/peso;
	}
	public boolean esAltaGama() {
		boolean esAltaGama = false;
		final int MINGAMA = 3;
		if(calcularBalance() > MINGAMA) {
			esAltaGama = true;
		}
		return esAltaGama;
	}
	public void mostrarInformacion() {
		System.out.println("Nombre: " + this.nombre
				+ "\nPrecio de base: " + this.precioBase + " Pesos"
				+ "\nColor: " + this.color
				+ "\nConsumo energetico: " + this.consumoEnergetico + "Kw"
				+ "\nPeso " + this.peso + "kg"
				+ "\nEs bajo consumo? " + esBajoConsumo()
				+ "\nBalance " + calcularBalance()
				+ "\nEs alta gama? " + esAltaGama());
	}
}
