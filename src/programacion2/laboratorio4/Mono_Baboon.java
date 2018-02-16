/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2.laboratorio4;

import java.awt.Color;

/**
 *
 * @author KATHERINE
 */
public class Mono_Baboon extends Primates{
    private String colorpelo;

    public Mono_Baboon() {
    }

    public Mono_Baboon(String colorpelo, String area, int cantidadcomida, String planeta, String lugarnacimiento, String nombre, String gruposangre, String sexo, int altura, int peso) {
        super(area, cantidadcomida, planeta, lugarnacimiento, nombre, gruposangre, sexo, altura, peso);
        this.colorpelo = colorpelo;
    }

    

    public String getColorpelo() {
        return colorpelo;
    }

    public void setColorpelo(String colorpelo) {
        this.colorpelo = colorpelo;
    }

    @Override
    public String toString() {
        return "Mono_Baboon{" + "colorpelo=" + colorpelo + '}';
    }
    
    
}
