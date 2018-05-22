/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

/**
 *
 * @author Jev
 */
public class VentanaPrincipal extends JFrame {

    private PanelBotones botones;
    private JScrollPane scrollPaneles;
    private PanelConvAudio audio;
    private PanelConvImagen imagen;
    private PanelConvVideo video;

    public VentanaPrincipal() {
        this.inicializarComponentes();
    }

    private void inicializarComponentes() {
        this.setTitle("Convertidor");
        this.setSize(450, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.scrollPaneles = new JScrollPane();
        this.botones = new PanelBotones();

        this.audio = new PanelConvAudio();
        this.imagen = new PanelConvImagen();
        this.video = new PanelConvVideo();

        this.add(scrollPaneles, BorderLayout.CENTER);

        this.botones.botonAudio.addActionListener(e -> {
            this.scrollPaneles.setViewportView(this.audio);
            this.botones.botonAudio.setBackground(Color.WHITE.darker());
            this.botones.botonImagen.setBackground(Color.WHITE);
            this.botones.botonVideo.setBackground(Color.WHITE);
        });

        this.botones.botonImagen.addActionListener(e -> {
            this.scrollPaneles.setViewportView(this.imagen);
            this.botones.botonImagen.setBackground(Color.WHITE.darker());
            this.botones.botonAudio.setBackground(Color.WHITE);
            this.botones.botonVideo.setBackground(Color.WHITE);
        });

        this.botones.botonVideo.addActionListener(e -> {
            this.scrollPaneles.setViewportView(this.video);
            this.botones.botonVideo.setBackground(Color.WHITE.darker());
            this.botones.botonImagen.setBackground(Color.WHITE);
            this.botones.botonAudio.setBackground(Color.WHITE);
        });

        this.add(botones, BorderLayout.WEST);

        this.setVisible(true);

    }

}
