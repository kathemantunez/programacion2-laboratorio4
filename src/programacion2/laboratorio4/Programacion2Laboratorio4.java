/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2.laboratorio4;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author KATHERINE
 */
public class Programacion2Laboratorio4 {
static ArrayList<Ingenieros> ingenieros=new ArrayList();
static Aereo aereo=new Aereo();
static ArrayList<Primates> primate=new ArrayList();
static Mono_Baboon mono=new Mono_Baboon();
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
        
    }

    private static void ingenieros() {
       String opcion="";
            opcion=JOptionPane.showInputDialog("a. listar ingenieros\n"
                    + "b.modificar ingenieros");
            
           switch(opcion){
               case"a":
                   String cadena1="";
                int c1=1;
            for (int i = 0; i < ingenieros.size(); i++) {
                 
                cadena1+=c1+")"+ingenieros.get(i)+"\n";
                c1++;
            }
            JOptionPane.showMessageDialog(null, cadena1);
            
                   break;
                   
               case "b":
                  String cadena="";
                int c=1;
            for (int i = 0; i < ingenieros.size(); i++) {
                 
                cadena+=c+")"+ingenieros.get(i)+"\n";
                c++;
            }
            int p=Integer.parseInt(JOptionPane.showInputDialog(cadena,"Escoja ingeniero para modificar"));
            
             String correo=JOptionPane.showInputDialog("nuevo correo electronico:");
             ingenieros.get(p-1).setCorreo(correo);
        String nombreusuario=JOptionPane.showInputDialog(" nuevo nombre de usuario");
        ingenieros.get(p-1).setNombreusuario(nombreusuario);
        
        String contraseña=JOptionPane.showInputDialog("nueva contraseña");
        ingenieros.get(p-1).setContraseña(contraseña);
        int cafe=Integer.parseInt(JOptionPane.showInputDialog("nueva cantidad de cafe"));
        ingenieros.get(p-1).setCafe(cafe);
        String fecha=JOptionPane.showInputDialog("nueva fecha de nacimiento");
        ingenieros.get(p-1).setFecha(fecha);
        String nombre=JOptionPane.showInputDialog("nuevo nombre");
        ingenieros.get(p-1).setNombre(nombre);
        int altura=Integer.parseInt(JOptionPane.showInputDialog("nueva altura"));
        ingenieros.get(p-1).setAltura(altura);
        int peso=Integer.parseInt(JOptionPane.showInputDialog("nuevo peso"));
        ingenieros.get(p-1).setPeso(peso);
                   break;
    }
    }

    private static void primates()  {
        String opcion="";
            opcion=JOptionPane.showInputDialog("a. crear primates\n"
                    + "b.listar primates\n"
                    + "c. modificar primates\n"
                    + "d.eliminar primates");
            switch(opcion){
                case "a":
//                    String area, int cantidadcomida, String planeta, String lugarnacimiento
                    String opcion2="";
                 opcion2=JOptionPane.showInputDialog("a.Mono Baboon\n"
                         + "b.gorila de montaña");
                 if(opcion2.equals("a")){
//                     Color colorpelo, String area, int cantidadcomida, 
//                             String planeta, String lugarnacimiento, String nombre, String gruposangre, String sexo, int altura, int peso
                       String colorpelo=JOptionPane.showInputDialog("color de pelo");
                       
                        String area=JOptionPane.showInputDialog("area asignada(aérea espacial/aérea normal)");
                     int contidadcomida=Integer.parseInt(JOptionPane.showInputDialog("cantidad de comida por km"));
                     String planeta=JOptionPane.showInputDialog("planeta");
                     String lugarnacimieto=JOptionPane.showInputDialog("lugar de nacimiento");
                     String nombre=JOptionPane.showInputDialog("nombre");
                     String gruposangre=JOptionPane.showInputDialog("grupo de sangre");
                      int altura=Integer.parseInt(JOptionPane.showInputDialog("altura"));
                      primate.add(new Mono_Baboon(colorpelo, area, contidadcomida, planeta, lugarnacimieto, nombre, gruposangre, area, altura, altura));
                      
                 }else{
//                     int IQ, String area, int cantidadcomida,
//                             String planeta, String lugarnacimiento, String nombre, String gruposangre, String sexo, int altura, int peso
                        int IQ=Integer.parseInt(JOptionPane.showInputDialog("IQ (130-139)"));
                         String area=JOptionPane.showInputDialog("area asignada(aérea espacial/aérea normal)");
                     int contidadcomida=Integer.parseInt(JOptionPane.showInputDialog("cantidad de comida por km"));
                     String planeta=JOptionPane.showInputDialog("planeta");
                     String lugarnacimieto=JOptionPane.showInputDialog("lugar de nacimiento");
                     String nombre=JOptionPane.showInputDialog("nombre");
                     String gruposangre=JOptionPane.showInputDialog("grupo de sangre");
                      int altura=Integer.parseInt(JOptionPane.showInputDialog("altura"));
                      primate.add(new Gorila_montaña(IQ, area, contidadcomida, planeta, lugarnacimieto, nombre, gruposangre, area, altura, altura));
                 }
                
                     
                    break;
                case "b":
                    
                      String cadena1="";
                             int c1=1;
                         for (int i = 0; i < primate.size(); i++) {

                             cadena1+=c1+")"+primate.get(i)+"\n";
                             c1++;
                         }
                         JOptionPane.showMessageDialog(null, cadena1);
                    break;
                case "c":
                      String cadena="";
                        int c=1;
                    for (int i = 0; i < primate.size(); i++) {

                        cadena+=c+")"+primate.get(i)+"\n";
                        c++;
                    }
                    int p=Integer.parseInt(JOptionPane.showInputDialog(cadena,"Escoja primate para modificar"));
                    
                    if(primate.get(p-1)instanceof Mono_Baboon){
                        String colorpelo=JOptionPane.showInputDialog("color de pelo");
                        ((Mono_Baboon)primate.get(p-1)).setColorpelo(colorpelo);
//                   
                        String area=JOptionPane.showInputDialog("area asignada(aérea espacial/aérea normal)");
                         ((Mono_Baboon)primate.get(p-1)).setArea(area);
                     int cantidadcomida=Integer.parseInt(JOptionPane.showInputDialog("cantidad de comida por km"));
                      ((Mono_Baboon)primate.get(p-1)).setCantidadcomida(cantidadcomida);
                     String planeta=JOptionPane.showInputDialog("planeta");
                      ((Mono_Baboon)primate.get(p-1)).setPlaneta(planeta);
                     String lugarnacimieto=JOptionPane.showInputDialog("lugar de nacimiento");
                      ((Mono_Baboon)primate.get(p-1)).setLugarnacimiento(lugarnacimieto);
                     String nombre=JOptionPane.showInputDialog("nombre");
                      ((Mono_Baboon)primate.get(p-1)).setNombre(nombre);
                     String gruposangre=JOptionPane.showInputDialog("grupo de sangre");
                      ((Mono_Baboon)primate.get(p-1)).setGruposangre(gruposangre);
                      int altura=Integer.parseInt(JOptionPane.showInputDialog("altura"));
                       ((Mono_Baboon)primate.get(p-1)).setAltura(altura);
                    }else{
                        if(primate.get(p-1)instanceof Gorila_montaña){
                             int IQ2=Integer.parseInt(JOptionPane.showInputDialog("IQ (130-139)"));
                             
                             
                         String area=JOptionPane.showInputDialog("area asignada(aérea espacial/aérea normal)");
                          ((Mono_Baboon)primate.get(p-1)).setArea(area);
                     int contidadcomida=Integer.parseInt(JOptionPane.showInputDialog("cantidad de comida por km"));
                      ((Mono_Baboon)primate.get(p-1)).setCantidadcomida(contidadcomida);
                     String planeta=JOptionPane.showInputDialog("planeta");
                      ((Mono_Baboon)primate.get(p-1)).setPlaneta(planeta);
                     String lugarnacimieto=JOptionPane.showInputDialog("lugar de nacimiento");
                      ((Mono_Baboon)primate.get(p-1)).setLugarnacimiento(lugarnacimieto);
                     String nombre=JOptionPane.showInputDialog("nombre");
                      ((Mono_Baboon)primate.get(p-1)).setNombre(nombre);
                     String gruposangre=JOptionPane.showInputDialog("grupo de sangre");
                      ((Mono_Baboon)primate.get(p-1)).setGruposangre(gruposangre);
                      int altura=Integer.parseInt(JOptionPane.showInputDialog("altura"));
                       ((Mono_Baboon)primate.get(p-1)).setAltura(altura);
                        }
                    }
                    break;
                case "d":
                    String cadena2="";
                             int c2=1;
                         for (int i = 0; i < primate.size(); i++) {

                             cadena2+=c2+")"+primate.get(i)+"\n";
                             c2++;
                         }
                         int p2=Integer.parseInt(JOptionPane.showInputDialog(cadena2,"Escoja primate para eliminar"));
                         primate.remove(p2-1);
                    break;
                    
            }
    }

    private static void viajes() {
         
    }
    }
