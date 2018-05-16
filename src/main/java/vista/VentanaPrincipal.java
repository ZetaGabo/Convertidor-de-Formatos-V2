/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import vista.jdialogs.EjemploJDialog;
import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author Jev
 */
public class VentanaPrincipal extends JFrame {

    private PanelBotones panelBtns;

    public VentanaPrincipal() {
        initComp();
    }

    private void initComp() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 350);
        setLocationRelativeTo(null);

        panelBtns = new PanelBotones();
        
        panelBtns.botonAudio.addActionListener(e -> {
            new EjemploJDialog(this, true).setVisible(true);
        });
        panelBtns.botonImagen.addActionListener(e -> {
            
        });
        panelBtns.botonVideo.addActionListener(e -> {
            
        });
        panelBtns.botonSalir.addActionListener(e -> {
            System.exit(0);
        });
        
        add(panelBtns, BorderLayout.CENTER);
        
        setVisible(true);
    }
}
