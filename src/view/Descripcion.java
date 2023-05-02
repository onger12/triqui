package view;
import javax.swing.*;
import java.awt.*;

public class Descripcion extends JFrame {
    public Descripcion() {
        // Crear los JLabel y las imágenes
        JLabel nombre1Label = new JLabel("  Dujardin Pizarro V - 1963072-2724");
        JLabel nombre2Label = new JLabel("  Brandon Vázques - 2257709-2724");

        ImageIcon imagen1 = new ImageIcon("src/assets/jupiter.png");
        JLabel imagen1Label = new JLabel(imagen1);

        ImageIcon imagen2 = new ImageIcon("src/assets/saturno.png");
        JLabel imagen2Label = new JLabel(imagen2);

        // Crear un JPanel para las etiquetas de nombre
        JPanel nombresPanel = new JPanel(new GridLayout(2, 1));
        nombresPanel.add(nombre1Label);
        nombresPanel.add(nombre2Label);

        // Crear un JPanel para las etiquetas de imagen
        JPanel imagenesPanel = new JPanel(new GridLayout(2, 1));
        imagenesPanel.add(imagen1Label);
        imagenesPanel.add(imagen2Label);

        // Crear un JPanel principal para los paneles de nombre y de imagen
        JPanel mainPanel = new JPanel(new GridLayout(1, 2));
        mainPanel.add(nombresPanel);
        mainPanel.add(imagenesPanel);

        // Agregar el JPanel principal al JFrame
        add(mainPanel);

        // Establecer las propiedades del JFrame
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Dos nombres, dos imágenes");
        setSize(400, 300);
        setLocationRelativeTo(null); // Centrar la ventana
        setVisible(true);
    }
}