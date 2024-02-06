package com.mycompany.proyectofinal;

/**
 *
 * @author Hansen
 */
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class PanelPrincipal extends JPanel {
    
   public static int valorEjeX = 50;
   public static int valorEjeY= 150;
   public static int valorEjeX2 = 50;
   public static int valorEjeY2= 300;
   
    public PanelPrincipal (){
    }
    
    public void ConfigurarPanel(){
        this.setSize(800, 600);
        this.setLayout(null);
    }
    
        @Override
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(10));
        
        // Dibujar el fondo del panel
        g.setColor(Color.DARK_GRAY);
        g.fillRect(0, 0, getWidth(), getHeight());
        
        
        // Dibujar la linea de salida
        g.setColor(Color.YELLOW);
        g.drawLine(150, 100, 150, 400);
        
        
        // Dibujar la línea de meta
        g.setColor(Color.BLACK);
        g.drawLine(600, 100, 600, 150);
        g.drawLine(600, 200, 600, 250);
        g.drawLine(600, 300, 600, 350);
        g.setColor(Color.WHITE);
        g.drawLine(600, 150, 600, 200);
        g.drawLine(600, 250, 600, 300);
        g.drawLine(600, 350, 600, 400);
        
        
        g.setColor(Color.WHITE);
        g.drawLine(610, 100, 610, 150);
        g.drawLine(610, 200, 610, 250);
        g.drawLine(610, 300, 610, 350);
        g.setColor(Color.BLACK);
        g.drawLine(610, 150, 610, 200);
        g.drawLine(610, 250, 610, 300);
        g.drawLine(610, 350, 610, 400);
        
        g.setColor(Color.BLACK);
        g.drawLine(620, 100, 620, 150);
        g.drawLine(620, 200, 620, 250);
        g.drawLine(620, 300, 620, 350);
        g.setColor(Color.WHITE);
        g.drawLine(620, 150, 620, 200);
        g.drawLine(620, 250, 620, 300);
        g.drawLine(620, 350, 620, 400);
        
        
        //Dibujar las letras del juego c:
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.PLAIN, 30));
        g.drawString("INICIO", 110, 80);
        g.drawString("¡METAAAA!", 530, 80);
        
        
        g.drawString("¡¡LA MEJOR CARRERA DE TODOS LOS TIEMPOS!!", 30, 500);
        
        
        
        g.setColor(Color.LIGHT_GRAY);
        g.fillOval(valorEjeX, valorEjeY, 50, 50);
        
        g.setColor(Color.MAGENTA);
        g.fillOval(valorEjeX2, valorEjeY2, 50, 50);
    }
}