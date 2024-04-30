package org.example;

import javax.swing.*;
import java.awt.*;

public class UIElement {
    JPanel[] layoutPanel= new JPanel[2];

    public JPanel setLayoutPanel(int width, int height){
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(width,height));
        panel.setBackground(new Color(20,20,20));
        return panel;
    }
}
