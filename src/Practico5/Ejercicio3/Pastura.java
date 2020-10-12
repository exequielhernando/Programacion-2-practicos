package Practico5.Ejercicio3;

public class Pastura extends Cereal{
    private double superficieNecesaria;

    public Pastura(String tipo, double superficieNecesaria) {
        super(tipo);
        this.superficieNecesaria = superficieNecesaria;
    }

    @Override
    public boolean aceptaLote(Lote l) {
        return super.aceptaLote(l) && l.getSuperficie()>= this.superficieNecesaria;
    }
}
