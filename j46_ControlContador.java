import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class j46_ControlContador {

    // Variables de los contadores
    private static int contador = 0;
    private static int contadorClicks = 0;

    public static void main(String[] args) {

        // Crear ventana
        JFrame ventana = new JFrame("Control de Contadores");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(480, 250);
        ventana.setLayout(new FlowLayout());
        ventana.setLocationRelativeTo(null);

        // Botones del primer contador
        JButton btnSumar = new JButton("+ Sumar");
        JButton btnRestar = new JButton("- Restar");
        JLabel etiquetaValor = new JLabel("Contador 1: 0");

        // Botones del segundo contador
        JButton btnClicks = new JButton("Contar clic");
        JButton btnMultiplicar = new JButton("Multiplicar x2");
        JLabel etiquetaClicks = new JLabel("Contador de clics: 0");

        // Evento para sumar
        btnSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contador++;
                etiquetaValor.setText("Contador 1: " + contador);
            }
        });

        // Evento para restar
        btnRestar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contador--;
                etiquetaValor.setText("Contador 1: " + contador);
            }
        });

        // Evento para contar clics
        btnClicks.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contadorClicks++;
                etiquetaClicks.setText("Contador de clics: " + contadorClicks);
            }
        });

        // Evento para multiplicar por 2
        btnMultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contadorClicks *= 2;
                etiquetaClicks.setText("Contador de clics: " + contadorClicks);
            }
        });

        // Agregar componentes a la ventana
        ventana.add(btnSumar);
        ventana.add(btnRestar);
        ventana.add(etiquetaValor);

        ventana.add(btnClicks);
        ventana.add(btnMultiplicar);
        ventana.add(etiquetaClicks);

        // Mostrar ventana
        ventana.setVisible(true);
    }
}