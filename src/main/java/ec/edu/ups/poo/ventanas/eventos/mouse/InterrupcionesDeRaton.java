package ec.edu.ups.poo.ventanas.eventos.mouse;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class InterrupcionesDeRaton extends MouseAdapter {
    private Label mensaje;

    public InterrupcionesDeRaton(Label mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public void mouseClicked(MouseEvent evento){
        Component component = evento.getComponent();
        String nombre = component.getName();
        String opcion = nombre.substring(nombre.length()-2, nombre.length());
        mensaje.setText("Ejecuta la Accion"+opcion);
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        Component component = (Component) e.getSource();
        component.setBackground(Color.red);
    }
    @Override
    public void mouseExited(MouseEvent e) {
        Component component = (Component) e.getSource();
        component.setBackground(Color.orange);
    }
}
