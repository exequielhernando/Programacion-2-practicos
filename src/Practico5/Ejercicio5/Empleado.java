package Practico5.Ejercicio5;

import java.util.Objects;

public class Empleado {
    private String nombre;
    private String apellido;
    private final int dni;
    private double sueldoFijoMensual;


    public Empleado(String nombre, String apellido, int dni, double sueldoFijoMensual) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.sueldoFijoMensual = sueldoFijoMensual;
    }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }

    public void setApellido(String apellido) { this.apellido = apellido; }

    public int getDni() { return dni; }

    public double getSueldoFijoMensual() { return sueldoFijoMensual; }

    public double getSueldoMensual(){
        return this.getSueldoFijoMensual();
    }

    @Override
    public boolean equals(Object o) {
        try {
            if (this == o) return true;
            if (!(o instanceof Empleado)) return false;
            Empleado empleado = (Empleado) o;
            return dni == empleado.dni &&
                    Objects.equals(nombre, empleado.nombre) &&
                    Objects.equals(apellido, empleado.apellido);
        }catch (Exception e){
            return false;
        }

    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni=" + dni +
                ", sueldoFijoMensual=" + sueldoFijoMensual +
                '}';
    }
}
