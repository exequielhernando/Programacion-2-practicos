package Practico5.Ejercicio2;

public class CasaEnemiga extends Casa{
    private Casa casaEnemiga;

    public CasaEnemiga(String nombre, int cantMaxAlumnos,Casa casaEnemiga) {
        super(nombre, cantMaxAlumnos);
        this.casaEnemiga = casaEnemiga;
    }

    @Override
    public boolean aceptaAlumno(Alumno a) {
        return super.aceptaAlumno(a) && !this.casaEnemiga.cumpleCualidades(a);
    }
}
