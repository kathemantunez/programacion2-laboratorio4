/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2.laboratorio4;

import java.util.ArrayList;

/**
 *
 * @author KATHERINE
 */
public class viajes {
    private ArrayList<MediosdeTransporte> mediostransporte=new ArrayList();

    public viajes() {
    }

    public ArrayList<MediosdeTransporte> getMediostransporte() {
        return mediostransporte;
    }

    public void setMediostransporte(ArrayList<MediosdeTransporte> mediostransporte) {
        this.mediostransporte = mediostransporte;
    }

    @Override
    public String toString() {
        return "viajes{" + "mediostransporte=" + mediostransporte + '}';
    }
    
    
}
