/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.jdialogs;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Jev
 */
public class EjemploJDialog extends JDialog {

    private BotonesJD bjd;
    private JComboBox cb;
    private JButton btn;
    private JLabel lb;

    public EjemploJDialog(Frame owner, boolean modal) {
        super(owner, modal);
        initComp(owner);
    }

    private void initComp(Frame owner) {
        this.setSize(300, 200);
        this.setLocationRelativeTo(owner);
        this.setLayout(new BorderLayout());

        bjd = new BotonesJD();
        bjd.b1.setEnabled(false);

        bjd.b1.addActionListener(e -> {
            System.out.println("kk");
        });

        bjd.b2.addActionListener(e -> {
            this.dispose();
        });

        bjd.b3.addActionListener(e -> {
            new Ej2(this, true).setVisible(true);
        });

        cb = new JComboBox();
        btn = new JButton("Buscar");
        lb = new JLabel("Archivo a convertir:");
        lb.setFont(new Font("Verdana", Font.BOLD, 15));
        
        JPanel p = new JPanel();
        p.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 0, 10, 0);
        
        p.add(lb, gbc);
        gbc.insets = new Insets(0, 0, 0, 0);
        p.add(cb, gbc);
        p.add(btn, gbc);
        
        add(p, BorderLayout.CENTER);
        add(bjd, BorderLayout.SOUTH);

    }

}
