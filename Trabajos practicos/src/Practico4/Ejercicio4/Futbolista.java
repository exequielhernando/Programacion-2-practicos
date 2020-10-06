package Practico4.Ejercicio4;

public class Futbolista extends Persona {
    private String posicion;
    private String piernaHabil;
    public Futbolista(String nombre, String apellido, int nroPasaporte, int dia, int mes, int anio, String posicion, String piernaHabil) {
        super(nombre, apellido, nroPasaporte, dia, mes, anio);
        this.posicion = posicion;
        this.piernaHabil = piernaHabil;
    }
    public String getPosicion(){ return posicion; }
    public String getPiernaHabil(){ return piernaHabil; }
    @Override
    public String toString() {
        return super.toString() +
                "Posicion: " + getPosicion() +
                "Pierna hábil: " + getPiernaHabil();
    }
}
