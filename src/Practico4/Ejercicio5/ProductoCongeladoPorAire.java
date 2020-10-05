package Practico4.Ejercicio5;

public class ProductoCongeladoPorAire extends ProductoCongelado {
    private double cantNitrogeno;
    private double cantOxigeno;
    private double cantDioxidoCarbono;
    private double cantVaporAgua;
    public ProductoCongeladoPorAire(String fechaNacimiento, int numeroLote, String fechaEnvasado,
                                    String granjaOrigen, String codigoOSA,
                                    double temperaturaMantenimientoRecomendada,double cantNitrogeno, double cantOxigeno,
                                    double cantDioxidoCarbono, double cantVaporAgua) {
        super(fechaNacimiento, numeroLote, fechaEnvasado, granjaOrigen, codigoOSA, temperaturaMantenimientoRecomendada);
        this.cantNitrogeno = cantNitrogeno;
        this.cantOxigeno = cantOxigeno;
        this.cantDioxidoCarbono = cantDioxidoCarbono;
        this.cantVaporAgua = cantVaporAgua;
    }

    public double getCantNitrogeno() { return cantNitrogeno; }
    public double getCantOxigeno() { return cantOxigeno; }
    public double getCantDioxidoCarbono() { return cantDioxidoCarbono; }
    public double getCantVaporAgua() { return cantVaporAgua; }
    public void setCantNitrogeno(double cantNitrogeno) { this.cantNitrogeno = cantNitrogeno; }
    public void setCantOxigeno(double cantOxigeno) { this.cantOxigeno = cantOxigeno; }
    public void setCantDioxidoCarbono(double cantDioxidoCarbono) { this.cantDioxidoCarbono = cantDioxidoCarbono; }
    public void setCantVaporAgua(double cantVaporAgua) { this.cantVaporAgua = cantVaporAgua; }
    public void setComposicionAire(){
        double totalComposicion = 0;
        totalComposicion += (cantNitrogeno + cantOxigeno + cantDioxidoCarbono + cantVaporAgua);
        setCantNitrogeno( cantNitrogeno * 100 / totalComposicion );
        setCantOxigeno( cantOxigeno * 100 / totalComposicion);
        setCantDioxidoCarbono( cantDioxidoCarbono * 100 / totalComposicion);
        setCantVaporAgua( cantVaporAgua * 100 / totalComposicion);
    }

    @Override
    public String congelar() {
        return "Nitrogeno: " + getCantNitrogeno() + "% - Oxigeno: " + getCantOxigeno() +
                "% - Dioxido de Carbono: " + getCantDioxidoCarbono() +
                "% - Vapor de agua: " + getCantVaporAgua() + "%";
    }
    @Override
    public String toString() {
        return super.toString() + "\n" + congelar();
    }
}
