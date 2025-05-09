package ec.edu.ups.poo.ventanas;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        MiVentana v1 = new MiVentana();
        MiVentana v2 = new MiVentana("Ventana 2");
        MiVentana v3 = new MiVentana("Ventana 3",400,200);
        v3.setLocationRelativeTo(null); // Lo pone en el centro

        Panel miPanel = new Panel();
        Panel miPanelIzq = new Panel();
        Panel miPanelDere = new Panel();

        Button boton1 = new Button("Click me 1");
        Button boton2 = new Button("Click me 2");
        Button boton3 = new Button("Click me 3");


        miPanelIzq.setBackground(Color.red);
        miPanelDere.setBackground(Color.green);

        miPanel.add(miPanelIzq);
        miPanel.add(miPanelDere);

        miPanelIzq.add(boton1);
        miPanelIzq.add(boton2);
        miPanelDere.add(boton3);

        v3.add(miPanel);

    }
}
