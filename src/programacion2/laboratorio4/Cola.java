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
public class Cola {
    private int size=0;
    private Nodo head=null;

    public Cola() {
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Nodo getHead() {
        return head;
    }

    public void setHead(Nodo head) {
        this.head = head;
    }

    @Override
    public String toString() {
        return "Cola{" + "size=" + size + ", head=" + head + '}';
    }
    
    public void Queue(){
        
    }
    public void Peek(){
        
    }
    public void getsize(){
        
    }
    
    
}
