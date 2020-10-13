package JuegoDado;

public class Main {
	public static void main(String[] args) {
		
		
			Juego juegoNuevo = new Juego("Luis", "Sebastian",8);
			Juego juegoOtro = new Juego("Matias", "Sebastian",6);
			
			juegoNuevo.jugar();
			
			juegoOtro.jugar();
			
			System.out.println(juegoNuevo);
			System.out.println(juegoOtro);
			
			Jugador j1 = new Jugador("Sebastian");
			
			Jugador j2 = new Jugador("Sebastian");
			j1=j2;
			//j1.incrementarPuntos();
			// SI SON EL MISMO OBJETO 
		// COMPARA OBJETOS ES DECIR DIRECCIONES DE MEMORIA
		System.out.println("SON IGUALES");

		System.out.println("SON IGUALES");


	}
}
