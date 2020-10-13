package Practico5.Ejercicio5;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Empleado> empleados;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public void agregarEmpleado(Empleado empleado){
        if (!existeEmpleado(empleado)){
            empleados.add(empleado);
        }
    }
    public boolean existeEmpleado(Empleado empleado){
        return empleados.contains(empleado);
    }

    public double getGastosSueldos(){
        double totalGastos = 0;
        for (Empleado empleado: empleados) {
            totalGastos += empleado.getSueldoMensual();
        }
        return totalGastos;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", empleados=" + empleados +
                '}';
    }
}
