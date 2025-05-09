package ec.edu.ups.poo.ventanas;

import java.awt.*;

public class GridLayout2 {
    public static void main(String[] args) {
        Frame miVentana = new Frame();
        Panel miPanel = new Panel();
        GridLayout matriz = new GridLayout(2 , 3);
        Button[] botones = new Button[6];

        Button botonArriba = new Button("Arriba");
        Button botonAbajo = new Button("Abajo");
        Button botonCentro = new Button("Centro");
        Panel panelSubVertical = new Panel(new BorderLayout());

        panelSubVertical.add(botonArriba, BorderLayout.NORTH);
        panelSubVertical.add(botonCentro, BorderLayout.CENTER);
        panelSubVertical.add(botonAbajo, BorderLayout.SOUTH);

        miPanel.add(panelSubVertical);

        for (int i = 0; i < 5; i++)
            botones[i] = new Button("Boton"+i);
        miPanel.setLayout(matriz);
        for (int i = 0; i < 5; i++)
            miPanel.add(botones[i]);

        miVentana.add(miPanel);
        miVentana.setSize(600, 600);
        miVentana.setLocationRelativeTo(null);
        miVentana.setTitle("Ventana con Grid Layout");
        miVentana.setVisible(true);
    }
}
