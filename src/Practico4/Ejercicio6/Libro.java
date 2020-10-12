package Practico4.Ejercicio6;

public class Libro extends Producto {
    private int cantidadPaginas;
    private String resumen;
    private String generoLiterario;

    public Libro(String nombre, String autor, double precio, int cantidadPaginas, String resumen,
                 String generoLiterario) {
        super(nombre, autor, precio);
        this.cantidadPaginas = cantidadPaginas;
        this.resumen = resumen;
        this.generoLiterario = generoLiterario;
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }

    public void setCantidadPaginas(int cantidadPaginas) {
        this.cantidadPaginas = cantidadPaginas;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getGeneroLiterario() {
        return generoLiterario;
    }

    public void setGeneroLiterario(String generoLiterario) {
        this.generoLiterario = generoLiterario;
    }
}
