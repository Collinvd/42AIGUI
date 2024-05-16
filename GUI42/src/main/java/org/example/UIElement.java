package org.example;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

//Sorry i forgor to put any explanation
public class UIElement {

    Toolkit toolkit = Toolkit.getDefaultToolkit();
    Dimension screenSize = toolkit.getScreenSize();
    //Layout panels
    JPanel layoutPanelW = new JPanel();
    JPanel layoutPanelC = new JPanel();
    JPanel promptPanel = new JPanel();
    JPanel newChatButtonPanel = new JPanel();
    JPanel tabList = new JPanel();
    JPanel chatpanel = new JPanel();
    ArrayList<JPanel> tabContainer = new ArrayList<>();
    JPanel settings = new JPanel();
    //Scrollablepane
    JScrollPane tabPanel = new JScrollPane();
    JScrollPane dialogPanel = new JScrollPane();
    //Buttons
    JButton newChatButton = new JButton();
    JButton sendButton = new JButton();
    JButton tab = new JButton();
    JButton tabRemove = new JButton();
    JButton tabRename = new JButton();
    //TextArea
    JTextArea chat = new JTextArea();
    //TextField
    JTextField promptBar = new JTextField();
    //Images
    ImageIcon logo = new ImageIcon("42Logo.png");
    //Colors
    Color darkGray = new Color(28,28,28);
    Color gray = new Color(35,35,35);
    Color lightGray = new Color(40,40,40);
    Color white = Color.WHITE;

    int tabCount = 0;

    JPanel getLayoutPanel(int width, int height, Color color, LayoutManager layout){
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(width,height));
        panel.setBackground(color);
        panel.setLayout(layout);
        return panel;
    }
    JPanel getLayoutPanel(int width, int height, Color color){
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(width,height));
        panel.setBackground(color);
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
    JTextField getPromptBar(int width, int height, Color color){
        JTextField textField = new JTextField();
        textField.setForeground(white);
        textField.setHorizontalAlignment(JTextField.LEFT);
        //textField.setPreferredSize(new Dimension(width,height));
        textField.setMaximumSize(new Dimension(1920,30));
        textField.setOpaque(true);
        textField.setBorder(null);
        textField.setCaretColor(white);
        textField.setFont(new Font("Calibri", Font.PLAIN,16));
        textField.setBackground(color);
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
    JButton getSendButton(int width, int height, Color color){
        JButton button = new JButton();
        button.setForeground(white);
        button.setHorizontalAlignment(JButton.LEFT);
        button.setVerticalAlignment(JButton.CENTER);
        button.setText("Send");
        button.setMaximumSize(new Dimension(width, height));
        button.setOpaque(true);
        button.setBackground(color);
        button.setFocusPainted(false);
        return button;
    }
    JButton getTab(int width, int height, Color color,String text){
        JButton button = new JButton();
        button.setForeground(white);
        button.setHorizontalAlignment(JButton.LEFT);
        button.setVerticalAlignment(JButton.CENTER);
        button.setText(text);
        button.setMaximumSize(new Dimension(width, height));
        button.setMinimumSize(new Dimension(width, height));
        button.setOpaque(true);
        button.setBackground(color);
        button.setFocusPainted(false);

        return button;
    }
    JTextArea getChat(){
        JTextArea text = new JTextArea();
        text.setBackground(darkGray);
        text.setMaximumSize(new Dimension(6000,230));
        text.setEditable(false);
        text.setOpaque(true);
        text.setForeground(white);
        text.setFont(new Font("Calibri", Font.PLAIN,18));
        text.setText("fdnfdjnfklsdnfjsandfjonsajkdnsajkdnasjkdnsjkandjsandkossssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssandoasndosnadkonsasfddfafsfajncijuasbfduhasbhjdbsahdbashuibshiabdhsbdisbdjibsuidbasijdbas");
        text.setLineWrap(true);
        return text;
    }
}
