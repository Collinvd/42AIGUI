package org.example;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
//Sorry i forgor to put any explanation
public class UIElement {
    Toolkit toolkit = Toolkit.getDefaultToolkit();
    Dimension screenSize = toolkit.getScreenSize();
    //Layout panels
    JPanel layoutPanelW = new JPanel();
    JPanel layoutPanelC = new JPanel();
    JPanel promptPanel = new JPanel();
    JPanel newChatButtonPanel = new JPanel();
    JPanel chatPanel = new JPanel();
    JPanel settings = new JPanel();
    //Buttons
    JButton newChatButton = new JButton();
    JButton sendButton = new JButton();
    //TextField
    JTextField promptBar = new JTextField();
    //Images
    ImageIcon logo = new ImageIcon("42Logo.png");
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
    JPanel getLayoutPanel(int width, int height, Color color, LayoutManager layout, Color borderColor, int top ,int bottom, int left, int right){
        JPanel panel = new JPanel();
        Border border = BorderFactory.createMatteBorder(top,left,bottom,right,borderColor);
        panel.setPreferredSize(new Dimension(width,height));
        panel.setBackground(color);
        panel.setLayout(layout);
        panel.setBorder(border);
        return panel;
    }
    JTextField getPromptBar(){
        JTextField textField = new JTextField();
        return  textField;
    }
    JButton getNewChatButton(int width, int height, Color color){
        JButton button = new JButton();
        button.setForeground(white);
        button.setHorizontalAlignment(JButton.LEFT);
        button.setText("+  New chat");
        button.setBounds(5,5,170,30);
        button.setOpaque(true);
        button.setBackground(color);
        button.setFocusPainted(false);
        return button;
    }
    JButton getSendButton(){
        JButton button = new JButton();
        return button;
    }
}
