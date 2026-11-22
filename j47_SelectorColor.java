import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class j47_SelectorColor {

    public static void main(String[] args) {

        // 1. Creamos la ventana principal
        JFrame ventana = new JFrame("j47_SelectorColor - Selector de Colores");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(500, 500);

        // 2. Organizamos la ventana
        ventana.setLayout(new BorderLayout());
        ventana.setLocationRelativeTo(null);

        // 3. Creamos el panel que cambiará de color
        JPanel panelColor = new JPanel();
        panelColor.setBackground(Color.WHITE);

        // 4. Creamos el panel de controles
        JPanel panelControles = new JPanel();
        panelControles.setLayout(new FlowLayout());

        // 5. Creamos los botones de colores
        JRadioButton rbRojo = new JRadioButton("Rojo");
        JRadioButton rbVerde = new JRadioButton("Verde");
        JRadioButton rbAzul = new JRadioButton("Azul");
        JRadioButton rbAmarillo = new JRadioButton("Amarillo");

        // 6. Agrupamos los botones
        ButtonGroup grupoBotones = new ButtonGroup();

        grupoBotones.add(rbRojo);
        grupoBotones.add(rbVerde);
        grupoBotones.add(rbAzul);
        grupoBotones.add(rbAmarillo);

        // 7. Evento del botón rojo
        rbRojo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelColor.setBackground(Color.RED);
            }
        });

        // 8. Evento del botón verde
        rbVerde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelColor.setBackground(Color.GREEN);
            }
        });

        // 9. Evento del botón azul
        rbAzul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelColor.setBackground(Color.BLUE);
            }
        });

        // 10. Evento del botón amarillo
        rbAmarillo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelColor.setBackground(Color.YELLOW);
            }
        });

        // 11. Agregamos los botones al panel
        panelControles.add(rbRojo);
        panelControles.add(rbVerde);
        panelControles.add(rbAzul);
        panelControles.add(rbAmarillo);

        // 12. Agregamos los paneles a la ventana
        ventana.add(panelColor, BorderLayout.CENTER);
        ventana.add(panelControles, BorderLayout.SOUTH);

        // 13. Mostramos la ventana
        ventana.setVisible(true);
    }
}