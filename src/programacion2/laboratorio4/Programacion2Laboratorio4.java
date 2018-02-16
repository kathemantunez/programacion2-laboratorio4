/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2.laboratorio4;

import java.util.ArrayList;
import javax.swing.JOptionPane;

<<<<<<< HEAD

public class Programacion2Laboratorio4 {
    ArrayList<MediosdeTransporte> Transporte = new ArrayList();
    
    public static void main(String[] args) {
        String opcion = "";
    }
    
    public static void TransportesMenu(){
        String Menu;
        do{
            Menu = JOptionPane.showInputDialog("+-+TRANSPORTES+-+"
                    + "1. Crear"
                    + "2. Listar"
                    + "3. Modificar"
                    + "4. Borrar"
                    + "5. Salir");
        }while(!Menu.equals("5"));
    }
    
    public static void TransportesCrear(){
        Transporte.add(new Transporte);
=======
/**
 *
 * @author KATHERINE
 */
public class Programacion2Laboratorio4 {
static ArrayList<Ingenieros> ingenieros=new ArrayList();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String opcion="";
        while (!opcion.equals("c")){
            opcion=JOptionPane.showInputDialog("a.agregar ingenieros\n"
                    + "b.LOG IN\n"
                    + "c. salir");
            switch(opcion){
                
                case "a":
                    crearIngenieros();
                    break;
                case "b":
                    if(ingenieros.size()==0){
                        JOptionPane.showMessageDialog(null,"no existen ingenieros");
                    }else{
                           LOGIN();
                    }
                    break;
                    
                  
                  
            
        
>>>>>>> 31f93e486bcb844af55d03b973c3fc6adae2bf54
    }
        }
        
    
}

    private static void crearIngenieros() {
//        String correo, String nombreusuario, String contraseña, 
//int cafe, Date fecha, String nombre, String gruposangre, String sexo, int altura, int peso
        String correo=JOptionPane.showInputDialog("correo electronico:");
        String nombreusuario=JOptionPane.showInputDialog(" nombre de usuario");
        String contraseña=JOptionPane.showInputDialog("contraseña");
        int cafe=Integer.parseInt(JOptionPane.showInputDialog("cantidad de cafe"));
        String fecha=JOptionPane.showInputDialog("fecha de nacimiento");
        String nombre=JOptionPane.showInputDialog("nombre");
        int altura=Integer.parseInt(JOptionPane.showInputDialog("altura"));
        int peso=Integer.parseInt(JOptionPane.showInputDialog("peso"));
        ingenieros.add(new Ingenieros(correo, nombreusuario, contraseña, cafe, fecha, nombre, nombre, fecha, altura, peso));
        
    }

    private static void LOGIN() {
      String usuario1=JOptionPane.showInputDialog("ingrese usuario:");
      String contraseña=JOptionPane.showInputDialog("ingrese contraseña:");
      for (int i = 0; i < ingenieros.size(); i++) {
          if(ingenieros.get(i).getNombreusuario().equals(usuario1)){
              if(ingenieros.get(i).getContraseña().equals(contraseña)){
                  opcionesingeniero(i);
              }else{
                  JOptionPane.showMessageDialog(null,"datos incorectos");
              }
          }
               
          
      }
    }

    private static void opcionesingeniero(int i) {
        String opcion="";
    
         while (!opcion.equals("e")){
            opcion=JOptionPane.showInputDialog("a. transportes\n"
                    + "b.ingenieros\n"
                    + "c.primates\n"
                    + "d.viajes\n"
                    + "e.salir");
            
           switch(opcion){
               case"a":
                   transportes();
                   break;
               case "b":
                   ingenieros();
                   break;
               case "c":
                   primates();
                   break;
                   
               case "d":
                   viajes();
                   break;
                   
           }
         }
         
    }

    private static void transportes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void ingenieros() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void primates() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void viajes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
