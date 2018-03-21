/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen3angelcapa;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Capa Brothers
 */
public class Banco {

    static ArrayList<Cuenta> listaCuenta = new ArrayList<Cuenta>();

    public static void agregar(Cuenta cuenta) {
        listaCuenta.add(cuenta);
    }

    public static void grabar() {
        PrintWriter pw = null;
        try {
            FileWriter fw = new FileWriter("C://Users//Personal//Documents//NetBeansProjects//Examen1_JorgePucha/Banco.txt", true);
            pw = new PrintWriter(fw);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        for (Cuenta cuenta : listaCuenta) {
            String linea = "";
            if (cuenta instanceof Cuenta) {
//                linea="Circulo"+";"+((Circulo) figura).getPunto().toString();
            }
            pw.println(linea);
        }
        pw.close();
    }
}
