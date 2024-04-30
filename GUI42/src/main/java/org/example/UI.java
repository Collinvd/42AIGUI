package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI extends JFrame implements ActionListener {

    UIElement element;
    JPanel panelSearch = new JPanel();
    JPanel panelW = new JPanel();
    JPanel panelS = new JPanel();
    UI(){
        this.setTitle("42GUI");
        this.setSize(800,600);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int x = (screenSize.width - this.getWidth()) / 2;
        int y = (screenSize.height - this.getHeight()) / 2;

        this.setLocation(x, y);

        panelW.setPreferredSize(new Dimension(150,100));
        panelW.setBackground(new Color(28,28,28));
        panelS.setPreferredSize(new Dimension(150,100));
        panelS.setBackground(new Color(40,40,40));
        panelS.setLayout(new BorderLayout());
        panelSearch.setPreferredSize(new Dimension(150,100));
        panelSearch.setBackground(new Color(35,35,35));

        panelS.add(panelSearch, BorderLayout.SOUTH);
        this.add(panelS, BorderLayout.CENTER);
        this.add(panelW, BorderLayout.WEST);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
