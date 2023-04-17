package view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

import controller.ModesController;
import utils.Utils;

public class Modes extends JFrame { 
  int WIDTH = 350, HEIGHT = 170;
  public JButton jbPvP, jbCom, jbCancel;
  MenuPrincipal mp;
  

  public Modes(MenuPrincipal mp) {
    super("Modos de juego");
    this.mp = mp;

    setSize(WIDTH, HEIGHT);
    setLocationRelativeTo(null);
    setResizable(false);
    getContentPane().setBackground(Color.white);
    getContentPane().setBackground(Utils.BG_BLUE);
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    
    setLayout(null);
    createGUI();

    setVisible(false);
  }

  private void createGUI() {
    jbPvP = Utils.createSimpleButton("Jugador contra jugador", Utils.DARK_BLUE, Utils.DARK_BLUE, Color.white);
    jbPvP.setBounds(0, 0, WIDTH, 40);

    jbCom = Utils.createSimpleButton("Contra la máquina", Utils.DARK_BLUE, Utils.DARK_BLUE, Color.white);
    jbCom.setBounds(0, 45, WIDTH, 40);

    jbCancel = Utils.createSimpleButton("Cancelar", Utils.CANCEL_COLOR, Utils.CANCEL_COLOR, Color.white);
    jbCancel.setBounds((WIDTH - (WIDTH - 30)) / 2, 90, WIDTH - 50, 35);

    ModesController mc = new ModesController(this, mp);

    Utils.jbHoverSwitchBg(jbPvP, Utils.LIGHT_BLUE, Utils.DARK_BLUE);
    Utils.jbHoverSwitchBg(jbCom, Utils.LIGHT_BLUE, Utils.DARK_BLUE);
    Utils.jbHoverSwitchBg(jbCancel, Utils.CANCEL_LIGHT_COLOR, Utils.CANCEL_COLOR);

    jbPvP.addActionListener(mc);
    jbCom.addActionListener(mc);
    jbCancel.addActionListener(mc);

    add(jbPvP);
    add(jbCom);
    add(jbCancel);
  }
}