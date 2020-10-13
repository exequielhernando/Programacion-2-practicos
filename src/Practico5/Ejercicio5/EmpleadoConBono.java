package Practico5.Ejercicio5;

public class EmpleadoConBono extends EmpleadoVendedor{
    private int cantidadVentasLogradas;
    private int cantidadVentasNecesarias;
    private double bonoAdicional;
    public EmpleadoConBono(String nombre, String apellido, int dni, double sueldoFijoMensual, double totalVentas,
                           double porcentajeVentas, int cantidadVentasLogradas,int cantidadVentasNecesarias,
                           double bonoAdicional) {
        super(nombre, apellido, dni, sueldoFijoMensual, totalVentas, porcentajeVentas);
        this.cantidadVentasLogradas = cantidadVentasLogradas;
        this.cantidadVentasNecesarias = cantidadVentasNecesarias;
        this.bonoAdicional = bonoAdicional;
    }

    public int getCantidadVentasLogradas() { return cantidadVentasLogradas; }

    public void setCantidadVentasLogradas(int cantidadVentasLogradas) {
        this.cantidadVentasLogradas = cantidadVentasLogradas;
    }

    public int getCantidadVentasNecesarias() { return cantidadVentasNecesarias; }

    public void setCantidadVentasNecesarias(int cantidadVentasNecesarias) {
        this.cantidadVentasNecesarias = cantidadVentasNecesarias;
    }

    public double getBonoAdicional() { return bonoAdicional; }

    public void setBonoAdicional(double bonoAdicional) { this.bonoAdicional = bonoAdicional; }

    public boolean cumpleVentas(){
        return cantidadVentasLogradas >= cantidadVentasNecesarias;
    }
    @Override
    public double getSueldoMensual() {
        if (this.cumpleVentas()){
            return super.getSueldoMensual() + bonoAdicional;
        } else {
            return super.getSueldoMensual();
        }
    }
}
