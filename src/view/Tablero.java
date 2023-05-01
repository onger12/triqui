package view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.TableroController;
import utils.Utils;

public class Tablero extends JFrame {
  
  private final int WIDTH = 600, HEIGHT = 600;
  private MenuPrincipal mp;
  private JPanel jpButtonsContainer;
  private TableroController tc;
  public JButton 
    jb11, jb12, jb13,
    jb21, jb22, jb23,
    jb31, jb32, jb33;
  
  public Tablero(MenuPrincipal mp) {
    super("Triqui");
    this.mp = mp;
    this.tc = new TableroController(this);

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
    jpButtonsContainer = new JPanel(new GridLayout(3, 3));
    jpButtonsContainer.setBounds(0, 0, this.getWidth() - 50, this.getHeight() - 50);
    jb11 = new JButton("11");
    jb12 = new JButton("12");
    jb13 = new JButton("13");
    jb21 = new JButton("21");
    jb22 = new JButton("22");
    jb23 = new JButton("23");
    jb31 = new JButton("31");
    jb32 = new JButton("32");
    jb33 = new JButton("33");

    jb11.addActionListener(tc);
    jb12.addActionListener(tc);
    jb13.addActionListener(tc);
    jb21.addActionListener(tc);
    jb22.addActionListener(tc);
    jb23.addActionListener(tc);
    jb31.addActionListener(tc);
    jb32.addActionListener(tc);
    jb33.addActionListener(tc);

    jpButtonsContainer.add(jb11);
    jpButtonsContainer.add(jb12);
    jpButtonsContainer.add(jb13);
    jpButtonsContainer.add(jb21);
    jpButtonsContainer.add(jb22);
    jpButtonsContainer.add(jb23);
    jpButtonsContainer.add(jb31);
    jpButtonsContainer.add(jb32);
    jpButtonsContainer.add(jb33);
    add(jpButtonsContainer);
  }
}
