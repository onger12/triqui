package view;

import utils.Utils;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.MenuPrincipalController;

import java.awt.Color;
import java.awt.Font;

public class MenuPrincipal extends JFrame {
  int WIDTH = 800, HEIGHT = 800;
  
  public Modes m;
  public JLabel jlTitulo, jlBanner;
  public JButton jbInfo, jbMode, jbDesc;
  public JPanel jpButtonsContainer;

  public MenuPrincipal(Modes m) {
    super("Triqui");
    this.m = m;

    setSize(WIDTH, HEIGHT);
    setLocationRelativeTo(null);
    setResizable(false);
    getContentPane().setBackground(Utils.DARK_BLUE);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    setLayout(null);
    createGUI();

    setVisible(true);
  }

  private void createGUI() {
    jpButtonsContainer = new JPanel();
    int BTN_MAIN_HEIGHT = 55;
    int BTN_MAIN_VERTICAL_PADDING = 5;
    int BTN_COUNT = 3;
    int BTTC_WIDTH = (WIDTH / 4) * 3, BTTC_HEIGHT = (BTN_MAIN_HEIGHT * BTN_COUNT) + (BTN_MAIN_VERTICAL_PADDING * (BTN_COUNT - 1)); // buutton container size
    jpButtonsContainer.setBounds((WIDTH - BTTC_WIDTH) / 2, 150, BTTC_WIDTH, BTTC_HEIGHT);
    jpButtonsContainer.setLayout(null);
    jpButtonsContainer.setOpaque(false);

    jbMode = Utils.createSimpleButton("Modo de juego", Utils.LIGHT_BLUE, Utils.LIGHT_BLUE, Color.white);
    jbMode.setBounds(0, 0, BTTC_WIDTH, 55);
    // jbMode.setBackground(LIGHT_BLUE);
    jbDesc = new JButton("Descripción");
    jbDesc.setBounds(0, 60, BTTC_WIDTH, 55);
    jbInfo = new JButton("Información");
    jbInfo.setBounds(0, 120, BTTC_WIDTH, 55);

    jpButtonsContainer.add(jbMode);
    jpButtonsContainer.add(jbDesc);
    jpButtonsContainer.add(jbInfo);

    MenuPrincipalController mpc = new MenuPrincipalController(this);
    jbMode.addActionListener(mpc);

    add(jpButtonsContainer);

    jlTitulo = new JLabel("TRIQUI GAME");
    jlTitulo.setFont(new Font("TimesRoman", Font.PLAIN, 15));
    jlTitulo.setForeground(Color.BLACK);
    add(jlTitulo);
  }
  
}
