package utils;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Utils {
  //params
  public static Color 
    DARK_BLUE = new Color(69, 123, 157), 
    LIGHT_BLUE = new Color(168, 218, 220), 
    BG_BLUE = new Color(29, 53, 87), 
    CANCEL_COLOR = new Color(230, 57, 70), 
    CANCEL_LIGHT_COLOR = new Color(231, 111, 81), 
    LIGHT_GREEN = new Color(199, 249, 204), 
    DARK_GREEN = new  Color(87, 204, 153);
  public int 
    PVP_MODE = 1,
    COM_MODE = 2;

  // methods
  public static JButton createSimpleButton(String text, Color bgColor, Color borderColor, Color fontColor) {
    JButton button = new JButton(text);
    button.setForeground(fontColor);
    button.setBackground(bgColor);
    Border line = new LineBorder(borderColor);
    Border margin = new EmptyBorder(5, 15, 5, 15);
    Border compound = new CompoundBorder(line, margin);
    button.setBorder(compound);
    button.setCursor(new Cursor(Cursor.HAND_CURSOR));
    button.setFont(new Font("Fira Code", Font.BOLD, 13));
    return button;
  }
  public static void jbHoverSwitchBg (JButton jb, Color colorHover, Color colorInitial) {
    jb.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
          jb.setBackground(colorHover);
          jb.setForeground(Color.BLACK);
      }
  
      public void mouseExited(java.awt.event.MouseEvent evt) {
          jb.setBackground(colorInitial);
          jb.setForeground(Color.WHITE);
      }
  });
  }
}
