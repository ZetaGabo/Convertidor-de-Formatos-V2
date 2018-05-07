/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JOptionPane;

/**
 *
 * @author Jev
 */
public class JOp extends JOptionPane{

    public JOp(Object message, int messageType) {
        super(message, messageType);
    }
    
    public void mensaje(String mensaje){
        JOp.showMessageDialog(this, message);
    }
    
}
