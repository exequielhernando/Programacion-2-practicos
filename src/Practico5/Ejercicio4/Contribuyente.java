package Practico5.Ejercicio4;

import java.util.Objects;

public class Contribuyente {
    private String name;
    private final int idContribuyente;
    private double montoFijoImpuesto;
    public Contribuyente(String name, int idContribuyente,double montoFijoImpuesto) {
        this.name = name;
        this.idContribuyente = idContribuyente;
        this.montoFijoImpuesto = montoFijoImpuesto;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getIdContribuyente() { return idContribuyente; }

    public void setMontoFijoImpuesto(double montoFijoImpuesto) { this.montoFijoImpuesto = montoFijoImpuesto; }

    public double calcularContribucion(){
        return montoFijoImpuesto;
    }
    @Override
    public boolean equals(Object o) {
        try {
            if (this == o) return true;
            if (!(o instanceof Contribuyente)) return false;
            Contribuyente that = (Contribuyente) o;
            return idContribuyente == that.idContribuyente &&
                    Objects.equals(name, that.name);
        }catch (Exception e){
            return false;
        }
    }


}
