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
public class Nave extends Espacial{
    private String Propulsores;

    public Nave() {
    }

    public Nave(String Propulsores, String Combustible, String PlanetadePartida, String PanetadeLlegada) {
        super(Combustible, PlanetadePartida, PanetadeLlegada);
        this.Propulsores = Propulsores;
    }

    public String getPropulsores() {
        return Propulsores;
    }

    public void setPropulsores(String Propulsores) {
        this.Propulsores = Propulsores;
    }

    @Override
    public String toString() {
        return "Nave{" + "Propulsores=" + Propulsores + '}';
    }
    
    
}
