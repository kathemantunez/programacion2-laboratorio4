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
public class SeresVivos {
    private String nombre;
    private String gruposangre;
    private String sexo;
    private int altura;
    private int peso;

    public SeresVivos() {
    }

    public SeresVivos(String nombre, String gruposangre, String sexo, int altura, int peso) {
        this.nombre = nombre;
        this.gruposangre = gruposangre;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGruposangre() {
        return gruposangre;
    }

    public void setGruposangre(String gruposangre) {
        this.gruposangre = gruposangre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "SeresVivos{" + "nombre=" + nombre + ", gruposangre=" + gruposangre + ", sexo=" + sexo + ", altura=" + altura + ", peso=" + peso + '}';
    }
    
    
}

