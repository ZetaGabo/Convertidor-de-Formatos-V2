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

    public JButton botonAudio, botonImagen, botonVideo;
    private JLabel texto;

    public PanelBotones() {
        this.inicializarComponentes();
    }

    private void inicializarComponentes() {
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        this.setBackground(Color.WHITE.darker());

        this.botonAudio = new JButton("Audio");
        this.botonAudio.setBackground(Color.WHITE.brighter());

        this.botonImagen = new JButton("Imagen");
        this.botonImagen.setBackground(Color.WHITE.brighter());

        this.botonVideo = new JButton("Video");
        this.botonVideo.setBackground(Color.WHITE.brighter());

        gbc.insets = new Insets(0, 0, 40, 10);

        this.texto = new JLabel("Convertir:");
        this.texto.setFont(new Font("Verdana", Font.BOLD, 20));
        this.add(texto, gbc);

        gbc.insets = new Insets(0, 0, 5, 0);
        gbc.gridx = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        this.add(botonAudio, gbc);
        this.add(botonImagen, gbc);
        this.add(botonVideo, gbc);

    }

}