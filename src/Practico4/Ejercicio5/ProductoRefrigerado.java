package Practico4.Ejercicio5;

public class ProductoRefrigerado extends Producto {
    private String codigoOSA;
    private double temperaturaMantenimientoRecomendada;
    public ProductoRefrigerado(String fechaNacimiento, int numeroLote, String fechaEnvasado,
                               String granjaOrigen, String codigoOSA, double temperaturaMantenimientoRecomendada) {
        super(fechaNacimiento, numeroLote, fechaEnvasado, granjaOrigen);
        super.setTipoProducto("Producto Refrigerado");
        this.codigoOSA = codigoOSA;
        this.temperaturaMantenimientoRecomendada = temperaturaMantenimientoRecomendada;
    }

    public String getCodigoOSA() {
        return codigoOSA;
    }

    public double getTemperaturaMantenimientoRecomendada() {
        return temperaturaMantenimientoRecomendada;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Codigo del organismo del supervicion alimentaria: " + getCodigoOSA() +
                "\nTemparatura de mantenimiento recomendada: " + getTemperaturaMantenimientoRecomendada();
    }
}
