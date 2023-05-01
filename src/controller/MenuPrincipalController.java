package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.Credenciales;
import view.MenuPrincipal;

public class MenuPrincipalController implements ActionListener {

  MenuPrincipal mp;

  public MenuPrincipalController(MenuPrincipal mp) {
    super();
    this.mp = mp;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if(e.getSource().equals(mp.jbMode)) {
      mp.m.setVisible(true);
    }
    if(e.getSource().equals(mp.jbPlay)) {
      System.out.println(mp.CURRENT_MODE);
      mp.c = new Credenciales(mp);
      // mp.setVisible(false);
    }
  }
  
}
