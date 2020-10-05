package Practico4.Ejercicio5;

import java.util.ArrayList;

public class Avicola {
    private ArrayList<Producto> productos;

    public Avicola() {
        this.productos = new ArrayList<>();
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }
    public void agregarProducto(Producto p){
        productos.add(p);
    }
    public void eliminarProducto(int i){
        productos.remove(i);
    }

    @Override
    public String toString() {
    	String resultado = "";
        for (int i = 0; i < productos.size(); i++) {
        	resultado += productos.get(i).toString();
        }
        return resultado;
    }
}
