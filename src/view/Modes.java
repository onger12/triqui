package view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

import controller.ModesController;
import utils.Utils;

public class Modes extends JFrame { 
  int WIDTH = 350, HEIGHT = 350;
  public JButton jbPvP, jbCom, jbCancel;

  public Modes() {
    super("Modos de juego");

    setSize(WIDTH, HEIGHT);
    setLocationRelativeTo(null);
    setResizable(false);
    getContentPane().setBackground(Color.white);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    setLayout(null);
    createGUI();

    setVisible(true);
  }

  private void createGUI() {
    jbPvP = Utils.createSimpleButton("Jugador contra jugador", Utils.LIGHT_BLUE, Utils.LIGHT_BLUE, Color.white);
    jbPvP.setBounds((WIDTH - (WIDTH - 50)) / 2, 0, (WIDTH - 50), 40);

    jbCom = Utils.createSimpleButton("Contra la máquina", Utils.LIGHT_BLUE, Utils.LIGHT_BLUE, Color.white);
    jbCom.setBounds((WIDTH - (WIDTH - 50)) / 2, 45, (WIDTH - 50), 40);

    jbCancel = Utils.createSimpleButton("Cancelar", Utils.CANCEL_COLOR, Utils.CANCEL_COLOR, Color.white);
    jbCancel.setBounds((WIDTH - (WIDTH / 2)) / 2, 90, (WIDTH / 2), 35);

    ModesController mc = new ModesController(this);
    jbPvP.addActionListener(mc);
    jbCom.addActionListener(mc);
    jbCancel.addActionListener(mc);

    add(jbPvP);
    add(jbCom);
    add(jbCancel);
  }
}