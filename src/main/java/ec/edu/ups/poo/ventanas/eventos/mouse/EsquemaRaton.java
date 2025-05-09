package ec.edu.ups.poo.ventanas.eventos.mouse;

import java.awt.*;
import java.awt.event.*;

public class EsquemaRaton implements MouseListener {
    @Override
    public void mouseClicked(MouseEvent e) {

        Button button = (Button) e.getComponent();

        System.out.println("Clikeaste el boton "+button.getLabel());

    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("estas Presionando el boton");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Dejaste de Precionar el boton");

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        e.getComponent().setBackground(Color.red);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        e.getComponent().setBackground(Color.gray);
    }
}
