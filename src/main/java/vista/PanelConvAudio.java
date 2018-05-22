/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author Jev
 */
public class PanelConvAudio extends JPanel {

    private PanelBotones2 bot;
    private JScrollPane scrollPaneles;

    private Panel1 panel1, panel2;

    public PanelConvAudio() {
        this.inicializarComponentes();
    }

    private void inicializarComponentes() {
        this.setLayout(new BorderLayout());
        this.setBackground(Color.DARK_GRAY.brighter());

        this.bot = new PanelBotones2();
        this.bot.botonAtras.setEnabled(false);
        this.add(this.bot, BorderLayout.SOUTH);

        this.panel1 = new Panel1();
        this.panel2 = new Panel1();

        this.scrollPaneles = new JScrollPane();
        this.add(scrollPaneles, BorderLayout.CENTER);
        this.scrollPaneles.setViewportView(this.panel1);

        this.bot.botonAtras.addActionListener(e -> {
            if (panel2.isVisible()) {
                this.bot.botonAtras.setEnabled(false);
                this.scrollPaneles.setViewportView(this.panel1);
            } else {
            }

        });

        this.bot.botonSiguiente.addActionListener(e -> {
            if (panel1.isVisible()) {
                this.bot.botonAtras.setEnabled(true);
                this.scrollPaneles.setViewportView(this.panel2);
            } else {
            }
        });

    }

}
