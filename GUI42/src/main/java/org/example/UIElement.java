package org.example;

import javax.swing.*;
import java.awt.*;

public class UIElement {
    JPanel layoutPanelW = new JPanel();
    JPanel layoutPanelC = new JPanel();

    Color darkGray = new Color(28,28,28);
    Color gray = new Color(35,35,35);
    Color lightGray = new Color(40,40,40);

    JPanel getLayoutPanel(int width, int height, Color color){
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(width,height));
        panel.setBackground(color);
        panel.setLayout(new BorderLayout());
        return panel;
    }
}
