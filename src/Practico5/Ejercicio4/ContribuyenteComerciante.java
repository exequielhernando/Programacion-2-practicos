package Practico5.Ejercicio4;

public class ContribuyenteComerciante extends Contribuyente{
    private double porcentajeMontoFijo;
    private double totalRecaudadoVentas;
    private double porcentajeVentas;

    public ContribuyenteComerciante(String name, int idContribuyente, double montoFijoImpuesto,
                                    double totalRecaudadoVentas) {
        super(name, idContribuyente, montoFijoImpuesto);
        this.porcentajeMontoFijo = 0.5;
        this.totalRecaudadoVentas = totalRecaudadoVentas;
        this.porcentajeVentas = 0.035;
    }

    @Override
    public double calcularContribucion() {
        return super.calcularContribucion() * porcentajeMontoFijo + totalRecaudadoVentas * porcentajeVentas;
    }
}
