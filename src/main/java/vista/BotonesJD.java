/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Jev
 */
public class BotonesJD extends JPanel {

    public JButton b1, b2, b3;

    public BotonesJD() {
        initComp();
    }

    private void initComp() {
        this.setLayout(new GridLayout(1,3));
        b1 = new JButton("Atras");
        b2 = new JButton("Cancelar");
        b3 = new JButton("Siguiente");
        add(b1);
        add(b2);
        add(b3);
    }

}
