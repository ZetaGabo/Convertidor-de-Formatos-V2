/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Jev
 */
public class PanelConvertir extends JPanel {

    private JTextArea areaDatos;
    private JButton botonComenzar;

    public PanelConvertir() {
        this.inicializarComponentes();
    }

    private void inicializarComponentes() {
        this.setLayout(new BorderLayout());
        this.setBorder(BorderFactory.createTitledBorder("Convertir "));
        areaDatos = new JTextArea();
        areaDatos.setEditable(false);

        Date fecha = new Date();
        areaDatos.setText(areaDatos.getText() + "\n" + fecha);
        areaDatos.setBackground(Color.DARK_GRAY.brighter());
        areaDatos.setForeground(Color.white);
        areaDatos.setFont(new Font("Verdana", Font.ITALIC, 11));

        botonComenzar = new JButton("Comenzar a convertir...");

        add(areaDatos, BorderLayout.CENTER);
        add(botonComenzar, BorderLayout.SOUTH);
    }

}
