package Practico4.Ejercicio1;

public class Main {
	public static void main(String[] args) {
		Alarma a = new Alarma();
		AlarmaLuminosa al = new AlarmaLuminosa();
		
		a.comprobar();
		a.setMoviemientoEnLaCasa(true);
		a.comprobar();
		
		al.comprobar();
		al.setMoviemientoEnLaCasa(true);
		al.comprobar();
	}
}
