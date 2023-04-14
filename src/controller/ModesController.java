package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import view.Modes;

public class ModesController implements ActionListener {

  Modes m;

  public ModesController(Modes m) {
    super();
    this.m = m;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if(e.getSource().equals(m.jbCancel)) {
      System.out.println("salir de modes");
      m.dispose();
      m.setVisible(false);
      return;
    }
    if(e.getSource().equals(m.jbPvP)) {
      JOptionPane.showMessageDialog(m, "PVP", null, 0, null);
      m.dispose();
      m.setVisible(false);
      return;
    }
    if(e.getSource().equals(m.jbCom)) {
      JOptionPane.showMessageDialog(m, "COM", null, 0, null);
      m.dispose();
      m.setVisible(false);
      return;
    }
  }
  
}
