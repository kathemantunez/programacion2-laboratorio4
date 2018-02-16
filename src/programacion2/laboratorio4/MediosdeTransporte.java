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
    private double Distancia; 
    private double Altitud;
    private ArrayList<Primates> Primates = new ArrayList();

    public MediosdeTransporte() {
    }

    public MediosdeTransporte(String Tanque, double Distancia, double Altitud) {
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

    public double getDistancia() {
        return Distancia;
    }

    public void setDistancia(double Distancia) {
        this.Distancia = Distancia;
    }

    public double getAltitud() {
        return Altitud;
    }

    public void setAltitud(double Altitud) {
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


