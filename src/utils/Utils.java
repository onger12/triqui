package utils;

import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Utils {
  //params
  public static Color LIGHT_BLUE = new Color(69, 123, 157), DARK_BLUE = new Color(29, 53, 87), CANCEL_COLOR = new Color(230, 57, 70);

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
    return button;
  }
}
