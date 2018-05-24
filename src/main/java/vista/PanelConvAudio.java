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

    private PanelBotonesPnl bot;
    private JScrollPane scrollPaneles;
    private int cont = 0;

    private PanelArchivo panel1, panel2;
    private PanelOpcAudio panel3;
    private PanelConvertir panel4;

    public PanelConvAudio() {
        this.inicializarComponentes();
    }

    private void inicializarComponentes() {
        this.setLayout(new BorderLayout());
        this.setBackground(Color.DARK_GRAY.brighter());

        this.bot = new PanelBotonesPnl();
        this.bot.botonAtras.setEnabled(false);
        this.add(this.bot, BorderLayout.SOUTH);

        String[] formatos = {"Mp3", "Wav", "Flac"};
        this.panel1 = new PanelArchivo("Buscar archivo", "Archivo a convertir:", formatos);
        this.panel2 = new PanelArchivo("Guardar en", "Convertir archivo a:", formatos);
        this.panel3 = new PanelOpcAudio();
        this.panel4 = new PanelConvertir();

        this.scrollPaneles = new JScrollPane();
        this.add(scrollPaneles, BorderLayout.CENTER);
        this.scrollPaneles.setViewportView(this.panel1);

        this.bot.botonAtras.addActionListener(e -> {
            if (cont == 1) {
                this.bot.botonAtras.setEnabled(false);
                this.scrollPaneles.setViewportView(this.panel1);
                cont--;
            } else if (cont == 2) {
                this.scrollPaneles.setViewportView(this.panel2);
                cont--;
            } else if (cont == 3) {
                this.scrollPaneles.setViewportView(this.panel3);
                this.bot.botonSiguiente.setEnabled(true);
                cont--;
            }

        });

        this.bot.botonSiguiente.addActionListener(e -> {
            if (cont == 0) {
                this.bot.botonAtras.setEnabled(true);
                this.scrollPaneles.setViewportView(this.panel2);
                cont++;
            } else if (cont == 1) {
                this.scrollPaneles.setViewportView(this.panel3);
                cont++;
            } else if (cont == 2) {
                this.scrollPaneles.setViewportView(this.panel4);
                this.bot.botonSiguiente.setEnabled(false);
                cont++;
            }
        });

    }

}
