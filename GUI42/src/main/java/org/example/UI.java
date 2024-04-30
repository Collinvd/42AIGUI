package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI extends UIElement implements ActionListener {

    JFrame window = new JFrame();
    UI(){
        window.setTitle("42GUI");
        window.setSize(800,600);
        window.setResizable(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int x = (screenSize.width - window.getWidth()) / 2;
        int y = (screenSize.height - window.getHeight()) / 2;

        window.setLocation(x, y);

        layoutPanelW = getLayoutPanel(150,0,darkGray, new BorderLayout());
        layoutPanelC = getLayoutPanel(100,100,lightGray,new BorderLayout());
        promptPanel = getLayoutPanel(100,100,gray,null);
        newChatButtonPanel = getLayoutPanel(0,40, darkGray, null);
        chatPanel = getLayoutPanel(0, 0, gray, new FlowLayout(FlowLayout.CENTER, 1,1));

        newChatButton = getNewChatButton(1,40,gray);
        newChatButtonPanel.add(newChatButton, BorderLayout.CENTER);
        layoutPanelW.add(newChatButtonPanel, BorderLayout.NORTH);
        layoutPanelW.add(chatPanel, BorderLayout.CENTER);
        layoutPanelC.add(promptPanel, BorderLayout.SOUTH);
        window.add(layoutPanelC, BorderLayout.CENTER);
        window.add(layoutPanelW, BorderLayout.WEST);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
