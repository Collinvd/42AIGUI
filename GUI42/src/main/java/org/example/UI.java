package org.example;
//For the GUI java swing is used
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

//Extending UIElement to gain access to components of the GUI(JFrame excluding)
//Implements ActionListener to look for Inputs from any button in the GUI
public class UI extends UIElement implements ActionListener {
    //Variables
    JFrame window = new JFrame();
    //UI contains all the code for the GUI which later gets called in main
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
        //==============================================================
        //==============================================================
        //Sub Panel Center
        promptPanel = getLayoutPanel(100,100,gray);
        Border border = BorderFactory.createEmptyBorder(0,40,0,40);
        promptPanel.setBorder(border);
        promptPanel.setLayout(new BoxLayout(promptPanel,BoxLayout.X_AXIS));
        chatpanel = getLayoutPanel(600,100,gray);
        chatpanel.setBorder(border);
        chatpanel.setLayout(new BoxLayout(chatpanel,BoxLayout.Y_AXIS));
        //Sub CHat
        chat = getChat();

        //Sub Button Center
        sendButton = getSendButton(100,30,gray);

        //TextField Center
        promptBar = getPromptBar(1,1,new Color(50,50,50));
        dialogPanel = new JScrollPane(chatpanel, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        dialogPanel.getVerticalScrollBar().setPreferredSize(new Dimension(10, 0));
        //==============================================================
        //==============================================================
        //Sub Panel West
        newChatButtonPanel = getLayoutPanel(0,41, darkGray, null, white, 0,1,0,0);
        tabList = getLayoutPanel(180, 0, darkGray, null);
        tabList.setLayout(new BoxLayout(tabList,BoxLayout.Y_AXIS));
        Border torder = BorderFactory.createEmptyBorder(2,0,2,12);
        tabList.setBorder(torder);
        tabPanel = new JScrollPane(tabList, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        tabPanel.getVerticalScrollBar().setPreferredSize(new Dimension(10, 0));
        settings = getLayoutPanel(0,100, darkGray, null , white, 1,0,0,0);
        //Sub Button West
        newChatButton = getNewChatButton(1,40,darkGray);
        newChatButton.addActionListener(this);
        newChatButtonPanel.add(newChatButton, BorderLayout.CENTER);
        //==============================================================
        //==============================================================
        chatpanel.add(chat);
        chatpanel.add(getChat());
        //Adding component to sub panels
        promptPanel.add(promptBar);
        promptPanel.add(sendButton);
        //Adding sub panels to Main Panels
        layoutPanelW.add(newChatButtonPanel, BorderLayout.NORTH);
        layoutPanelW.add(tabPanel, BorderLayout.CENTER);
        layoutPanelW.add(settings, BorderLayout.SOUTH);
        layoutPanelC.add(dialogPanel,BorderLayout.CENTER);
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
        if(e.getSource()==newChatButton){
            System.out.println(tabList.getPreferredSize());
            System.out.println(tabContainer.size());
            System.out.println(tabList.getComponentCount());
            System.out.println(chat.getMaximumSize());
            //=========================================================
            tabContainer.add(getLayoutPanel(180, 40, gray));
            tabContainer.get(tabContainer.size()-1).setLayout(new BoxLayout(tabContainer.get(tabContainer.size()-1), BoxLayout.X_AXIS));
            if(tabCount==0)
                tabContainer.get(tabContainer.size()-1).add(getTab(140, 40, gray, "Chat"));
            else
                tabContainer.get(tabContainer.size()-1).add(getTab(140, 40, gray, "Chat "+tabCount));
            tabRemove = getTab(18, 40, Color.red, "");
            tabRemove.addActionListener(this);
            tabContainer.get(tabContainer.size()-1).add(tabRemove);
            tabCount++;
            tabList.setPreferredSize(new Dimension(180,(46*tabContainer.size())+6));
            //============================================================
            tabList.add(Box.createRigidArea(new Dimension(0,6)));
            tabList.add(tabContainer.get(tabContainer.size()-1));
            tabList.repaint();
            window.revalidate();
        }
        for(int x = 0; x < tabContainer.size();x++){
            if(e.getSource()==tabContainer.get(x).getComponent(1)){
                tabContainer.get(x).removeAll();
                tabContainer.remove(x);
                tabList.remove(x*2);
                tabList.remove(x*2);
                if(tabContainer.isEmpty()){
                    tabCount=0;
                }
                tabList.repaint();
                window.revalidate();
            }
        }
    }
}
