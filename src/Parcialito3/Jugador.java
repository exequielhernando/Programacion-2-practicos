package Practico4.Ejercicio1;

import java.time.LocalDate;
import java.time.Period;

public class Jugador {
	private String nombre; 
	private LocalDate fechaNacimiento;

	public Jugador(String nombre, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	public int getEdad() {
		LocalDate hoy = LocalDate.now();
		Period edad = Period.between(fechaNacimiento,hoy);
		return edad.getYears();
	}
	public boolean cumpleEdadMinima(Torneo t) {
		if (this.getEdad() >= t.getEdadMinima()) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
