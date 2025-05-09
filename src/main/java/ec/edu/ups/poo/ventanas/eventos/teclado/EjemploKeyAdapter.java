package ec.edu.ups.poo.ventanas.eventos.teclado;

import java.awt.*;

public class EjemploKeyAdapter {
    public static void main(String[] args) {
        Frame miVentana = new Frame("Prueba eventos de raton");
        Panel miPanel = new Panel();
        Button boton1 = new Button("Silencia");
        Button boton2 = new Button("Maquina de escribir");

        miPanel.add(boton1);
        miPanel.add(boton2);

        miVentana.add(miPanel);
        miVentana.setSize(400,400);
        miVentana.setVisible(true);
        boton2.addKeyListener(new InterrupcionesDeTeclado());
    }
}
