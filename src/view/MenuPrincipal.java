package view;

import utils.Utils;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.MenuPrincipalController;

import java.awt.Color;
import java.awt.Font;

public class MenuPrincipal extends JFrame {
  private final int WIDTH = 800, HEIGHT = 800;
  
  public Modes m;
  public Tablero t;
  public Credenciales c;
  public Info i;

  public JLabel jlTitulo, jlBanner, jlCurrentMode;
  public JButton jbInfo, jbMode, jbDesc, jbPlay;
  public JPanel jpButtonsContainer;
  public String player1Nickname, player2Nickname;
  private MenuPrincipalController mpc;

  // constants
  int BTN_MAIN_HEIGHT = 55; // altura de los botones dentro del panel
  int BTN_MAIN_VERTICAL_MARGIN = 5; // margin vertical entre paneles
  int BTN_COUNT = 4; // cantidad de botones que habrá en el panel
  int 
    BTTC_WIDTH = (WIDTH / 4) * 3,  // BTTC_WIDTH : ButtonContainerWidth
    BTTC_HEIGHT = (BTN_MAIN_HEIGHT * BTN_COUNT) + (BTN_MAIN_VERTICAL_MARGIN * (BTN_COUNT - 1)); // BTTC_HEIGHT : ButtonContainerHeight
    
  public int CURRENT_MODE = Utils.COM_MODE;

  public MenuPrincipal() {
    super("Triqui");
    this.m = new Modes(this);
    this.mpc = new MenuPrincipalController(this);

    setSize(WIDTH, HEIGHT);
    setLocationRelativeTo(null);
    setResizable(false);
    getContentPane().setBackground(Utils.BG_BLUE);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    setLayout(null);
    createGUI();

    setVisible(true);
  }

  private void createGUI() {
    // init initButtonContainer
    initButtonContaienr();
    // init buttons
    initJButtons();
    //Hovers
    setHovers();

    // init current mode jlabel
    this.jlCurrentMode = new JLabel(this.CURRENT_MODE == Utils.COM_MODE ? "Modo de juego: COM" : "Modo de juego: PVP");
    jlCurrentMode.setFont(new Font("Fira Code", Font.PLAIN, 25));
    jlCurrentMode.setForeground(Color.WHITE);
    this.jlCurrentMode.setBounds((WIDTH - 350) / 2, 350 + BTTC_HEIGHT + 15, 350, 55);
    
    // add buttons to ButtonsContainer
    jpButtonsContainer.add(jbMode);
    jpButtonsContainer.add(jbDesc);
    jpButtonsContainer.add(jbInfo);
    jpButtonsContainer.add(jbPlay);
    add(jlCurrentMode);
    
    jbMode.addActionListener(mpc);
    jbPlay.addActionListener(mpc);
    jbInfo.addActionListener(mpc);
    jbDesc.addActionListener(mpc);

    add(jpButtonsContainer);

    // banner
    ImageIcon ii = new ImageIcon(getClass().getResource(
				"../assets/triqui_banner.png"));
		jlBanner = new JLabel(ii);
		jlBanner.setBounds(0, 85, WIDTH, 256);
    add(jlBanner);
    
    jlTitulo = new JLabel("<html><center>El juego del triqui<br>V1.0</center>");
		jlTitulo.setBounds((WIDTH - 180) / 2, 0, 180, 80);
    jlTitulo.setFont(new Font("Fira Code", Font.BOLD, 20));
    jlTitulo.setForeground(Color.WHITE);
    add(jlTitulo);
  }

  public void setCurrentMode(String mode) {
    this.jlCurrentMode.setText("Modo: " + player1Nickname + " " + player2Nickname);
  }

  private void setHovers() {
    Utils.jbHoverSwitchBg(this.jbPlay, Utils.LIGHT_GREEN, Utils.DARK_GREEN, Color.BLACK, Color.BLACK);
    Utils.jbHoverSwitchBg(this.jbDesc, Utils.LIGHT_BLUE, Utils.DARK_BLUE, Color.BLACK, Color.WHITE);
    Utils.jbHoverSwitchBg(this.jbMode, Utils.LIGHT_BLUE, Utils.DARK_BLUE, Color.BLACK, Color.WHITE);
    Utils.jbHoverSwitchBg(this.jbInfo, Utils.LIGHT_BLUE, Utils.DARK_BLUE, Color.BLACK, Color.WHITE);
  }

  private void initJButtons() { 
    jbMode = Utils.createSimpleButton("Modo de juego", Utils.DARK_BLUE, Utils.DARK_BLUE, Color.white);
    jbMode.setBounds(0, 0, BTTC_WIDTH, 55);
    // jbMode.setBackground(DARK_BLUE);
    jbDesc = Utils.createSimpleButton("Descripción", Utils.DARK_BLUE, Utils.DARK_BLUE, Color.white);
    jbDesc.setBounds(0, 60, BTTC_WIDTH, 55);
    jbInfo = Utils.createSimpleButton("Información", Utils.DARK_BLUE, Utils.DARK_BLUE, Color.white);
    jbInfo.setBounds(0, 120, BTTC_WIDTH, 55);
    jbPlay = Utils.createSimpleButton("JUGAR", Utils.DARK_GREEN, Utils.DARK_GREEN, Color.white);
    jbPlay.setBounds((BTTC_WIDTH / 4), 180, (BTTC_WIDTH / 2), 55);
  }

  private void initButtonContaienr() { 
    jpButtonsContainer = new JPanel();
    jpButtonsContainer.setBounds((WIDTH - BTTC_WIDTH) / 2, 350, BTTC_WIDTH, BTTC_HEIGHT);
    jpButtonsContainer.setLayout(null);
    jpButtonsContainer.setOpaque(false);
  }
  
}
