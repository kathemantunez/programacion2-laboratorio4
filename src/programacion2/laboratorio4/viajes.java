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
    public MediosdeTransporte tra;

    public viajes() {
    }

    public viajes(MediosdeTransporte tra) {
        this.tra = tra;
    }

    public MediosdeTransporte getTra() {
        return tra;
    }

    public void setTra(MediosdeTransporte tra) {
        this.tra = tra;
    }

    @Override
    public String toString() {
        return "viajes{" + "tra=" + tra + '}';
    }
    

    
    }
    
    

