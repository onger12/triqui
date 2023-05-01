package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import utils.Utils;
import view.Tablero;

public class TableroController implements ActionListener {

  private Tablero t;
  public TableroController(Tablero t) {
    super();
    this.t = t;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    this.t.changeCurrentMode();
    this.t.changeCurrentFicha();

    if(e.getSource().equals(t.jb11)) {
      this.t.cambiarMatriz(0, 0);
      if(this.t.CURRENT_FICHA == Utils.FICHA_1) {
        t.jb11.setIcon(this.t.FICHA_1_ICON);
        t.jb11.revalidate();
        t.jb11.repaint();
        t.jb11.setEnabled(false);
      }else {
        t.jb11.setIcon(this.t.FICHA_2_ICON);
        t.jb11.revalidate();
        t.jb11.repaint();
        t.jb11.setEnabled(false);
      }
    }else if(e.getSource().equals(t.jb12)) {
      this.t.cambiarMatriz(0, 1);
      if(this.t.CURRENT_FICHA == Utils.FICHA_1) {
        t.jb12.setIcon(this.t.FICHA_1_ICON);
        t.jb12.revalidate();
        t.jb12.repaint();
        t.jb12.setEnabled(false);
      }else {
        t.jb12.setIcon(this.t.FICHA_2_ICON);
        t.jb12.revalidate();
        t.jb12.repaint();
        t.jb12.setEnabled(false);
      }
    }else if(e.getSource().equals(t.jb13)) {
      this.t.cambiarMatriz(0, 2);
      if(this.t.CURRENT_FICHA == Utils.FICHA_1) {
        t.jb13.setIcon(this.t.FICHA_1_ICON);
        t.jb13.revalidate();
        t.jb13.repaint();
        t.jb13.setEnabled(false);
      }else {
        t.jb13.setIcon(this.t.FICHA_2_ICON);
        t.jb13.revalidate();
        t.jb13.repaint();
        t.jb13.setEnabled(false);
      }
    }else if(e.getSource().equals(t.jb21)) {
      this.t.cambiarMatriz(1, 0);
      if(this.t.CURRENT_FICHA == Utils.FICHA_1) {
        t.jb21.setIcon(this.t.FICHA_1_ICON);
        t.jb21.revalidate();
        t.jb21.repaint();
        t.jb21.setEnabled(false);
      }else {
        t.jb21.setIcon(this.t.FICHA_2_ICON);
        t.jb21.revalidate();
        t.jb21.repaint();
        t.jb21.setEnabled(false);
      }
    }else if(e.getSource().equals(t.jb22)) {
      this.t.cambiarMatriz(1, 1);
      if(this.t.CURRENT_FICHA == Utils.FICHA_1) {
        t.jb22.setIcon(this.t.FICHA_1_ICON);
        t.jb22.revalidate();
        t.jb22.repaint();
        t.jb22.setEnabled(false);
      }else {
        t.jb22.setIcon(this.t.FICHA_2_ICON);
        t.jb22.revalidate();
        t.jb22.repaint();
        t.jb22.setEnabled(false);
      }
    }else if(e.getSource().equals(t.jb23)) {
      this.t.cambiarMatriz(1, 2);
      if(this.t.CURRENT_FICHA == Utils.FICHA_1) {
        t.jb23.setIcon(this.t.FICHA_1_ICON);
        t.jb23.revalidate();
        t.jb23.repaint();
        t.jb23.setEnabled(false);
      }else {
        t.jb23.setIcon(this.t.FICHA_2_ICON);
        t.jb23.revalidate();
        t.jb23.repaint();
        t.jb23.setEnabled(false);
      }
    }else if(e.getSource().equals(t.jb31)) {
      this.t.cambiarMatriz(2, 0);
      if(this.t.CURRENT_FICHA == Utils.FICHA_1) {
        t.jb31.setIcon(this.t.FICHA_1_ICON);
        t.jb31.revalidate();
        t.jb31.repaint();
        t.jb31.setEnabled(false);
      }else {
        t.jb31.setIcon(this.t.FICHA_2_ICON);
        t.jb31.revalidate();
        t.jb31.repaint();
        t.jb31.setEnabled(false);
      }
    }else if(e.getSource().equals(t.jb32)) {
      this.t.cambiarMatriz(2, 1);
      if(this.t.CURRENT_FICHA == Utils.FICHA_1) {
        t.jb32.setIcon(this.t.FICHA_1_ICON);
        t.jb32.revalidate();
        t.jb32.repaint();
        t.jb32.setEnabled(false);
      }else {
        t.jb32.setIcon(this.t.FICHA_2_ICON);
        t.jb32.revalidate();
        t.jb32.repaint();
        t.jb32.setEnabled(false);
      }
    }else if(e.getSource().equals(t.jb33)) {
      this.t.cambiarMatriz(2, 2);
      if(this.t.CURRENT_FICHA == Utils.FICHA_1) {
        t.jb33.setIcon(this.t.FICHA_1_ICON);
        t.jb33.revalidate();
        t.jb33.repaint();
        t.jb33.setEnabled(false);
      }else {
        t.jb33.setIcon(this.t.FICHA_2_ICON);
        t.jb33.revalidate();
        t.jb33.repaint();
        t.jb33.setEnabled(false);
      }
    }
  }
  
}
