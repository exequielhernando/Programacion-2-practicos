package Practico5.Ejercicio4;

import java.util.ArrayList;

public class Ciudad {
    private String nombre;
    private ArrayList<Contribuyente> contribuyentes;
    private double totalImpuestosRecaudado;

    public Ciudad(String nombre) {
        this.nombre = nombre;
        this.contribuyentes = new ArrayList<>();
    }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getTotalImpuestosRecaudado() { return totalImpuestosRecaudado; }

    private void setTotalImpuestosRecaudado(double totalImpuestosRecaudado) {
        this.totalImpuestosRecaudado = totalImpuestosRecaudado;
    }

    public void agregarContribuyente(Contribuyente c){
        if (!this.estaContribuyente(c)){
            contribuyentes.add(c);
        }
    }
    public boolean estaContribuyente(Contribuyente c){
        return contribuyentes.contains(c);
    }
    public void calcularImpuestosRecaudados(){
        double totalImpuestos = 0;
        for (int i = 0; i < this.contribuyentes.size(); i++) {
            totalImpuestos += this.contribuyentes.get(i).calcularContribucion();
        }
        setTotalImpuestosRecaudado(totalImpuestos);
    }
}
