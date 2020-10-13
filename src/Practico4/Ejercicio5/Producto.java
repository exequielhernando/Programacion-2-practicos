package Practico4.Ejercicio5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Producto{
    private LocalDate fechaVencimiento;
    private int numeroLote;
    private LocalDate fechaEnvasado;
    private String granjaOrigen;
    private String tipoProducto;
    public Producto(String fechaVencimiento, int numeroLote, String fechaEnvasado, String granjaOrigen) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaVencimiento = LocalDate.parse(fechaVencimiento, fmt);
        this.numeroLote = numeroLote;
        this.fechaEnvasado = LocalDate.parse(fechaEnvasado, fmt);
        this.granjaOrigen = granjaOrigen;
        setTipoProducto("Producto Fresco");
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }
    public void setFechaVencimiento(String fechaNacimiento) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaVencimiento = LocalDate.parse(fechaNacimiento, fmt);
    }
    public int getNumeroLote() {
        return numeroLote;
    }
    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }
    public LocalDate getFechaEnvasado(){
        return fechaEnvasado;
    }
    public void setFechaEnvasado(String fechaEnvasado){
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaEnvasado = LocalDate.parse(fechaEnvasado, fmt);
    }
    public String getGranjaOrigen(){
        return granjaOrigen;
    }
    public void setGranjaOrigen(String granjaOrigen){
        this.granjaOrigen = granjaOrigen;
    }
    public String getTipoProducto() { return tipoProducto; }
    public void setTipoProducto(String tipoProducto){ this.tipoProducto = tipoProducto;  }

    @Override
    public String toString() {
        return "Producto{" +
                "fechaVencimiento=" + fechaVencimiento +
                ", numeroLote=" + numeroLote +
                ", fechaEnvasado=" + fechaEnvasado +
                ", granjaOrigen='" + granjaOrigen + '\'' +
                ", tipoProducto='" + tipoProducto + '\'' +
                '}';
    }
}