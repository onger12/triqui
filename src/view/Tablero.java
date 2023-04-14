package view;

import java.awt.Color;
import javax.swing.JFrame;

public class Tablero extends JFrame{
  
  int WIDTH = 800, HEIGHT = 800;
  Color LIGHT_BLUE = new Color(69, 123, 157), DARK_BLUE = new Color(29, 53, 87);


  MenuPrincipal mp;
  
  public Tablero(MenuPrincipal mp) {
    super("Triqui");
    this.mp = mp;

    setSize(WIDTH, HEIGHT);
    setLocationRelativeTo(null);
    setResizable(false);
    getContentPane().setBackground(DARK_BLUE);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    setLayout(null);
    createGUI();

    setVisible(true);
  }

  private void createGUI() {

  }
}
