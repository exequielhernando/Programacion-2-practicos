package Practico4.Ejercicio6;

import java.util.ArrayList;

public class ClienteExigente extends Cliente{
    public ClienteExigente(String nombre, String apellido, int dni, String direccion, double descuento, ArrayList<String> autoresFavoritos, ArrayList<String> generosFavoritos, ArrayList<Producto> historialCompras) {
        super(nombre, apellido, dni, direccion, descuento, autoresFavoritos, generosFavoritos, historialCompras);
    }

    @Override
    public boolean leGustaLibro(Libro l) {
        return super.leGustaLibro(l) && this.leGustaGenero(l.getGeneroLiterario());
    }
}
