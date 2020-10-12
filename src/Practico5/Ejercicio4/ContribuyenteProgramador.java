package Practico5.Ejercicio4;

public class ContribuyenteProgramador extends Contribuyente{
    private double porcentajeMontoFijo;
    private double totalRecaudadoDesarrolo;
    private double porcentajeRecaudado;

    public ContribuyenteProgramador(String name, int idContribuyente, double montoFijoImpuesto,
                                    double totalRecaudadoDesarrolo) {
        super(name, idContribuyente, montoFijoImpuesto);
        this.porcentajeMontoFijo = 0.2;
        this.totalRecaudadoDesarrolo = totalRecaudadoDesarrolo;
        this.porcentajeRecaudado = 0.02;
    }

    @Override
    public double calcularContribucion() {
        return super.calcularContribucion() * porcentajeMontoFijo + totalRecaudadoDesarrolo * porcentajeRecaudado;
    }
}
