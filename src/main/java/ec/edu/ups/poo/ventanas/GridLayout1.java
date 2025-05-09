package ec.edu.ups.poo.ventanas;

import java.awt.*;

public class GridLayout1 {
    public static void main(String[] args) {
        Frame miVentana = new Frame();
        Panel miPanel = new Panel();
        GridLayout matriz = new GridLayout(2 , 3);
        Button[] botones = new Button[6];
        for (int i = 0; i < 6; i++) {
            botones[i] = new Button("Boton"+i);
        }
        miPanel.setLayout(matriz);
        for (int i = 0; i < 6; i++) {
            miPanel.add(botones[i]);
        }
        miVentana.add(miPanel);
        miVentana.setSize(300, 100);
        miVentana.setLocationRelativeTo(null);
        miVentana.setTitle("Ventana con Grid Layout");
        miVentana.setVisible(true);
    }
}
