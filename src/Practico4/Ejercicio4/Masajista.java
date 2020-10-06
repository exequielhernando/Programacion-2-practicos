package Practico4.Ejercicio4;

public class Masajista extends Persona{
    private String titulo;
    private int aniosExperiencia;
    public Masajista(String nombre, String apellido, int nroPasaporte, int dia, int mes, int anio, String titulo, int aniosExperiencia) {
        super(nombre, apellido, nroPasaporte, dia, mes, anio);
        this.titulo = titulo;
        this.aniosExperiencia = aniosExperiencia;
    }
    public String getTitulo(){ return titulo; }
    public int getAniosExperiencia(){ return aniosExperiencia; }

    @Override
    public String toString() {
        return super.toString() +
                "Titulo: " + getTitulo() +
                "Años de experiencia: " + getAniosExperiencia();
    }
}
