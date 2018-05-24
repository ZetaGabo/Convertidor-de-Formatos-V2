/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Jev
 */
public class PanelBotonesPnl extends JPanel {

    public JButton botonAtras, botonSiguiente;

    public PanelBotonesPnl() {
        this.inicializarComponentes();
    }

    private void inicializarComponentes() {
        this.setLayout(new GridLayout(1,2));
        this.botonAtras = new JButton("Atrás");
        this.botonSiguiente = new JButton("Siguiente");
        this.add(botonAtras);
        this.add(botonSiguiente);
    }

}