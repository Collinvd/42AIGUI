package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Extending UIElement to gain access to components of the GUI(JFrame excluding)
//Implements ActionListener to look for Inputs from any button in the GUI
public class UI extends UIElement implements ActionListener {
    //Variables
    JFrame window = new JFrame();
    UI(){
        //window setup
        window.setTitle("42GUI");
        window.setSize(800,600);
        window.setMinimumSize(new Dimension(800,600));
        window.setResizable(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Center window
        int x = (screenSize.width - window.getWidth()) / 2;
        int y = (screenSize.height - window.getHeight()) / 2;
        window.setLocation(x, y);
        //Main Panels
        layoutPanelW = getLayoutPanel(180,0,darkGray, new BorderLayout());
        layoutPanelC = getLayoutPanel(100,100,lightGray,new BorderLayout());
        //Sub Panel Center
        promptPanel = getLayoutPanel(100,100,gray,null);
        //Sub Panel West
        newChatButtonPanel = getLayoutPanel(0,40, darkGray, null);
        chatPanel = getLayoutPanel(0, 0, darkGray, new FlowLayout(FlowLayout.CENTER, 1,1), white, 1,1,0,0);
        settings = getLayoutPanel(0,100, darkGray, null );
        //Sub Button West
        newChatButton = getNewChatButton(1,40,darkGray);
        newChatButtonPanel.add(newChatButton, BorderLayout.CENTER);
        //Adding sub panels to Main Panels
        layoutPanelW.add(newChatButtonPanel, BorderLayout.NORTH);
        layoutPanelW.add(chatPanel, BorderLayout.CENTER);
        layoutPanelW.add(settings, BorderLayout.SOUTH);
        layoutPanelC.add(promptPanel, BorderLayout.SOUTH);
        //Adding main panels to window
        window.add(layoutPanelC, BorderLayout.CENTER);
        window.add(layoutPanelW, BorderLayout.WEST);
        //Window finalization
        window.setIconImage(logo.getImage());
        window.pack();
        window.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
