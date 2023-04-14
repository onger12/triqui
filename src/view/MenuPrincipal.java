package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;

public class MenuPrincipal extends JFrame {
  int WIDTH = 800, HEIGHT = 800;
  Color DARK_BLUE = new Color(69, 123, 157), LIGHT_BLUE = new Color(29, 53, 87);

  JLabel jlTitulo, jlBanner;
  JButton jbInfo, jbMode, jbDesc;
  JPanel jpButtonsContainer;

  public MenuPrincipal() {
    super("Triqui");

    setLocationRelativeTo(null);
    setSize(WIDTH, HEIGHT);
    setResizable(false);
    setLayout(null);
    setBackground(DARK_BLUE);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    createGUI();

    setVisible(true);
  }

  private void createGUI() {
    jpButtonsContainer = new JPanel();
    int BTTC_WIDTH = (WIDTH / 4) * 3, BTTC_HEIGHT = HEIGHT / 2; // buutton container size
    jpButtonsContainer.setBounds((WIDTH - BTTC_WIDTH) / 2, 150, BTTC_WIDTH, BTTC_HEIGHT);

    jbMode = new JButton("Modo de juego");
    jbMode.setBounds(0, 0, BTTC_WIDTH, 55);
    jbMode.setBackground(LIGHT_BLUE);
    jbDesc = new JButton("Descripción");
    jbDesc.setBounds(0, 60, BTTC_WIDTH, 55);
    jbInfo = new JButton("Información");
    jbInfo.setBounds(0, 110, BTTC_WIDTH, 55);

    jlTitulo = new JLabel("TRIQUI GAME");
    jlTitulo.setFont(new Font("TimesRoman", Font.PLAIN, 15));
    jlTitulo.setForeground(Color.BLACK);
    add(jlTitulo);
  }
}
