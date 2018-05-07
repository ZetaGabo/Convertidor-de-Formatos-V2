/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Jev
 */
public class PanelBotones extends JPanel {

    public JButton botonAudio, botonImagen, botonVideo, botonSalir;
    private JLabel texto;

    public PanelBotones() {
        initComp();
    }

    private void initComp() {
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        this.setBackground(Color.CYAN.darker());

        this.botonAudio = new JButton("Audio");
        // this.botonAudio.setBackground(Color.ORANGE.brighter());
        this.botonImagen = new JButton("Imagen");
        // this.botonImagen.setBackground(Color.MAGENTA.darker().darker());
        this.botonVideo = new JButton("Video");
        // this.botonVideo.setBackground(Color.PINK.brighter());
        this.botonSalir = new JButton("Salir");
        // this.botonSalir.setBackground(Color.blue);

        gbc.insets = new Insets(0, 0, 50, 0);

        this.texto = new JLabel("Convertir:");
        this.texto.setFont(new Font("Verdana", Font.BOLD, 25));
        this.add(texto, gbc);

        gbc.insets = new Insets(0, 0, 0, 0);
        gbc.gridx = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        this.add(botonAudio, gbc);
        this.add(botonImagen, gbc);
        this.add(botonVideo, gbc);

        gbc.insets = new Insets(50, 0, 10, 0);

        this.add(botonSalir, gbc);

    }

}
