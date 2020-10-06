package Practico4.Ejercicio4;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String apellido;
    private int nroPasaporte;
    private LocalDate fechaNacimiento;
    private boolean isViajando;
    private boolean isConcentrando;
    private boolean isEnPaisDeOrigen;
    private String estado;
    public Persona(String nombre, String apellido, int nroPasaporte, int dia, int mes, int anio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nroPasaporte = nroPasaporte;
        this.fechaNacimiento = LocalDate.of(dia, mes, anio);
        this.isConcentrando = false;
        this.isViajando = false;
        this.isEnPaisDeOrigen = true;
        this.estado = getEstado();
    }
    public String getEstado(){
        if (isViajando){
            return "Viajando";
        }else if (isConcentrando){
            return "En concentracion";
        }else {
            return "En pais de origen";
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNroPasaporte() {
        return nroPasaporte;
    }

    public void setNroPasaporte(int nroPasaporte) {
        this.nroPasaporte = nroPasaporte;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean isViajando() {
        return isViajando;
    }

    public void setViajando(boolean viajando) {
        isViajando = viajando;
        if (isViajando){
            isConcentrando = false;
            isEnPaisDeOrigen = false;
        }
    }

    public boolean isConcentrando() {
        return isConcentrando;
    }

    public void setConcentrando(boolean concentrando) {
        isConcentrando = concentrando;
        if (isConcentrando){
            isViajando = false;
            isEnPaisDeOrigen = false;
        }
    }

    public boolean isEnPaisDeOrigen() {
        return isEnPaisDeOrigen;
    }

    public void setEnPaisDeOrigen(boolean enPaisDeOrigen) {
        isEnPaisDeOrigen = enPaisDeOrigen;
        if (isEnPaisDeOrigen){
            isConcentrando = false;
            isEnPaisDeOrigen = false;
        }
    }
    @Override
    public String toString() {
        return "Nombre: " + getNombre() +
                "Apellido: " + getApellido() +
                "Nro pasaporte: " + getNroPasaporte() +
                "Fecha de nacimiento: " + getFechaNacimiento();
    }
    public boolean isDisponible(){
        return (getEstado()=="En pais de origen");
    }
}
