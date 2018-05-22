/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Jev
 */
public class Panel1 extends JPanel {  //panel 1,2,3 nombres temporales

    private JComboBox cb;
    private JButton btn;
    private JLabel lb;

    public Panel1(String textoBtn, String textoLbl) {
        this.inicializarComponentes(textoBtn, textoLbl);
    }

    private void inicializarComponentes(String textoBtn, String textoLbl) {
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        cb = new JComboBox();
        cb.addItem("Mp3");
        btn = new JButton(textoBtn);
        lb = new JLabel(textoLbl);
        lb.setFont(new Font("Verdana", Font.BOLD, 15));

        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 0, 10, 0);

        add(lb, gbc);
        gbc.insets = new Insets(0, 0, 0, 0);
        add(cb, gbc);
        add(btn, gbc);

    }

}
