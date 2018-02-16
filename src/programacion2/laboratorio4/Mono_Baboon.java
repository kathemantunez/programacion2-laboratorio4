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
    private Color colorpelo;

    public Mono_Baboon() {
    }

    public Mono_Baboon(Color colorpelo, String area, int cantidadcomida, String planeta, String lugarnacimiento) {
        super(area, cantidadcomida, planeta, lugarnacimiento);
        this.colorpelo = colorpelo;
    }

    public Color getColorpelo() {
        return colorpelo;
    }

    public void setColorpelo(Color colorpelo) {
        this.colorpelo = colorpelo;
    }

    @Override
    public String toString() {
        return "Mono_Baboon{" + "colorpelo=" + colorpelo + '}';
    }
    
    
}
