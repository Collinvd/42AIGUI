package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI extends UIElement implements ActionListener {

    JFrame window = new JFrame();
    JPanel panelSearch = new JPanel();
    JPanel panelW = new JPanel();
    JPanel panelS = new JPanel();
    UI(){
        window.setTitle("42GUI");
        window.setSize(800,600);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int x = (screenSize.width - window.getWidth()) / 2;
        int y = (screenSize.height - window.getHeight()) / 2;

        window.setLocation(x, y);

        layoutPanelW = getLayoutPanel(150,100,darkGray);
        layoutPanelC = getLayoutPanel(100,100,lightGray);
        panelSearch = getLayoutPanel(100,100,gray);

        layoutPanelC.add(panelSearch, BorderLayout.SOUTH);
        window.add(layoutPanelC, BorderLayout.CENTER);
        window.add(layoutPanelW, BorderLayout.WEST);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
