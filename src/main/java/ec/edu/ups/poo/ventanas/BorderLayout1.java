package ec.edu.ups.poo.ventanas;

import java.awt.*;

public class BorderLayout1 {
    public static void main(String[] args) {
        Frame miMarco = new Frame();
        Panel panelMenuNorte = new Panel();
        Panel panelGeneral = new Panel();
        BorderLayout puntosCardinales = new BorderLayout();
        FlowLayout opcionesMenus = new FlowLayout();

        Button botonOpcion1 = new Button("Opcion 1");
        Button botonOpcion2 = new Button("Opcion 2");
        Button botonOpcion3 = new Button("Opcion 3");
        Button botonSur = new Button("Sur");
        Button botonEste = new Button("Este");
        Button botonOeste = new Button("Oeste");
        Button botonCentro = new Button("Centro");

        panelGeneral.setLayout(puntosCardinales);
        panelMenuNorte.setLayout(opcionesMenus);
        miMarco.add(panelGeneral);
        panelGeneral.add(panelMenuNorte, BorderLayout.NORTH);
        panelMenuNorte.add(botonOpcion1);
        panelMenuNorte.add(botonOpcion2);
        panelMenuNorte.add(botonOpcion3);
        panelGeneral.add(botonSur, BorderLayout.SOUTH);
        panelGeneral.add(botonEste, BorderLayout.EAST);
        panelGeneral.add(botonOeste, BorderLayout.WEST);
        panelGeneral.add(botonCentro, BorderLayout.CENTER);

        miMarco.setSize(400, 150);
        miMarco.setTitle("Ventana con BorderLayout");
        miMarco.setVisible(true);

    }
}
