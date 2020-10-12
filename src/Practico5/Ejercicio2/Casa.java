package Practico5.Ejercicio2;

import java.util.ArrayList;

public class Casa {
    private String nombre;
    private ArrayList<String> cualidadesRequeridas;
    private int cantMaxAlumnos;
    private ArrayList<Alumno> alumnos;

    public Casa(String nombre,int cantMaxAlumnos) {
        this.nombre = nombre;
        this.cualidadesRequeridas = new ArrayList<>();
        this.cantMaxAlumnos = cantMaxAlumnos;
        this.alumnos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantMaxAlumnos() {
        return cantMaxAlumnos;
    }

    public boolean tieneAlumno(Alumno a) {
        return  alumnos.contains(a);
    }

    //Verificamos que la cualidad existe o no en nuestro arreglo
    public boolean tieneCualidadRequerida(String cualidad){
        if (cualidad != null){
            return cualidadesRequeridas.contains(cualidad.toLowerCase());
        }else{
            return false;
        }
    }
    //Agregamos una nueva cualidad
    public void agregarCualidadRequerida(String cualidad){
        if (!tieneCualidadRequerida(cualidad)){
            cualidadesRequeridas.add(cualidad.toLowerCase());
        }
    }
    //Agregamos un alumno
    public void agregarAlumno(Alumno a){
        if (aceptaAlumno(a)){
               this.alumnos.add(a);
        }
    }
    public boolean aceptaAlumno(Alumno a){
        return (this.isCasaLlena() && this.cumpleCualidades(a));
    }
    //Verificamos si el alumno cumple con las cualidades exigidas por nuestra casa
    public boolean cumpleCualidades(Alumno alumno){
        for (int i = 0; i < this.cualidadesRequeridas.size(); i++) {
            String cualidadi = this.cualidadesRequeridas.get(i);
            if (!alumno.tieneCualidad(cualidadi)){
                return false;
            }
        }
        return true;
    }
    //Verificamos que la casa no esté llena
    public boolean isCasaLlena(){
        return this.cantMaxAlumnos < this.alumnos.size() ;
    }

}
