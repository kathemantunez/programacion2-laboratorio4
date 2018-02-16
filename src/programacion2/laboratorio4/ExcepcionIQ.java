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
public class ExcepcionIQ extends Exception{
    private int IQ;

    public ExcepcionIQ(int IQ, String string) {
        super(string);
        this.IQ = IQ;
    }

    public int getIQ() {
        return IQ;
    }

    public void setIQ(int IQ) {
        this.IQ = IQ;
    }

    @Override
    public String toString() {
        return "ExcepcionIQ{" + "IQ=" + IQ + '}';
    }
    
}

   
