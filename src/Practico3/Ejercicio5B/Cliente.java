package Practico3.Ejercicio5B;

import java.time.LocalDate;
import java.time.Period;

public class Cliente extends Persona{
	private LocalDate fechaUltimaVisita;
	
	public Cliente(String nombre, String apellido, String dni) {
		super(nombre, apellido, dni);
		fechaUltimaVisita = null;
	}
	
	public boolean isClienteFrecuente(LocalDate fechaTurno) {
		boolean isClienteFrecuente = false;
		Period periodo = Period.between(fechaUltimaVisita, fechaTurno);	

		if(periodo.getDays() < 30) {
			isClienteFrecuente = true;
		}
		else {
        }
		return isClienteFrecuente;
	}
	public LocalDate getFechaUltimaVisita() {
		return this.fechaUltimaVisita;
	}
	public void setFechaUltimaVisita(LocalDate fechaTurno) {
		this.fechaUltimaVisita = fechaTurno;
	}
}
