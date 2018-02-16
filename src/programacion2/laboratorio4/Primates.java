/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2.laboratorio4;

/**
 *
 * @author KATHERINE
 */
public class Primates extends SeresVivos{
    private String  area;
    private int cantidadcomida;
    private String planeta;
    private String lugarnacimiento;

    public Primates() {
    }

    public Primates(String area, int cantidadcomida, String planeta, String lugarnacimiento, String nombre, String gruposangre, String sexo, int altura, int peso) {
        super(nombre, gruposangre, sexo, altura, peso);
        this.area = area;
        this.cantidadcomida = cantidadcomida;
        this.planeta = planeta;
        this.lugarnacimiento = lugarnacimiento;
    }

   

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getCantidadcomida() {
        return cantidadcomida;
    }

    public void setCantidadcomida(int cantidadcomida) {
        this.cantidadcomida = cantidadcomida;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    public String getLugarnacimiento() {
        return lugarnacimiento;
    }

    public void setLugarnacimiento(String lugarnacimiento) {
        this.lugarnacimiento = lugarnacimiento;
    }

    @Override
    public String toString() {
        return "Primates{" + "area=" + area + ", cantidadcomida=" + cantidadcomida + ", planeta=" + planeta + ", lugarnacimiento=" + lugarnacimiento + '}';
    }
    
    
}
