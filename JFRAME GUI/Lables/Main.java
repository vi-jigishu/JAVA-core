package Lables;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.Border;

public class Main {

    public static void main(String[] args) {

        //JLabel = a GUI display area for a string of text an image or both.

        ImageIcon image= new ImageIcon("C:\\Users\\KIIT\\Documents\\JAVA LAB\\JAVA CORE\\JFRAME GUI\\Lables\\coderPanda1.jpg");
        Border border= BorderFactory.createLineBorder(Color.GREEN);
        JLabel label= new JLabel();   //Creates a label object
        label.setText("Bro do you even code?");  //Set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);   //set text LEFT, CENTER, RIGHT of imageicon
        label.setVerticalTextPosition(JLabel.TOP);       //set text TOP< CENTER, BOTTOM of teh imageicon
        label.setForeground(new Color(0xFF0000));   //set COLOR of the text
        label.setFont(new Font("MV Boli", Font.PLAIN, 22));   //set font of text
        label.setIconTextGap(4);     //set ga[ pf text to the image
        label.setBackground(new Color(0x000000));  //set background color
        label.setOpaque(true);      //displays backgrounnd color
        label.setBorder(border);    //displays border for the label. And proves that label likes to take as much space as is available to it in the frame.
        label.setVerticalAlignment(JLabel.CENTER);     //set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER);    //set horizonatal position fo icon+text within label
        //label.setBounds(100, 100, 600, 600);   //set x, y position whithin frame as well as dimensions. To prevent the frame.setLayout(null) method from vaishing the label


        JFrame frame= new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(600, 600);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);   //adds the label to the frame. DONOT FORGET THIS.
        frame.pack();     //automatically resize the size of the frame to accomodate all the components of the frame. so we donot need to use the methods: label.setLabelBounds()-[ln-32], frame.setSize()- [ln-37] and frame.setLayout()-[ln-38]
        //frame.add(label);   //Donot do this. Use .add() before .pack()
    }
}
