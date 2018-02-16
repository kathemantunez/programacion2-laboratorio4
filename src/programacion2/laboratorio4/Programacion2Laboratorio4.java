/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2.laboratorio4;

import java.util.ArrayList;
import javax.swing.JOptionPane;


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
    }
    
}
