package Practico4.Ejercicio6;

import java.util.ArrayList;

public class Libreria {
    private ArrayList<Cliente> clientes;
    private ArrayList<Producto> articulos;

    public Libreria(ArrayList<Cliente> clientes, ArrayList<Producto> articulos) {
        this.clientes = new ArrayList<>();
        this.articulos = new ArrayList<>();
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public ArrayList<Producto> getArticulos() {
        return articulos;
    }

    public double getPrecio(Producto p, Cliente c){
        return c.cuantoTeCobro(p);
    }
    public boolean comproProducto(Producto p, Cliente c){
       return c.comproProducto(p);
    }

    public boolean leGusta(Libro l, Cliente c){
       return c.leGustaLibro(l);
    }
    public ArrayList<Cliente> aQuienLeGusta(Libro l){
        ArrayList<Cliente> c = new ArrayList<>();

        for (int i = 0; i < clientes.size(); i++) {
            Cliente aux = clientes.get(i);
            if (this.leGusta(l, aux)){
                c.add(aux);
            }
         }
        return c;
    }
}
