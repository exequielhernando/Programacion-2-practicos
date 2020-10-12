package Practico5.Ejercicio2;

public class CasaLinaje extends Casa {

    public CasaLinaje(String nombre, int cantMaxAlumnos) {
        super(nombre, cantMaxAlumnos);
    }

    @Override
    public boolean aceptaAlumno(Alumno a) {
        return super.aceptaAlumno(a)&& a.isEsSangrePura() && a.tieneFamiliaresEnColegio(this);
    }



}
