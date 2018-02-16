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
public class Avion  extends Aereo{
    private int Pasajeros;
    private boolean PilotoAutomatico;

    public Avion() {
    }

    public Avion(int Pasajeros, boolean PilotoAutomatico, String Gasolina, String PaisdePartida, String PaisdeLlegada, String Tanque, double Distancia, double Altitud) {
        super(Gasolina, PaisdePartida, PaisdeLlegada, Tanque, Distancia, Altitud);
        this.Pasajeros = Pasajeros;
        this.PilotoAutomatico = PilotoAutomatico;
    }

    public int getPasajeros() {
        return Pasajeros;
    }

    public void setPasajeros(int Pasajeros) {
        this.Pasajeros = Pasajeros;
    }

    public boolean isPilotoAutomatico() {
        return PilotoAutomatico;
    }

    public void setPilotoAutomatico(boolean PilotoAutomatico) {
        this.PilotoAutomatico = PilotoAutomatico;
    }

    @Override
    public String toString() {
        return "Avion{" + "Pasajeros=" + Pasajeros + ", PilotoAutomatico=" + PilotoAutomatico + '}';
    }
    
    
}
