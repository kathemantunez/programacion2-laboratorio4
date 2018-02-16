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
public class Espacial extends MediosdeTransporte{
    private String Combustible;
    private String PlanetadePartida;
    private String PanetadeLlegada;

    public Espacial() {
    }

    public Espacial(String Combustible, String PlanetadePartida, String PanetadeLlegada) {
        this.Combustible = Combustible;
        this.PlanetadePartida = PlanetadePartida;
        this.PanetadeLlegada = PanetadeLlegada;
    }

    public String getCombustible() {
        return Combustible;
    }

    public void setCombustible(String Combustible) {
        this.Combustible = Combustible;
    }

    public String getPlanetadePartida() {
        return PlanetadePartida;
    }

    public void setPlanetadePartida(String PlanetadePartida) {
        this.PlanetadePartida = PlanetadePartida;
    }

    public String getPanetadeLlegada() {
        return PanetadeLlegada;
    }

    public void setPanetadeLlegada(String PanetadeLlegada) {
        this.PanetadeLlegada = PanetadeLlegada;
    }

    @Override
    public String toString() {
        return "Espacial{" + "Combustible=" + Combustible + ", PlanetadePartida=" + PlanetadePartida + ", PanetadeLlegada=" + PanetadeLlegada + '}';
    }

    @Override
    public void combustibles() {
      
        
    }
    
    
}
