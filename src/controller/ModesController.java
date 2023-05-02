package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import utils.Utils;
import view.MenuPrincipal;
import view.Modes;

public class ModesController implements ActionListener {

  Modes m;
  MenuPrincipal mp;

  public ModesController(Modes m, MenuPrincipal mp) {
    super();
    this.m = m;
    this.mp = mp;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if(e.getSource().equals(m.jbCancel)) {
      m.dispose();
      m.setVisible(false);
      return;
    }
    if(e.getSource().equals(m.jbPvP)) {
      mp.CURRENT_MODE = Utils.PVP_MODE;
      mp.jlCurrentMode.setText("Modo de juego: PVP");
      m.dispose();
      m.setVisible(false);
      return;
    }
    if(e.getSource().equals(m.jbCom)) {
      mp.CURRENT_MODE = Utils.COM_MODE;
      mp.jlCurrentMode.setText("Modo de juego: COM");
      m.dispose();
      m.setVisible(false);
      return;
    }
  }
  
}
