package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import controller.TableroController;
import utils.Utils;

public class Tablero extends JFrame {
  
  private final int WIDTH = 600, HEIGHT = 700;
  
  private MenuPrincipal mp;
  private JPanel jpButtonsContainer;
  private TableroController tc;
  private JLabel jlTitle, jlNickname1, jlNickname2;
  public JButton 
    jb11, jb12, jb13,
    jb21, jb22, jb23,
    jb31, jb32, jb33;

  public int CURRENT_PLAYER;
  public int CURRENT_FICHA;
  public Color jlabelInitialBgColor;
  public ImageIcon 
    FICHA_1_ICON,
    FICHA_2_ICON;
  
  public int[][] TABLERO_MATRIZ;

  public boolean JUEGO_TERMINADO = false;
  
  public Tablero(MenuPrincipal mp) {
    super("Triqui");
    this.mp = mp;
    this.tc = new TableroController(this);
    this.CURRENT_PLAYER = (Math.random() < 0.5) ? Utils.PLAYER_1 : Utils.PLAYER_2;
    this.CURRENT_FICHA = (Math.random() < 0.5) ? Utils.FICHA_1 : Utils.FICHA_2;
    this.jlabelInitialBgColor = new JLabel("").getBackground();
    FICHA_1_ICON = new ImageIcon("src/assets/o.png");
    FICHA_2_ICON = new ImageIcon("src/assets/x.png");

    initTableroMatriz();

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
    if(this.mp.CURRENT_MODE == Utils.COM_MODE) {
      // DIBUJAMOS EL TABLERO PARA JUGAR CONTRA LA MÁQUINA
      createCOMGui();
    }else if(this.mp.CURRENT_MODE == Utils.PVP_MODE) {
      // DIBUJAMOS EL TABLERO PARA JUGAR CONTRA OTRO JUGADOR
      createPVPGui();
    }
    
  }

  private void createCOMGui () {
    createButtons();

  }

  private void createPVPGui () {
    createButtons();
    createPVPNicknames();
    jlTitle = new JLabel("<html><center>Jugador contra Jugador</center>");
    jlTitle.setBounds((WIDTH - 220) / 2, 0, 220, 80);
    jlTitle.setFont(new Font("Fira Code", Font.BOLD, 20));
    jlTitle.setForeground(Color.WHITE);
    add(jlTitle);
  }

  private void createButtons () {
    jpButtonsContainer = new JPanel(new GridLayout(3, 3));
    jpButtonsContainer.setBounds(75, 170, 450, 450);
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

  private void createPVPNicknames () {
    jlNickname1 = new JLabel("<html><center>" + mp.player1Nickname + "</html></center>");
    jlNickname2 = new JLabel(mp.player2Nickname);
    jlNickname1.setBounds(20, 85, 180, 55);
    jlNickname2.setBounds(400, 85, 180, 55);
    jlNickname1.setFont(new Font("Fira Code", Font.BOLD, 20));
    jlNickname1.setForeground(Color.WHITE);
    jlNickname2.setFont(new Font("Fira Code", Font.BOLD, 20));
    jlNickname2.setForeground(Color.WHITE);
    Border border = BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE);
    jlNickname1.setBorder(border);
    jlNickname2.setBorder(border);
    
    if(this.CURRENT_PLAYER == Utils.PLAYER_1) {
      jlNickname1.setBackground(Color.GREEN);
      jlNickname1.setOpaque(true);
    }else {
      jlNickname2.setBackground(Color.GREEN);
      jlNickname2.setOpaque(true);
    }
    add(jlNickname1);
    add(jlNickname2);
  }
  
  public void changeCurrentMode () {
    if(this.CURRENT_PLAYER == Utils.PLAYER_1) {
      this.CURRENT_PLAYER = Utils.PLAYER_2;
      jlNickname2.setBackground(Color.GREEN);
      jlNickname1.setBackground(jlabelInitialBgColor);
      jlNickname2.setOpaque(true);
      jlNickname1.setOpaque(false);
    }else {
      this.CURRENT_PLAYER = Utils.PLAYER_1;
      jlNickname1.setBackground(Color.GREEN);
      jlNickname2.setBackground(jlabelInitialBgColor);
      jlNickname1.setOpaque(true);
      jlNickname2.setOpaque(false);
    }
  }

  public void changeCurrentFicha () {
    if(this.CURRENT_FICHA == Utils.FICHA_1) {
      this.CURRENT_FICHA = Utils.FICHA_2;
    }else {
      this.CURRENT_FICHA = Utils.FICHA_1;
    }
  }

  private void initTableroMatriz () {
    this.TABLERO_MATRIZ = new int[3][3];
    for(int i = 0; i < 3; i++) {
      for(int j = 0; j < 3; j++) {
        this.TABLERO_MATRIZ[i][j] = 0;
        System.out.print(TABLERO_MATRIZ[i][j] + " ");
      }
      System.out.println("");
    }
  }

  public void cambiarMatriz(int i, int j) {
    if(this.CURRENT_PLAYER == Utils.PLAYER_1) {
      this.TABLERO_MATRIZ[i][j] = 2;
    }else {
      this.TABLERO_MATRIZ[i][j] = 1;
    }
    escucharMatriz();
  }

  private void escucharMatriz() {
    // player 1
    for(int i = 0; i < 3; i++) {
      if(
        this.TABLERO_MATRIZ[i][0] == 1 &&
        this.TABLERO_MATRIZ[i][1] == 1 &&
        this.TABLERO_MATRIZ[i][2] == 1
      ) {
        System.out.println("Ganaste 1");
        break;
      }
    }
    for(int i = 0; i < 3; i++) {
      if(
        this.TABLERO_MATRIZ[0][i] == 1 &&
        this.TABLERO_MATRIZ[1][i] == 1 &&
        this.TABLERO_MATRIZ[2][i] == 1
      ) {
        System.out.println("Ganaste 1");
        break;
      }
    }
    if(
      this.TABLERO_MATRIZ[0][0] == 1 &&
      this.TABLERO_MATRIZ[1][1] == 1 &&
      this.TABLERO_MATRIZ[2][2] == 1
    ) {
      System.out.println("Ganaste 1");
    } else if(
      this.TABLERO_MATRIZ[0][2] == 1 &&
      this.TABLERO_MATRIZ[1][1] == 1 &&
      this.TABLERO_MATRIZ[2][0] == 1
    ) {
      System.out.println("Ganaste 1");
    }

    // player 2
    for(int i = 0; i < 3; i++) {
      if(
        this.TABLERO_MATRIZ[i][0] == 2 &&
        this.TABLERO_MATRIZ[i][1] == 2 &&
        this.TABLERO_MATRIZ[i][2] == 2
      ) {
        System.out.println("Ganaste 2");
        break;
      }
    }
    for(int i = 0; i < 3; i++) {
      if(
        this.TABLERO_MATRIZ[0][i] == 2 &&
        this.TABLERO_MATRIZ[1][i] == 2 &&
        this.TABLERO_MATRIZ[2][i] == 2
      ) {
        System.out.println("Ganaste 2");
        break;
      }
    }
    if(
      this.TABLERO_MATRIZ[0][0] == 2 &&
      this.TABLERO_MATRIZ[1][1] == 2 &&
      this.TABLERO_MATRIZ[2][2] == 2
    ) {
      System.out.println("Ganaste 2");
    } else if(
      this.TABLERO_MATRIZ[0][2] == 2 &&
      this.TABLERO_MATRIZ[1][1] == 2 &&
      this.TABLERO_MATRIZ[2][0] == 2
    ) {
      System.out.println("Ganaste 2");
    }
  }
}
