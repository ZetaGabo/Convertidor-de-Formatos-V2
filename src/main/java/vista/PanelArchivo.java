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
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Jev
 */
public class PanelArchivo extends JPanel {

    private JComboBox cb;
    private JButton btn;
    private JLabel lb;
    private final String textoBtn, textoLb;
    private String[] formatos; 

    public PanelArchivo(String textoBtn, String textoLb, String[] formatos) {
        this.textoBtn = textoBtn;
        this.textoLb = textoLb;
        this.formatos = formatos;
        this.inicializarComponentes();
    }

    private void inicializarComponentes() {
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        this.setBorder(BorderFactory.createTitledBorder("Archivo "));

        cb = new JComboBox(this.formatos);         
        btn = new JButton(textoBtn);

        btn.addActionListener(e -> {
            JFileChooser dig = new JFileChooser();
            int opcion = dig.showOpenDialog(this);
            if (opcion == JFileChooser.APPROVE_OPTION) {
                String file = dig.getSelectedFile().getPath();
            }
        });

        lb = new JLabel(textoLb);
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
