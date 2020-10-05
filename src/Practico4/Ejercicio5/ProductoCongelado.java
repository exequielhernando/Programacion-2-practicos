package Practico4.Ejercicio5;

public class ProductoCongelado extends ProductoRefrigerado{
    public ProductoCongelado(String fechaNacimiento, int numeroLote, String fechaEnvasado, String granjaOrigen,
                             String codigoOSA, double temperaturaMantenimientoRecomendada) {
        super(fechaNacimiento, numeroLote, fechaEnvasado, granjaOrigen, codigoOSA, temperaturaMantenimientoRecomendada);
        super.setTipoProducto("Producto Congelado");
    }
    public String congelar(){
        return "";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
