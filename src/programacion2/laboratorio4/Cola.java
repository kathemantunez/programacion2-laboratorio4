/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2.laboratorio4;

import java.util.ArrayList;
import static programacion2.laboratorio4.Programacion2Laboratorio4.Transportes;

/**
 *
 * @author KATHERINE
 */
public class Cola {
    static MediosdeTransporte mtrans =new MediosdeTransporte();
    static ArrayList<viajes> viaje=new ArrayList();
       
    
    private int size=0;
    private Nodo head=null;
   private Nodo top=null;
   
    public Cola(int size,Nodo head,Nodo top) {
        this.size=size;
        this.head=head;
        this.top=top;
    }

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
    public void Queue (MediosdeTransporte trans){
        viaje.add(new viajes(trans));
//         size++;
//         if(size==1){
//             head=trans;
//         }
//        node nuevo_empleado = new node(empleado, null);
//        if (size == 1) {
//            head = nuevo_empleado;
//        } else if (size == 2) {
//            head.setNext(new node(empleado, null));
//            top = head.getNext();
//        } else {
//            top.setNext(new node(empleado, null));
//            top = top.getNext();
//        
    }
    public String  Peek(){
       String cadena="";
       int c2=0;
        for (int i = 0; i < Transportes.size(); i++) {
              if(i==Transportes.size()-1){
            cadena +=  Transportes.get(i) ;
              }
//        
        }
        return cadena;
//        return head.getValue();
    }
    public int getsize(){
        int size=viaje.size();
        return size;
    }
    
    
}
