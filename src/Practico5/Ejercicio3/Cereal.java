package Practico5.Ejercicio3;

import java.util.ArrayList;
import java.util.Objects;

public class Cereal {
    private String clasificacion;
    private ArrayList<String> mineralesRequeridos;

    public Cereal(String clasificacion) {
        this.clasificacion = clasificacion;
        this.mineralesRequeridos = new ArrayList<>();
    }
    public void agregarMineral(String mineral){
        if (mineral != null){
            if (!tieneMineral(mineral)){
                mineralesRequeridos.add(mineral);
            }
        }
    }
    public boolean tieneMineral(String mineral){
        return mineralesRequeridos.contains(mineral);
    }
   /* public boolean aceptaLote(Lote l){
        for (int i = 0; i < this.mineralesRequeridos.size(); i++) {
            String minerali = this.mineralesRequeridos.get(i);
            if (!l.tieneMineral(minerali)){
                return false;
            }
        }
        return true;
    }*/
    public boolean aceptaLote(Lote l){
       return l.satisfaceRequerimientos(this);
    }
    @Override
    public boolean equals(Object o) {
        try {
            if (this == o) return true;
            if (!(o instanceof Cereal)) return false;
            Cereal cereal = (Cereal) o;
            return Objects.equals(clasificacion, cereal.clasificacion) &&
                    Objects.equals(mineralesRequeridos, cereal.mineralesRequeridos);
        }catch (Exception e){
            return false;
        }
    }

}
