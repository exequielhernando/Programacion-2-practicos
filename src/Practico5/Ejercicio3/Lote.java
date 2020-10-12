package Practico5.Ejercicio3;

import java.util.ArrayList;
import java.util.Objects;

public class Lote {
    private String nombre;
    private ArrayList<String> minerales;
    private boolean isEspecial;
    private double superficie;

    public Lote(String nombre, double superficie) {
        this.nombre = nombre;
        this.minerales = new ArrayList<>();
        this.isEspecial = false;
        this.superficie = superficie;
    }

    public boolean isEspecial() {
        return isEspecial;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void agregarMineral(String mineral){
        if (mineral != null){
            if (!tieneMineral(mineral)){
                this.minerales.add(mineral);
            }
        }
    }
    public boolean tieneMineral(String mineral){
        return this.minerales.contains(mineral);
    }
    public boolean satisfaceRequerimientos(Cereal c){
        for (int i = 0; i < this.minerales.size(); i++) {
            String minerali =this.minerales.get(i);
            if (!c.tieneMineral(minerali)){
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lote)) return false;
        Lote lote = (Lote) o;
        return isEspecial == lote.isEspecial &&
                Double.compare(lote.superficie, superficie) == 0 &&
                Objects.equals(nombre, lote.nombre) &&
                Objects.equals(minerales, lote.minerales);
    }

}
