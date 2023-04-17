package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

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
      mp.setCurrentMode("PvP");
      m.dispose();
      m.setVisible(false);
      return;
    }
    if(e.getSource().equals(m.jbCom)) {
      mp.setCurrentMode("COM");
      m.dispose();
      m.setVisible(false);
      return;
    }
  }
  
}
