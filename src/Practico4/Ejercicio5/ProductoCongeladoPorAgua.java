package Practico4.Ejercicio5;

public class ProductoCongeladoPorAgua extends ProductoCongelado{
    private double gramosSal;
    private double litrosAgua;
    public ProductoCongeladoPorAgua(String fechaNacimiento, int numeroLote, String fechaEnvasado,
                                    String granjaOrigen, String codigoOSA,
                                    double temperaturaMantenimientoRecomendada,
                                    double gramosSal, double litrosAgua) {
        super(fechaNacimiento, numeroLote, fechaEnvasado, granjaOrigen, codigoOSA, temperaturaMantenimientoRecomendada);
        this.gramosSal = gramosSal;
        this.litrosAgua = litrosAgua;
    }

    public double getGramosSal() { return gramosSal; }
    public void setGramosSal(double gramosSal) { this.gramosSal = gramosSal; }
    public double getLitrosAgua() { return litrosAgua; }
    public void setLitrosAgua(double litrosAgua) { this.litrosAgua = litrosAgua; }
    public double getSalinidadAgua(){
        return getGramosSal()/getLitrosAgua();
    }

    @Override
    public String congelar() {
        return "Salinidad del agua: " + getSalinidadAgua() + " gr/lts";
    }
    @Override
    public String toString() {
        return super.toString() + "\n" + congelar();
    }
}
