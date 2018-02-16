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
    private int Helices;
    private int Patas;

    public Helicoptero() {
    }

    public Helicoptero(int Helices, int Patas, String Gasolina, String PaisdePartida, String PaisdeLlegada, String Tanque, double Distancia, double Altitud) {
        super(Gasolina, PaisdePartida, PaisdeLlegada, Tanque, Distancia, Altitud);
        this.Helices = Helices;
        this.Patas = Patas;
    }

    public int getHelices() {
        return Helices;
    }

    public void setHelices(int Helices) {
        this.Helices = Helices;
    }

    public int getPatas() {
        return Patas;
    }

    public void setPatas(int Patas) {
        this.Patas = Patas;
    }

    @Override
    public String toString() {
        return "Helicoptero{" + "Helices=" + Helices + ", Patas=" + Patas + '}';
    }
}
