package Jpanel;

//import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {
    public static void main(String[] args) {
        // JPanel =  a GUI component that functions as a container to hold other components

        ImageIcon icon = new ImageIcon("C:\\Users\\KIIT\\Pictures\\Screenshots\\Screenshot 2024-03-13 081938.png");

        JLabel label = new JLabel(); 
        label.setText("Hii!");
        label.setIcon(icon);
        //label.setVerticalAlignment(JLabel.BOTTOM);     //Only use this when we are using a layout manager
        //label.setHorizontalAlignment(JLabel.RIGHT);    //Only use this when we are using a layout manager
        
        label.setBounds(0, 0, 110, 120);     //We havr to set bounds for the label because we have set the layput managers to null.
                                                              //setBounds places the component to the position at these coordinates relatiev to the container(frame or panel) that holds it

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(0, 0, 250, 250);
        //redPanel.setLayout(new BorderLayout());
        redPanel.setLayout(null);    //We set to to null so thet we donot use a layout manager
        
        
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);
        //bluePanel.setLayout(new BorderLayout());    
        bluePanel.setLayout(null);    //We set to to null so thet we donot use a layout manager

        
        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500, 250);
        //greenPanel.setLayout(new BorderLayout());
        greenPanel.setLayout(null);    //We set to to null so thet we donot use a layout manager


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);     //Disabling the default Layout Manager. We have to manulay place the coordinates and sizes of each component.
        frame.setSize(750, 750);
        frame.setVisible(true);
        bluePanel.add(label);
        greenPanel.add(label);   //Only the second .add() will execute
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);

    }
}
