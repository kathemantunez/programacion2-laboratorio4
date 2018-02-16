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
    private String Pasajeros;
    private String PilotoAutomatico;

    public Avion() {
    }

    public Avion(String Pasajeros, String PilotoAutomatico, String Gasolina, String PaisdePartida, String PaisdeLlegada, String Tanque, String Distancia, String Altitud) {
        super(Gasolina, PaisdePartida, PaisdeLlegada, Tanque, Distancia, Altitud);
        this.Pasajeros = Pasajeros;
        this.PilotoAutomatico = PilotoAutomatico;
    }

    public String getPasajeros() {
        return Pasajeros;
    }

    public void setPasajeros(String Pasajeros) {
        this.Pasajeros = Pasajeros;
    }

    public String isPilotoAutomatico() {
        return PilotoAutomatico;
    }

    public void setPilotoAutomatico(String PilotoAutomatico) {
        this.PilotoAutomatico = PilotoAutomatico;
    }

    @Override
    public String toString() {
        return "Avion{" + "Pasajeros=" + Pasajeros + ", PilotoAutomatico=" + PilotoAutomatico + '}';
    }
    
    
}
