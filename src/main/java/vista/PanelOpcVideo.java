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
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Gabo
 */
public class PanelOpcVideo extends JPanel{
    public JComboBox tamanho, codec, tasaImg;
    private JLabel textTam, textCod, textTasaImg;

    public PanelOpcVideo() {
        this.inicializarComponentes();
    }

    private void inicializarComponentes() {
        String[] tamanhos = {"1920x1080", "1280x720", "720x576", "720x480", "640x480", "640x360", "320x240", "240x180"};
        String[] codecs = {"H.263", "H.264", "MPEG4", "XVID", "FLV", };
        String[] tasasImg = {"60 fps", "59,94 fps", "50 fps", "30 fps", "29,97 fps", "25 fps", "24 fps", "23,976 fps", "15 fps", "12 fps"};
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        this.setBorder(BorderFactory.createTitledBorder("Opciones de video "));
        
        tamanho = new JComboBox(tamanhos);

        codec = new JComboBox(codecs);
        
        tasaImg = new JComboBox(tasasImg);
        
        textTam = new JLabel("Tamaño: ");
        textTam.setFont(new Font("Verdana", Font.BOLD, 12));
        textCod = new JLabel("Codec de Video: ");        
        textCod.setFont(new Font("Verdana", Font.BOLD, 12));
        textTasaImg = new JLabel("Tasa de Imágenes: ");        
        textTasaImg.setFont(new Font("Verdana", Font.BOLD, 12));

        gbc.gridx = 1;   
        gbc.fill = GridBagConstraints.HORIZONTAL;
        this.add(textTam, gbc);
        this.add(tamanho, gbc);
     
        gbc.insets = new Insets(15, 0, 0, 0);        
        this.add(textCod, gbc);
        
        gbc.insets = new Insets(0, 0, 0, 0);
        this.add(codec, gbc);
        
        gbc.insets = new Insets(15, 0, 0, 0);        
        this.add(textTasaImg, gbc);
        
        gbc.insets = new Insets(0, 0, 0, 0);
        this.add(tasaImg, gbc);
}
}