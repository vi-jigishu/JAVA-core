package Button;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame{

    JButton button;       // we declared it outside so that it can be accessed globally
    JLabel label;
    MyFrame(){

        /*Third step */
        ImageIcon icon = new ImageIcon("C:\\Users\\KIIT\\Pictures\\Screenshots\\Screenshot 2024-03-13 093613.png");


        /*Fourth step:  demonstrating that we can change components of a frame with the click of a button*/
        ImageIcon icon2 = new ImageIcon("C:\\Users\\KIIT\\Pictures\\Screenshots\\Screenshot 2024-03-13 095940.png");
        label = new JLabel(icon2);
        //label.setIcon(icon2);
        label.setBounds(230, 250, 80, 70); 
        label.setVisible(false);



        /*Second step */
        button  = new JButton();   
        button.setBounds(100, 170, 300, 50);
        //button.addActionListener(e -> System.out.println("poo"););
        button.addActionListener(e -> label.setVisible(true));      //Using lambda expression
        button.setText("I am a Button");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.LEFT);
        button.setVerticalTextPosition(JButton.TOP);
        button.setFont(new Font("Comic Sans", Font.BOLD, 19));
        button.setIconTextGap(10);
        button.setForeground(Color.CYAN);
        button.setBackground(Color.DARK_GRAY);
        button.setBorder(BorderFactory.createEtchedBorder());
        //button.setEnabled(false);     //disables or enables the button
        

        /*First step */
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        //this.add(button2);     //HOW TO IMPLEMET ANOTHER CLASS HERE???
        this.add(label);
    }
}