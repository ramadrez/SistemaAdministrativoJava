/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import conexion.Conexion;
import controlador.Ctrl_DB;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String args[]) {

        Ctrl_DB cdb = new Ctrl_DB();
        Login login = new Login();
        CrearUsuarioAdmin cus = new CrearUsuarioAdmin();
        ConexionBD CBD = new ConexionBD();

        if (Conexion.conectar() == null) {
            CBD.setVisible(true);

        } else if (!cdb.verificacionBD()) {
            if (cdb.CrearBD()) {
                if (CBD.CargarBaseDatos()) {
                    if (!cdb.Administrador()) {
                        JOptionPane.showMessageDialog(null, "¡Ups! No encontramos al Administrador Principal. ¡Vamos a crearlo ahora mismo!");
                        cus.setVisible(true);
                    } else {
                        login.setVisible(true);
                    }
                } else {
                    System.exit(0);
                }
            } else {
                System.exit(0);
            }

        } else if (!cdb.verificacionTablas()) {
            if (CBD.CargarBaseDatos()) {
                if (!cdb.Administrador()) {
                    JOptionPane.showMessageDialog(null, "¡Ups! No encontramos al Administrador Principal. ¡Vamos a crearlo ahora mismo!");
                    cus.setVisible(true);
                } else {
                    login.setVisible(true);
                }
            } else {
                System.exit(0);
            }

        } else {
            if (!cdb.Administrador()) {
                JOptionPane.showMessageDialog(null, "¡Ups! No encontramos al Administrador Principal. ¡Vamos a crearlo ahora mismo!");
                cus.setVisible(true);
            } else {
                login.setVisible(true);
            }
        }

    }

}
