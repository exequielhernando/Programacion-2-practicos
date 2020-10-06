package Practico4.Ejercicio4;

public class main {
    public static void main(String [] args){
        Persona e1 = new Entrenador("Marcelo", "Gallardo", 1234566, 1,2, 1978, 18);
        Persona j1 = new Futbolista("Lionel", "Messi", 12345123, 2, 2, 1980, "Delantero", "Izquierda");
        Persona j2 = new Futbolista("Sergio", "Aguero", 13255123, 12, 3, 1980, "Delantero", "Derecha");
        Persona j3 = new Futbolista("Lautaro", "Martinez", 1245124, 11, 4, 1999, "Delantero", "Derecha");
        Persona j4 = new Futbolista("Cristiano", "Ronaldo", 1675341, 14, 4, 1979, "Delantero", "Derecha");
        Persona m1 = new Masajista("Ruber", "Rada", 0321323, 5, 5, 1967, "Kinesiologo", 15);
        SeleccionDeFutbol argentina = new SeleccionDeFutbol("Argentina");
        argentina.addPersona(e1);
        argentina.addPersona(j1);
        argentina.addPersona(j2);
        argentina.addPersona(j3);
        argentina.addPersona(j4);
        argentina.addPersona(m1);

        argentina.toString();
    }
}
