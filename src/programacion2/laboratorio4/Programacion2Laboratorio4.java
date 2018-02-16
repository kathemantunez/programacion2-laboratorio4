/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2.laboratorio4;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Programacion2Laboratorio4 {

    static ArrayList<Ingenieros> ingenieros = new ArrayList();
    static ArrayList<MediosdeTransporte> Transportes = new ArrayList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String opcion = "";
        while (!opcion.equals("c")) {
            opcion = JOptionPane.showInputDialog("a.agregar ingenieros\n"
                    + "b.LOG IN\n"
                    + "c. salir");
            switch (opcion) {

                case "a":
                    crearIngenieros();
                    break;
                case "b":
                    if (ingenieros.size() == 0) {
                        JOptionPane.showMessageDialog(null, "no existen ingenieros");
                    } else {
                        LOGIN();
                    }
                    break;
            }
        }

    }

    private static void crearIngenieros() {
//        String correo, String nombreusuario, String contraseña, 
//int cafe, Date fecha, String nombre, String gruposangre, String sexo, int altura, int peso
        String correo = JOptionPane.showInputDialog("correo electronico:");
        String nombreusuario = JOptionPane.showInputDialog(" nombre de usuario");
        String contraseña = JOptionPane.showInputDialog("contraseña");
        int cafe = Integer.parseInt(JOptionPane.showInputDialog("cantidad de cafe"));
        String fecha = JOptionPane.showInputDialog("fecha de nacimiento");
        String nombre = JOptionPane.showInputDialog("nombre");
        int altura = Integer.parseInt(JOptionPane.showInputDialog("altura"));
        int peso = Integer.parseInt(JOptionPane.showInputDialog("peso"));
        ingenieros.add(new Ingenieros(correo, nombreusuario, contraseña, cafe, fecha, nombre, nombre, fecha, altura, peso));

    }

    private static void LOGIN() {
        String usuario1 = JOptionPane.showInputDialog("ingrese usuario:");
        String contraseña = JOptionPane.showInputDialog("ingrese contraseña:");
        for (int i = 0; i < ingenieros.size(); i++) {
            if (ingenieros.get(i).getNombreusuario().equals(usuario1)) {
                if (ingenieros.get(i).getContraseña().equals(contraseña)) {
                    opcionesingeniero(i);
                } else {
                    JOptionPane.showMessageDialog(null, "datos incorectos");
                }
            }

        }
    }

    private static void opcionesingeniero(int i) {
        String opcion = "";

        while (!opcion.equals("e")) {
            opcion = JOptionPane.showInputDialog("a. transportes\n"
                    + "b.ingenieros\n"
                    + "c.primates\n"
                    + "d.viajes\n"
                    + "e.salir");

            switch (opcion) {
                case "a":
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
        String Menu;
        do {
            Menu = JOptionPane.showInputDialog("+-+TRANSPORTES+-+"
                    + "a. Crear"
                    + "b. Listar"
                    + "c. Modificar"
                    + "d. Eliminar"
                    + "e. Salir");

            switch (Menu) {
                case "a":
                    String Menu2;
                    String Menu3;
                    do {
                        Menu2 = JOptionPane.showInputDialog("DESEA CREAR"
                                + "a. Aereo Nave Normal"
                                + "b. Espacial");
                        if (Menu2.equalsIgnoreCase("a")) {
                            String gasolina;
                            int Tipo = 0;
                            do {
                                Menu3 = JOptionPane.showInputDialog("Aereo Nave"
                                        + "a. Helicoptero"
                                        + "b. Avion");
                            } while (!Menu3.equalsIgnoreCase("a") || !Menu3.equalsIgnoreCase("b") || !Menu3.equalsIgnoreCase("c"));
                            if (Menu3.equalsIgnoreCase("a")) {
                                Tipo = 1;
                            } else if (Menu3.equalsIgnoreCase("b")) {
                                Tipo = 2;
                            }

                            do {
                                Menu3 = JOptionPane.showInputDialog("Tipo de Gasolina."
                                        + "a. Super"
                                        + "b. Regular"
                                        + "c. Diesel");
                            } while (!Menu3.equalsIgnoreCase("a") || !Menu3.equalsIgnoreCase("b") || !Menu3.equalsIgnoreCase("c"));
                            if (Menu3.equalsIgnoreCase("a")) {
                                gasolina = "Super";
                            } else if (Menu3.equalsIgnoreCase("b")) {
                                gasolina = "Regular";
                            } else if (Menu3.equalsIgnoreCase("c")) {
                                gasolina = "Diesel";
                            }

                            if (Tipo == 1) {
                                String helices = JOptionPane.showInputDialog("Helices:");
                                String patas = JOptionPane.showInputDialog("Patas:");
                                String partida = JOptionPane.showInputDialog("Pais de artida:");
                                String llegada = JOptionPane.showInputDialog("Pais de LLegada:");
                                String tanque = JOptionPane.showInputDialog("DIstancia que recorre con tanque lleno:");
                                String altitud = JOptionPane.showInputDialog("Altitud:");
                                Transportes.add(new Helicoptero());
                            } else if (Tipo == 2) {

                                Transportes.add(new Avion());
                            }

                        } else {
                            Transportes.add(new Espacial());
                        }
                    } while (!Menu2.equalsIgnoreCase("a") || !Menu2.equalsIgnoreCase("b"));

            }
        } while (!Menu.equalsIgnoreCase("e"));
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
