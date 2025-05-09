package ec.edu.ups.poo.ventanas.eventos.action_listener;

import java.awt.*;

public class EjemploActionListener1 {
    public static void main(String[] args) {
        Frame miVentana = new Frame("Prueba eventos de accion");
        Panel miPanel = new Panel();

        Button boton1 = new Button("Boton1");
        TextField campoDeTexto= new TextField("Texto del campo 8");

        List lista = new List(3);
        lista.add("Opcion 1 de la lista");
        lista.add("Opcion 2 de la lista");
        lista.add("Opcion 3 de la lista");
        lista.add("Opcion 4 de la lista");

        miPanel.add(boton1);
        miPanel.add(campoDeTexto);
        miPanel.add(lista);

        boton1.addActionListener(new InterrupcionesDeAccion());
        campoDeTexto.addActionListener(new InterrupcionesDeAccion());
        lista.addActionListener(new InterrupcionesDeAccion());

        miVentana.add(miPanel);
        miVentana.setSize(400,200);
        miVentana.setVisible(true);
        miVentana.setLocationRelativeTo(null);

    }
}
