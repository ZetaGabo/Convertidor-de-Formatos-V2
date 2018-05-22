/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Jev
 */
public class PanelConvVideo extends JPanel {

    private PanelBotones2 bot;
    
    public PanelConvVideo() {
        this.inicializarComponentes();
    }

    private void inicializarComponentes() {
        this.setLayout(new BorderLayout());
        this.setBackground(Color.DARK_GRAY.brighter());
        this.bot = new PanelBotones2();
        this.bot.botonAtras.setEnabled(false);
        add(this.bot, BorderLayout.SOUTH);
    }
    
   

}

