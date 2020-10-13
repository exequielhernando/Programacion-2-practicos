package Practico5.Ejercicio5;

public class EmpleadoVendedor extends Empleado{
    private double totalVentas;
    private double porcentajeVentas;

    public EmpleadoVendedor(String nombre, String apellido, int dni, double sueldoFijoMensual, double totalVentas,
                            double porcentajeVentas) {
        super(nombre, apellido, dni, sueldoFijoMensual);
        this.totalVentas = totalVentas;
        this.porcentajeVentas = porcentajeVentas;
    }

    public double getTotalVentas() { return totalVentas; }


    public double getPorcentajeVentas() { return porcentajeVentas; }

    @Override
    public double getSueldoMensual() {
        return super.getSueldoMensual() + (this.getTotalVentas() * (this.getPorcentajeVentas() / 100));
    }
}
