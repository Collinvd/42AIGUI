package org.example;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class UIElement {
    //Layout panels
    JPanel layoutPanelW = new JPanel();
    JPanel layoutPanelC = new JPanel();
    JPanel promptPanel = new JPanel();
    JPanel newChatButtonPanel = new JPanel();
    JPanel chatPanel = new JPanel();
    //Buttons
    JButton newChatButton = new JButton();

    //Colors
    Color darkGray = new Color(28,28,28);
    Color gray = new Color(35,35,35);
    Color lightGray = new Color(40,40,40);
    Color white = Color.WHITE;

    JPanel getLayoutPanel(int width, int height, Color color, LayoutManager layout){
        JPanel panel = new JPanel();

        panel.setPreferredSize(new Dimension(width,height));
        panel.setBackground(color);
        panel.setLayout(layout);
        return panel;
    }
    JButton getNewChatButton(int width, int height, Color color){
        JButton button = new JButton();
        button.setForeground(white);
        button.setText("+New Chat");
        button.setBounds(15,5,120,30);
        button.setOpaque(true);
        button.setBackground(color);
        button.setFocusPainted(false);
        return button;
    }
}
