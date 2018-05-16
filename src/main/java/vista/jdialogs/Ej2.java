/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.jdialogs;

import java.awt.BorderLayout;
import java.awt.Dialog;
import javax.swing.JDialog;

/**
 *
 * @author Jev
 */
public class Ej2 extends JDialog {
    
    public BotonesJD btns;

    public Ej2(Dialog owner, boolean modal) {
        super(owner, modal);
        initComp();
    }

    private void initComp() {
        this.setSize(300, 200);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        btns = new BotonesJD();
        add(btns, BorderLayout.SOUTH);
    }

    
    
}
