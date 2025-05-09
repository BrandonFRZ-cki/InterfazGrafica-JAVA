package ec.edu.ups.poo.ventanas.eventos.mouse;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ejemplo {
    public static void main(String[] args) {
        Frame miVentana = new Frame("Ejemplo");
        Panel miPanel = new Panel();
        Button botonHola = new Button("Saludo");
        Button botonAdios = new Button("Despedida");

        miPanel.add(botonHola);
        miPanel.add(botonAdios);

        miPanel.addMouseListener(new MouseListener() { // USO de Clase Anonima --- Normal en Android
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                e.getComponent().setBackground(Color.red);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                e.getComponent().setBackground(Color.gray);
            }
        });

        miVentana.add(miPanel);
        miVentana.setSize(200, 100);
        miVentana.setVisible(true);
        miVentana.setLocationRelativeTo(null);

        botonHola.addMouseListener(new EsquemaRaton());
        botonAdios.addMouseListener(new EsquemaRaton());
    }
}
