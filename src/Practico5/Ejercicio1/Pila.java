package Practico5.Ejercicio1;

import java.util.ArrayList;

public class Pila {
    private ArrayList<Object> elementos;

    public Pila() {
        this.elementos = new ArrayList<>();
    }
    public  void push(Object c){
        elementos.add(c);
    }
    public void pop(){
        elementos.remove(top());
    }
    public Pila top(){
        Pila p = new Pila();
        int index = elementos.size()-1;
        p = (Pila) elementos.get(index);
        return p;
    }
    public int size(){
        return elementos.size();
    }
    public Pila copy(){
        return (Pila) elementos.clone();
    }
   /* public Pila reverse(){

        return null;
    }*/
}
