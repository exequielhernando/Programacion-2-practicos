package Practico4.Ejercicio6;

public class Revista extends Producto{
    private int numeroRevista = 0;
    private int anio;

    public Revista(String nombre, String autor, double precio, int numeroRevista, int anio) {
        super(nombre, autor, precio);
        this.anio = anio;
        this.numeroRevista++;
    }

    public int getNumeroRevista() {
        return numeroRevista;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
