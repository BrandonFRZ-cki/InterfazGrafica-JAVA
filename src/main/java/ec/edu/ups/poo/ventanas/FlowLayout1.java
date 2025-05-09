package ec.edu.ups.poo.ventanas;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.FlowLayout;
import java.awt.Button;


public class FlowLayout1 {
    public static void main(String[] args) {
        Frame miVentana = new Frame();
        Panel miPanel = new Panel();
       FlowLayout posicionamientoSecuencial = new FlowLayout();
       Button botonA = new Button("Primer Boton");
       Button botonB = new Button("Segundo Boton");
       Button botonC = new Button("Tercer Boton");
       Button botonD = new Button("Quarto Boton");
        posicionamientoSecuencial.setAlignment(FlowLayout.RIGHT);
       miPanel.setLayout(posicionamientoSecuencial);
       miVentana.add(miPanel);
       miPanel.add(botonA);
       miPanel.add(botonB);
       miPanel.add(botonC);
       miPanel.add(botonD);

       miVentana.setSize(300, 100);
       miVentana.setTitle("Ventana con Flow Layout");
       miVentana.setLocationRelativeTo(null);
       miVentana.setVisible(true);
    }
}
