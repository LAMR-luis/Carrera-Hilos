package com.mycompany.proyectofinal;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Hansen
 */
public class VentanaConPanel extends JFrame implements ActionListener {

    PanelPrincipal panelPrincipal;

    public void ConfigurarVentana() {
        this.setTitle("Ventana con JPanel");
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        this.setVisible(true);
        this.setLayout(new BorderLayout());
    }

    public void agregarElementos() {
        panelPrincipal = new PanelPrincipal();
        this.add(panelPrincipal, BorderLayout.CENTER);
        panelPrincipal = new PanelPrincipal();
    }

    public void mostrarVentana() {
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {     
        this.repaint();
    }

}