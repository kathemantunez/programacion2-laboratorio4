/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2.laboratorio4;

/**
 *
 * @author KATHERINE
 */
public class Nodo {
    private Object value;
   private Nodo siguiente;
   private Nodo head=null;

    public Nodo() {
    }

    public Nodo(Object value, Nodo siguiente) {
        this.value = value;
        this.siguiente = siguiente;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "Nodo{" + "value=" + value + ", siguiente=" + siguiente + '}';
    }
    
    
}
