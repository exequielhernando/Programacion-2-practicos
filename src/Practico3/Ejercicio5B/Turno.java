package Ejercicio5B;

import java.time.LocalDate;

public class Turno {
	private LocalDate fechaInicioTurno;
	private LocalDate fechaFinTurno;
	private Peluquero peluquero;
	private Cliente cliente;
	public Turno(LocalDate fechaInicioTurno, LocalDate fechaFinTurno, Peluquero peluquero, Cliente cliente) {
		this.fechaInicioTurno = fechaInicioTurno;
		this.fechaFinTurno = fechaFinTurno;
		this.peluquero = peluquero;
		this.cliente = cliente;
	}
	
	
}
