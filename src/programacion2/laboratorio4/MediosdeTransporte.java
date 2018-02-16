/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2.laboratorio4;

import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class MediosdeTransporte {
    private String Tanque;

    private String Distancia; 
    private String Altitud;
    private ArrayList<Primates> Primates = new ArrayList();

    public MediosdeTransporte() {
    }

    public MediosdeTransporte(String Tanque, String Distancia, String Altitud) {
        this.Tanque = Tanque;
        this.Distancia = Distancia;
        this.Altitud = Altitud;
    }

    public String getTanque() {
        return Tanque;
    }

    public void setTanque(String Tanque) {
        this.Tanque = Tanque;
    }

    public String getDistancia() {
        return Distancia;
    }

    public void setDistancia(String Distancia) {
        this.Distancia = Distancia;
    }

    public String getAltitud() {
        return Altitud;
    }

    public void setAltitud(String Altitud) {
        this.Altitud = Altitud;
    }

    public ArrayList<Primates> getPrimates() {
        return Primates;
    }

    public void setPrimates(ArrayList<Primates> Primates) {
        this.Primates = Primates;
    }

    @Override
    public String toString() {
        return "MediosdeTransporte{" + "Tanque=" + Tanque + ", Distancia=" + Distancia + ", Altitud=" + Altitud + ", Primates=" + Primates + '}';
    }
    


    
}


