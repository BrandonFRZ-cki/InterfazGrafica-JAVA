package ec.edu.ups.poo.ventanas.eventos.window;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjemploVentana1 {
    public static void main(String[] args) {
        Frame miVentana = new Frame("Prueba eventos ventana");
        miVentana.setSize(300, 300);
        miVentana.setLocationRelativeTo(null);
        miVentana.addWindowListener(new InterrupcionesDeVentana());
        miVentana.setVisible(true);

        Frame otraVentana = new Frame("Prueba eventos ventana");
        otraVentana.setSize(500, 300);
        otraVentana.setLocation(200, 0);
        otraVentana.addWindowListener(new InterrupcionesDeVentana());




        Button boton1 = new Button("Abrir ventana");
        miVentana.add(boton1);
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                otraVentana.setVisible(true);
            }
        });

    }
}
