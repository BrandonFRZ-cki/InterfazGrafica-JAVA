package ec.edu.ups.poo.ventanas;

import java.awt.*;

public class CampoDeTexto {
    public static void main(String[] args) {
        Frame miMarco = new Frame();
        Panel EntradaDeDatos = new Panel(new FlowLayout());
        TextField nombre = new TextField(15);
        TextField apellido = new TextField(60);
        TextField nacionalidad = new TextField("Ecuatoriana",15);

        EntradaDeDatos.add(nombre);
        EntradaDeDatos.add(apellido);
        EntradaDeDatos.add(nacionalidad);

        miMarco.add(EntradaDeDatos);
        miMarco.setSize(500,200);
        miMarco.setTitle("Ventana con campos de texto");
        miMarco.setVisible(true);
    }
}
