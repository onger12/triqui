package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.CredencialesController;
import utils.Utils;

public class Credenciales extends JFrame {

  private int WIDTH = 350, HEIGHT = 180;
  public int mode;
  public JTextField jtfPlayer1Nickname, jtfPlayer2Nickname;
  public JLabel jlPlayer1Nickname, jlPlayer2Nickname;
  public JButton jbJugar;
  CredencialesController cc;

  public Credenciales(MenuPrincipal mp) {
    super("CREDENCIALES");
    this.mode = mp.CURRENT_MODE;
    this.cc = new CredencialesController(this, mp);

    setSize(WIDTH, HEIGHT);
    setLocationRelativeTo(null);
    setResizable(false);
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    getContentPane().setBackground(Utils.DARK_BLUE);

    setLayout(null);
    createGUI(); // ESTA DE ACA
    setVisible(true);
  }

  private void createGUI() {
    if(this.mode == Utils.PVP_MODE) {
      createPVPGui();
    }else if(this.mode == Utils.COM_MODE) {
      createCOMGui();
    }
  }

  private void createCOMGui() {
    HEIGHT = 180;
    setSize(WIDTH, HEIGHT);
    JPanel form = new JPanel();
    form.setLayout(null);
    form.setBounds(0, 0, 350, HEIGHT);
    form.setBackground(Utils.DARK_BLUE);
    
    jlPlayer1Nickname = new JLabel("<html><center>Ingresa tu nickname: </center></html>");
    jlPlayer1Nickname.setBounds(15, 0, 320, 35);
    jlPlayer1Nickname.setFont(new Font("Arial", Font.PLAIN, 20));
    
    jtfPlayer1Nickname = new JTextField();
    jtfPlayer1Nickname.setBounds(15, 40, 300, 35);
    jtfPlayer1Nickname.setFont(new Font("Arial", Font.PLAIN, 20));
    
    jbJugar = Utils.createSimpleButton("Enviar", Utils.LIGHT_GREEN, Utils.LIGHT_GREEN, Color.BLACK);
    Utils.jbHoverSwitchBg(jbJugar, Utils.DARK_GREEN, Utils.LIGHT_GREEN, Color.BLACK, Color.BLACK);
    jbJugar.setBounds(100, 85, 150, 35);
    jbJugar.addActionListener(cc);

    form.add(jlPlayer1Nickname);
    form.add(jtfPlayer1Nickname);
    form.add(jbJugar);
    add(form);
  }

  private void createPVPGui() {
    HEIGHT = 260;
    setSize(WIDTH, HEIGHT);
    JPanel form = new JPanel();
    form.setLayout(null);
    form.setBounds(0, 0, 350, HEIGHT);
    form.setBackground(Utils.DARK_BLUE);
    
    jlPlayer1Nickname = new JLabel("<html><center>Nickname player 1: </center></html>");
    jlPlayer1Nickname.setBounds(15, 0, 320, 35);
    jlPlayer1Nickname.setFont(new Font("Arial", Font.PLAIN, 20));
    
    jtfPlayer1Nickname = new JTextField();
    jtfPlayer1Nickname.setBounds(15, 40, 300, 35);
    jtfPlayer1Nickname.setFont(new Font("Arial", Font.PLAIN, 20));

    jlPlayer2Nickname = new JLabel("<html><center>Nickname player 2: </center></html>");
    jlPlayer2Nickname.setBounds(15, 80, 320, 35);
    jlPlayer2Nickname.setFont(new Font("Arial", Font.PLAIN, 20));
    
    jtfPlayer2Nickname = new JTextField();
    jtfPlayer2Nickname.setBounds(15, 125, 300, 35);
    jtfPlayer2Nickname.setFont(new Font("Arial", Font.PLAIN, 20));
    
    jbJugar = Utils.createSimpleButton("JUGAR", Utils.LIGHT_GREEN, Utils.LIGHT_GREEN, Color.BLACK);
    Utils.jbHoverSwitchBg(jbJugar, Utils.DARK_GREEN, Utils.LIGHT_GREEN, Color.BLACK, Color.BLACK);
    jbJugar.setBounds(100, 170, 150, 35);
    jbJugar.addActionListener(cc);

    form.add(jlPlayer1Nickname);
    form.add(jlPlayer2Nickname);
    form.add(jtfPlayer1Nickname);
    form.add(jtfPlayer2Nickname);
    form.add(jbJugar);
    add(form);
  }
}
