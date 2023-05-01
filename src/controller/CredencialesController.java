package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import utils.Utils;
import view.Credenciales;
import view.MenuPrincipal;

public class CredencialesController implements ActionListener {

  private Credenciales c;
  private MenuPrincipal mp;

  public CredencialesController(Credenciales c, MenuPrincipal mp) {
    super();
    this.c = c;
    this.mp = mp;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if(e.getSource().equals(c.jbEnviar)) {
      if(c.mode == Utils.COM_MODE) {
        mp.player1Nickname = c.jtfPlayer1Nickname.getText();
        mp.jlCurrentMode.setText(mp.player1Nickname);
        c.setVisible(false);
        c.dispose();
      }else if(c.mode == Utils.PVP_MODE) {
        mp.player1Nickname = c.jtfPlayer1Nickname.getText();
        mp.player2Nickname = c.jtfPlayer2Nickname.getText();
        mp.jlCurrentMode.setText(mp.player1Nickname + " - " + mp.player2Nickname);
        c.setVisible(false);
        c.dispose();
      }
    }
  }
  
}
