package Practico3.Ejercicio5B;
import java.time.LocalDate;

public class Peluquero extends Persona{

	public Peluquero(String nombre, String apellido, String dni) {
		super(nombre, apellido, dni);
	}
	
	public boolean isDisponible(LocalDate fechaTurno) {
		boolean isDisponible = false;
		return isDisponible;
	}
	
}
