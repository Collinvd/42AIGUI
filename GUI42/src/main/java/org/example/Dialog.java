package org.example;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Dialog extends UIElement{
    JPanel userMessageContainer = new JPanel();
    JPanel assistantResponseContainer = new JPanel();

    JTextArea userMessage = new JTextArea();
    JTextArea response = new JTextArea();
    Dialog(){
        userMessageContainer = getContainer(600,100, gray,gray);
        assistantResponseContainer = getContainer(600,100, gray, lightGray);
        userMessage = getTextArea(gray);
        response = getTextArea(lightGray);
    }
    JPanel getContainer(int width, int height, Color color, Color borderColor){
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(width,height));
        Border border = BorderFactory.createMatteBorder(20,40,20,40,borderColor);
        panel.setBackground(color);
        panel.setBorder(border);
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        return panel;
    }
    JTextArea getTextArea(Color color){
        JTextArea text = new JTextArea();
        text.setBackground(color);
        text.setMaximumSize(new Dimension(6000,500));
        text.setEditable(false);
        text.setOpaque(true);
        text.setForeground(white);
        text.setFont(new Font("Calibri", Font.PLAIN,18));
        text.setText("lorem\nlorem\nlorem\nlorem\nlorem\nlorem\nlorem\nuuuuuuuuuuuuuuudddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddduuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        text.setLineWrap(true);
        return text;
    }
}
