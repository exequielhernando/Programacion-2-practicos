package Practico4.Ejercicio6;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String apellido;
    private int dni;
    private String direccion;
    private double descuento;
    private ArrayList<String> autoresFavoritos;
    private ArrayList<String> generosFavoritos;
    private ArrayList<Producto> historialCompras;

    public Cliente(String nombre, String apellido, int dni, String direccion, double descuento,
                   ArrayList<String> autoresFavoritos,ArrayList<String> generosFavoritos,
                   ArrayList<Producto> historialCompras) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.descuento = descuento;
        this.autoresFavoritos = new ArrayList<>();
        this.generosFavoritos = new ArrayList<>();
        this.historialCompras = new ArrayList<>();
    }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }

    public void setApellido(String apellido) { this.apellido = apellido; }

    public int getDni() { return dni; }

    public void setDni(int dni) { this.dni = dni; }

    public String getDireccion() { return direccion; }

    public void setDireccion(String direccion) { this.direccion = direccion; }

    public double getDescuento() { return descuento; }

    public void setDescuento(double descuento) { this.descuento = descuento; }

    public void agregarAutorFavorito(String autor){
        if (!autoresFavoritos.contains(autor)){
            autoresFavoritos.add(autor);
        }
    }

    public boolean leGustaAutor(String autor){
        return (autoresFavoritos.contains(autor));
    }

    public void agregarGeneroFavorito(String genero){
        if (!generosFavoritos.contains(genero)){
            generosFavoritos.add(genero);
        }
    }

    public boolean leGustaGenero(String genero){
        return (generosFavoritos.contains(genero));
    }

    public boolean leGustaLibro(Libro l){
        return this.leGustaAutor(l.getAutor());
    }
    public void agregarCompra(Producto p){
        historialCompras.add(p);
    }

    public boolean comproProducto(Producto producto){
        return historialCompras.contains(producto);
    }

    public double cuantoTeCobro(Producto p){

        return p.getPrecio() - p.getPrecio() * getDescuento();
    }
}
