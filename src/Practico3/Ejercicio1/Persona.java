package Practico3.Ejercicio1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	private String fechaDeNacimiento; 
	private int dni;
	private String sexo;
	private float peso;
	private float altura;

	public Persona(int dni) {
		nombre = "N";
		apellido = "N";
		fechaDeNacimiento = "2000/01/01";
		sexo = "Femenino";
		peso = 1;
		altura = 1;
		this.dni = dni;
	}
	public Persona(int dni, String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		fechaDeNacimiento = "2000/01/01";
		sexo = "Femenino";
		peso = 1;
		altura = 1;
		this.dni = dni;
	}
	public Persona(int dni, String nombre, String apellido, String fechaDeNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = fechaDeNacimiento;
		sexo = "Femenino";
		peso = 1;
		altura = 1;
		this.dni = dni;
	}
	public Persona(String nombre, String apellido, String fechaDeNacimiento, int dni, String sexo, float peso,
			float altura) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = fechaDeNacimiento;
		edad = calcularEdad();
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}

	public int calcularEdad() {
		int age;
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaNac = LocalDate.parse(fechaDeNacimiento, fmt);
		LocalDate fechaHoy = LocalDate.now();
		Period periodo = Period.between(fechaNac, fechaHoy);	
		age = periodo.getYears();
		return age;
	}
	public float obtenerMasaCorporal() {
		float masaCorporal;
		masaCorporal = (peso/(altura*altura));
		return masaCorporal;	
	}
	public boolean estaEnForma() {
		final float MIN = 18.5f;
		final float MAX = 25f;
		boolean enForma = false;
		if(obtenerMasaCorporal()> MIN && obtenerMasaCorporal()< MAX) {
			enForma = true;
		}
		return enForma;
	}
	public boolean esSuCumpleanos() {
		boolean esSuCumpleanos = false;
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaNac = LocalDate.parse(fechaDeNacimiento, fmt);
		LocalDate fechaActual = LocalDate.now();
		if((fechaActual.getMonthValue() == fechaNac.getMonthValue()) && (fechaActual.getDayOfMonth()== fechaNac.getDayOfMonth())) {
			esSuCumpleanos = true;
		}
		return esSuCumpleanos;
	}
	public boolean esMayorDeEdad() {
		boolean esMayor = false;
		final int MINMAYORIAEDAD = 18;
		if(edad >= MINMAYORIAEDAD) {
			esMayor = true;
		}
		return esMayor;
	}
	public boolean puedeVotar() {
		boolean puedeVotar = false;
		final int MINEDADPARAVOTAR = 16;
		if(edad >= MINEDADPARAVOTAR) {
			puedeVotar = true;
		}
		return puedeVotar;
	}
	public void imprimirInformacionGeneral() {
		System.out.println("Nombre: " + this.nombre 
				+ "\nApellido: " + this.apellido
				+ "\nEdad: " + this.edad
				+ "\nFecha de Nacimiento: " + this.fechaDeNacimiento
				+ "\nDNI: " + this.dni
				+ "\nSexo: " + this.sexo
				+ "\nPeso: " + this.peso
				+ "\nAltura: " + this.altura
				+ "\nMasa corporal: " + obtenerMasaCorporal()
				+ "\nEsta en forma?: " + estaEnForma()
				+ "\nEs su cumpleaños?: " + esSuCumpleanos()
				+ "\nEs mayor de edad?: " + esMayorDeEdad()
				+ "\nPuede votar?: " + puedeVotar());
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}


}
