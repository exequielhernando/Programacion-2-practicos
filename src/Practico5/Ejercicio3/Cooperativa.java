package Practico5.Ejercicio3;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cooperativa {
    private String nombre;
    private ArrayList<String> mineralesDeInteres;
    private ArrayList<Lote> lotes;
    private ArrayList<Cereal> cereales;

    public Cooperativa(String nombre) {
        this.nombre = nombre;
        this.mineralesDeInteres = new ArrayList<>();
        this.lotes = new ArrayList<>();
        this.cereales = new ArrayList<>();
    }
    public void agregarMineral(String mineral){
        if (mineral != null){
            if (!this.tieneMineral(mineral)){
                mineralesDeInteres.add(mineral);
            }
        }
    }
    public boolean tieneMineral(String mineral){
        return this.mineralesDeInteres.contains(mineral);
    }
    public void agregarLote(Lote l){
        if (l != null){
            if (!tieneLote(l)){
                lotes.add(l);
            }
        }
    }
    public boolean tieneLote(Lote l){
        return this.lotes.contains(l);
    }
    public void agregarCereal(Cereal c){
        if (c != null){
            if (!tieneCereal(c)){
                cereales.add(c);
            }
        }
    }
    public boolean tieneCereal(Cereal c){
        return this.cereales.contains(c);
    }
    //Verificamos que lotes poseen los minerales de interes de la cooperativa
    public boolean loteEspecial(Lote l){
        for (int i = 0; i < this.lotes.size(); i++) {
            String minerali = this.mineralesDeInteres.get(i);
            if (!l.tieneMineral(minerali)){
                return false;
            }
        }
        return true;
    }
    public ArrayList<Cereal> cerealesAptosXLote(Lote l){
        ArrayList<Cereal> cerealesApto = new ArrayList<>();
        for (int i = 0; i < this.cereales.size(); i++) {
            Cereal aux = this.cereales.get(i);
            if (l.satisfaceRequerimientos(aux)){
                cerealesApto.add(aux);
            }
        }
        return cerealesApto;
    }
    public ArrayList<Lote> lotesAptosXCereal(Cereal c){
        ArrayList<Lote> lotesAptos = new ArrayList<>();
        for (int i = 0; i < this.lotes.size(); i++) {
            Lote aux = this.lotes.get(i);
            if (c.aceptaLote(aux)){
                lotesAptos.add(aux);
            }
        }
        return lotesAptos;
    }
}
