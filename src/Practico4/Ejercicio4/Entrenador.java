package Practico4.Ejercicio4;

public class Entrenador extends Persona {
    private int IDFederacion;
    public Entrenador(String nombre, String apellido, int nroPasaporte, int dia, int mes, int anio, int IDFederacion) {
        super(nombre, apellido, nroPasaporte, dia, mes, anio);
        this.IDFederacion = IDFederacion;
    }
    public int getIDFederacion(){ return IDFederacion; }
    @Override
    public String toString() {
        return super.toString() +
                "Federacion: " + getIDFederacion();
    }
}
