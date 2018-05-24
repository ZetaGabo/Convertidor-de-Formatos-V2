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
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Jev
 */
public class PanelOpciones extends JPanel {

    public ButtonGroup canales, calidad;
    private JLabel textCan, textCal;

    public PanelOpciones() {
        this.inicializarComponentes();
    }

    private void inicializarComponentes() {
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        this.setBorder(BorderFactory.createTitledBorder("Opciones de audio "));
        
        canales = new ButtonGroup();
        JRadioButton boton1 = new JRadioButton("Mono", false);
        JRadioButton boton2 = new JRadioButton("Stereo", true);
        canales.add(boton1);
        canales.add(boton2);

        calidad = new ButtonGroup();
        JRadioButton boton3 = new JRadioButton("64 kbps", false);
        JRadioButton boton4 = new JRadioButton("128 kbps", false);
        JRadioButton boton5 = new JRadioButton("240 kbps", false);
        JRadioButton boton6 = new JRadioButton("320 kbps", true);
        calidad.add(boton3);
        calidad.add(boton4);
        calidad.add(boton5);
        calidad.add(boton6);

        textCan = new JLabel("Canales: ");
        textCan.setFont(new Font("Verdana", Font.BOLD, 12));
        textCal = new JLabel("Calidad: ");        
        textCal.setFont(new Font("Verdana", Font.BOLD, 12));

        gbc.gridx = 1;   
        gbc.fill = GridBagConstraints.HORIZONTAL;
        this.add(textCan, gbc);
        this.add(boton1, gbc);
        this.add(boton2, gbc);

        
        gbc.insets = new Insets(15, 0, 0, 0);        
        this.add(textCal, gbc);
        
        gbc.insets = new Insets(0, 0, 0, 0);
        this.add(boton3, gbc);
        this.add(boton4, gbc);
        this.add(boton5, gbc);
        this.add(boton6, gbc);

    }

}
