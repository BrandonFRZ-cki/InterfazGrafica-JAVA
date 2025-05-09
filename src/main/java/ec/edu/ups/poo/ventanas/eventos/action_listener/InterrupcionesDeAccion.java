package ec.edu.ups.poo.ventanas.eventos.action_listener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterrupcionesDeAccion implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        Component componente = (Component) e.getSource();
        String accionRealizada = e.getActionCommand();
        System.out.println("Componente: "+componente.getName()+"\nSuceso: "+accionRealizada);
        System.out.println();
    }
}
