package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.Tablero;

public class TableroController implements ActionListener {

  private Tablero t;
  public TableroController(Tablero t) {
    super();
    this.t = t;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if(e.getSource().equals(t.jb11)) {
      t.jb11.setText("jb11 - clicked");
    }else if(e.getSource().equals(t.jb12)) {
      t.jb12.setText("jb12 - clicked");
    }else if(e.getSource().equals(t.jb13)) {
      t.jb13.setText("jb13 - clicked");
    }else if(e.getSource().equals(t.jb21)) {
      t.jb21.setText("jb21 - clicked");
    }else if(e.getSource().equals(t.jb22)) {
      t.jb22.setText("jb22 - clicked");
    }else if(e.getSource().equals(t.jb23)) {
      t.jb23.setText("jb23 - clicked");
    }else if(e.getSource().equals(t.jb31)) {
      t.jb31.setText("jb31 - clicked");
    }else if(e.getSource().equals(t.jb32)) {
      t.jb32.setText("jb32 - clicked");
    }else if(e.getSource().equals(t.jb33)) {
      t.jb33.setText("jb33 - clicked");
    }
  }
  
}
