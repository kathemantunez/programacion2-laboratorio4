/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2.laboratorio4;

/**
 *
 * @author Asus
 */
public class Helicoptero  extends Aereo{
    private String Helices;
    private String Patas;

    public Helicoptero() {
    }

    public Helicoptero(String Helices, String Patas, String Gasolina, String PaisdePartida, String PaisdeLlegada, String Tanque, String Distancia, String Altitud) {
        super(Gasolina, PaisdePartida, PaisdeLlegada, Tanque, Distancia, Altitud);
        this.Helices = Helices;
        this.Patas = Patas;
    }

    public String getHelices() {
        return Helices;
    }

    public void setHelices(String Helices) {
        this.Helices = Helices;
    }

    public String getPatas() {
        return Patas;
    }

    public void setPatas(String Patas) {
        this.Patas = Patas;
    }

    
    
    @Override
    public String toString() {
        return "Helicoptero{" + "Helices=" + Helices + ", Patas=" + Patas + '}';
    }
}
