/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2.laboratorio4;

import programacion2.laboratorio4.Espacial;

/**
 *
 * @author Asus
 */
public class Cohete extends Espacial{
    private String Separaciones;

    public Cohete() {
    }

    public Cohete(String Separaciones, String Combustible, String PlanetadePartida, String PanetadeLlegada) {
        super(Combustible, PlanetadePartida, PanetadeLlegada);
        this.Separaciones = Separaciones;
    }

    public String getSeparaciones() {
        return Separaciones;
    }

    public void setSeparaciones(String Separaciones) {
        this.Separaciones = Separaciones;
    }

    @Override
    public String toString() {
        return "Cohete{" + "Separaciones=" + Separaciones + '}';
    }
    
    
}
