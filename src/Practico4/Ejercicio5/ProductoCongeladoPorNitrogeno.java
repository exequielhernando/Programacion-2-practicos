package Practico4.Ejercicio5;

public class ProductoCongeladoPorNitrogeno extends ProductoCongelado{
    private String metodoCongelacion;
    private double tiempoExposicionNitrogeno;
    public ProductoCongeladoPorNitrogeno(String fechaNacimiento, int numeroLote, String fechaEnvasado,
                                         String granjaOrigen, String codigoOSA,
                                         double temperaturaMantenimientoRecomendada, String metodoCongelacion,
                                         double tiempoExposicionNitrogeno) {
        super(fechaNacimiento, numeroLote, fechaEnvasado, granjaOrigen, codigoOSA, temperaturaMantenimientoRecomendada);
        this.metodoCongelacion = metodoCongelacion;
        this.tiempoExposicionNitrogeno = tiempoExposicionNitrogeno;
    }

    public String getMetodoCongelacion() { return metodoCongelacion; }
    public void setMetodoCongelacion(String metodoCongelacion) { this.metodoCongelacion = metodoCongelacion; }
    public double getTiempoExposicionNitrogeno() { return tiempoExposicionNitrogeno; }
    public void setTiempoExposicionNitrogeno(double tiempoExposicionNitrogeno) { this.tiempoExposicionNitrogeno = tiempoExposicionNitrogeno; }

    @Override
    public String congelar() {
        return " Metodo de congelacion: " + getMetodoCongelacion() +
                " - Tiempo de Exposicion al nitrogeno: " + getTiempoExposicionNitrogeno();
    }
    @Override
    public String toString() {
        return super.toString() + "\n" + congelar();
    }
}
