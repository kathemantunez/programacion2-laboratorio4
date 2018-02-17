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
public class Aereo extends MediosdeTransporte{
    private String Gasolina;
    private String PaisdePartida;
    private String PaisdeLlegada;

    public Aereo() {
    }

    public Aereo(String Gasolina, String PaisdePartida, String PaisdeLlegada, String Tanque, String Distancia, String Altitud) {
        super(Tanque, Distancia, Altitud);
        this.Gasolina = Gasolina;
        this.PaisdePartida = PaisdePartida;
        this.PaisdeLlegada = PaisdeLlegada;
    }

    public String getGasolina() {
        return Gasolina;
    }

    public void setGasolina(String Gasolina) {
        this.Gasolina = Gasolina;
    }

    public String getPaisdePartida() {
        return PaisdePartida;
    }

    public void setPaisdePartida(String PaisdePartida) {
        this.PaisdePartida = PaisdePartida;
    }

    public String getPaisdeLlegada() {
        return PaisdeLlegada;
    }

    public void setPaisdeLlegada(String PaisdeLlegada) {
        this.PaisdeLlegada = PaisdeLlegada;
    }

    @Override
    public String toString() {
        return "Aereo{" + "Gasolina=" + Gasolina + ", PaisdePartida=" + PaisdePartida + ", PaisdeLlegada=" + PaisdeLlegada + '}';
    }

    
    
    
}

