package com.mycompany.proyectofinal;

/**
 *
 * @author Hansen
 */
public class ProyectoFinal {

    public static void main(String[] args) {
        VentanaConPanel ventanaConPanel = new VentanaConPanel();
        ventanaConPanel.ConfigurarVentana();
        ventanaConPanel.agregarElementos();
        ventanaConPanel.mostrarVentana();

        Thread hilo1 = new Thread(new Demonio1(ventanaConPanel));
        hilo1.start();
      
    }
}