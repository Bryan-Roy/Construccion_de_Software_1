/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana08.practica2;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author BRYANROY
 */
public class DialogMensaje extends JFrame{
    public DialogMensaje() {

      JOptionPane.showMessageDialog(null,
      "Existen actualizaciones para el programa.");
    }

    public static void main(String[] arguments) {
        DialogMensaje dialog = new DialogMensaje();
    }
}
