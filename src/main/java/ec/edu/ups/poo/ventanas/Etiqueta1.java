package ec.edu.ups.poo.ventanas;
    import java.awt.Frame;
    import java.awt.Label;
public class Etiqueta1 {
    public static void main(String[] args) {
        Frame miMarco = new Frame();
        Label titulo = new Label("Notas de Matematicas");

        miMarco.add(titulo);

        miMarco.setSize(300,200);
        miMarco.setTitle("Ventana con Etiqueta");
        miMarco.setVisible(true);
    }
}
