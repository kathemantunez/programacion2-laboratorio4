/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2.laboratorio4;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author KATHERINE
 */
public class Ingenieros extends SeresVivos{
    private String correo;
    private String nombreusuario;
    private ArrayList idiomas=new ArrayList();
    private String contraseña;
    private int cafe;
    private String  fecha;

    public Ingenieros() {
    }

    public Ingenieros(String correo, String nombreusuario, String contraseña, int cafe, String fecha, String nombre, String gruposangre, String sexo, int altura, int peso) {
        super(nombre, gruposangre, sexo, altura, peso);
        this.correo = correo;
        this.nombreusuario = nombreusuario;
        this.contraseña = contraseña;
        this.cafe = cafe;
        this.fecha = fecha;
        
        
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public ArrayList getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(ArrayList idiomas) {
        this.idiomas = idiomas;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
        
    }

    public int getCafe() {
        return cafe;
    }

    public void setCafe(int cafe) {
        this.cafe = cafe;
        if(cafe==0){
        }
       
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Ingenieros{" + "correo=" + correo + ", nombreusuario=" + nombreusuario + ", idiomas=" + idiomas + ", contrase\u00f1a=" + contraseña + ", cafe=" + cafe + ", fecha=" + fecha + '}';
    }

    @Override
    public boolean cafe() {
        boolean x=false;
       if(cafe==0){
           cafe=cafe;
          x=true;
       }
       cafe=cafe-1;
       return x;
    }

    @Override
    public void comida() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
    
    
