package Practico4.Ejercicio4;

import java.util.ArrayList;
import java.util.Objects;

public class SeleccionDeFutbol {
    private String pais;
    private ArrayList<Persona> contingente;

    public SeleccionDeFutbol(String pais) {
        this.pais = pais;
        this.contingente = new ArrayList<Persona>();
    }

    public ArrayList<Persona> getContingente() {
        return contingente;
    }

    public String getPais() {
        return pais;
    }


    public void addPersona(Persona p){
        contingente.add(p);
    }
    public boolean isDisponibleParaEventoSolidario(Persona p){
        return (p.isDisponible());
    }

    @Override
    public String toString() {
        for (int i = 0; i < contingente.size(); i++) {
           return contingente.get(i).toString();
        }
        return "No hay datos";
    }
}
