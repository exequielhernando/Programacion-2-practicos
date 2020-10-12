package Practico5.Ejercicio2;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private String apellido;
    private ArrayList<String> cualidades;
    private ArrayList<Alumno> familiaresEnColegio;
    private boolean esSangrePura;

    public Alumno(String nombre, String apellido, boolean esSangrePura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cualidades = new ArrayList<>();
        this.familiaresEnColegio = new ArrayList<>();
        this.esSangrePura = esSangrePura;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public boolean isEsSangrePura() {
        return esSangrePura;
    }
    //Verificamos si exite esa cualidad en el arreglo de cualidad
    public boolean tieneCualidad(String cualidad){
        if (cualidad != null){
            return cualidades.contains(cualidad.toLowerCase());
        }else{
            return false;
        }
    }
    //Agregamos cualidad
    public void agregarCualidad(String cualidad){
        if (!tieneCualidad(cualidad)){
            cualidades.add(cualidad.toLowerCase());
        }
    }
    //Verificamos si existe ese familiar en el arreglo
    public boolean tieneFamiliaresEnColegio(Casa casa) {
        for (int i = 0; i < this.familiaresEnColegio.size(); i++) {
            Alumno alumno = this.familiaresEnColegio.get(i);
            if (!casa.tieneAlumno(alumno)){
                return true;
            }
        }
        return false;
    }
    //Buscamos la cantidad de cualidades que tiene
    public int getCantidadCualidades(){
        return cualidades.size();
    }

    public boolean equals(Object o){
        try {
            Alumno aux = (Alumno) o;

            if (nombre.equals(aux.getNombre()) &&
                    apellido.equals(aux.getApellido()) &&
                    cualidades.size() == aux.getCantidadCualidades()) {
                for (int i = 0; i < cualidades.size(); i++) {
                    String cualidadi = cualidades.get(i);
                    if (!aux.tieneCualidad(cualidadi)){
                        return false;
                    }
                }
                return true;
            }else {
                return false;
            }

        }catch (Exception e){
            return false;
        }
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cualidades=" + cualidades +
                ", familiaresEnColegio=" + familiaresEnColegio +
                ", esSangrePura=" + esSangrePura +
                '}';
    }
}
