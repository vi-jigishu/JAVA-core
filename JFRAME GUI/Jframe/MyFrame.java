//Second way of using Jframe(by creating a subclass of JFrame)

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;

public class MyFrame extends JFrame {
    MyFrame(){
        this.setTitle("JFrame title goes here");    //sets title of frame
        this.setResizable(false);   //Prevent frame from being resizzed
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //exit out of applictaion and close thethis

        this.setVisible(true);     //make frame visible
        this.setSize(500, 500);   //Sets the width and height of frame

        ImageIcon image = new ImageIcon("demo_logo.jpg");    //Create an Image Icon
        this.setIconImage(image.getImage());      //change image icon of the frame
        this.getContentPane().setBackground(new Color(0x555555));
    }
}
