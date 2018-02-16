/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2.laboratorio4;

import javax.swing.JOptionPane;

/**
 *
 * @author KATHERINE
 */
public class Gorila_montaña extends Primates{
    private int IQ;

    public Gorila_montaña() {
    }

    public Gorila_montaña(int IQ, String area, int cantidadcomida, String planeta, String lugarnacimiento, String nombre, String gruposangre, String sexo, int altura, int peso) {
        super(area, cantidadcomida, planeta, lugarnacimiento, nombre, gruposangre, sexo, altura, peso);
        
        try {
            setIQ(IQ);
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "el numerador se paso del rango 130-139");
        }
    }

    
    

    public int getIQ() {
        return IQ;
    }

    public void setIQ(int IQ) throws ExcepcionIQ{
        
        this.IQ = IQ;
        if(this.IQ<130 || this.IQ>139){
            throw new ExcepcionIQ(IQ,"el rango del IQ es de 130-139");
        }
    }

    @Override
    public String toString() {
        return "Gorila_monta\u00f1a{" + "IQ=" + IQ + '}';
    }
    
}
