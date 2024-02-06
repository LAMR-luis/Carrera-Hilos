package com.mycompany.proyectofinal;

import static com.mycompany.proyectofinal.PanelPrincipal.valorEjeX;
import static com.mycompany.proyectofinal.PanelPrincipal.valorEjeX2;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Hansen
 */
public class Demonio1 extends Thread implements Runnable {
    
    VentanaConPanel ventanaConPanel;
    
    public Demonio1(VentanaConPanel ventanaConPanel){
        this.ventanaConPanel = ventanaConPanel;
    }

    @Override
    public void run() {
        
        while(true)
        {
            
            Random rand = new Random();
            int avanza = rand.nextInt(5)*10;
            int avanza1 = rand.nextInt(5)*10;
            
            
            if (PanelPrincipal.valorEjeX2 <= 600) {
                PanelPrincipal.valorEjeX2 = PanelPrincipal.valorEjeX2 + avanza;
                this.ventanaConPanel.repaint();
            }
            
            if (PanelPrincipal.valorEjeX <= 600) {
                PanelPrincipal.valorEjeX = PanelPrincipal.valorEjeX + avanza1;
                this.ventanaConPanel.repaint();
            }
            
            if (valorEjeX >= 600 && valorEjeX2 < 600) {
                JOptionPane.showMessageDialog(null, "LA BOLA GRIS GANA!!!");
                return;
            }
            if (valorEjeX2 >= 600 && valorEjeX < 600) {
                JOptionPane.showMessageDialog(null, "LA BOLA ROSA GANA!!!");
                return;
            } 
            
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Demonio1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}