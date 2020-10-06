package Ejercicio5B;

import java.time.LocalDate;

public class Peluqueria {
	
	private Peluquero p1;
	private Peluquero p2;
	private Peluquero p3;
	private Peluquero p4;
	private Cliente [] clientes;
	private int cantidadClientes;
	private Turno [] turnos;
	
	public Peluqueria(String nombre1, String apellido1, String dni1,String nombre2, String apellido2, String dni2,
			String nombre3, String apellido3, String dni3, String nombre4, String apellido4, String dni4,
			int cantidadClientes) {
		p1 = new Peluquero(nombre1, apellido1, dni1);
		p1 = new Peluquero(nombre2, apellido2, dni2);
		p1 = new Peluquero(nombre3, apellido3, dni3);
		p1 = new Peluquero(nombre4, apellido4, dni4);
		this.cantidadClientes = 10;
		clientes = new Cliente[cantidadClientes];
		Turno [] turnos = new Turno[40];
	}
	
	public void agregarTurno(Peluquero p1, Cliente c1, LocalDate fechaInicioTurno, LocalDate fechaFinTurno) {
		for (int i = 0; i < turnos.length; i++) {
			if (turnos[i] == null) {
				turnos[i] = new Turno(fechaInicioTurno, fechaFinTurno, p1, c1);
			}
			else {
				System.out.println("No hay turnos disponibles");
			}
		}
	}
	
}	
