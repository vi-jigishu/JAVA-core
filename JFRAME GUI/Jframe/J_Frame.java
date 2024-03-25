//package Jframe;
// import java.awt.Color;

// import javax.swing.ImageIcon;
// import javax.swing.JFrame;
// import javax.swing.text.AttributeSet.ColorAttribute;

//import MyFrame;

class J_Frame{
    public static void main(String[] args) {
        //JFrame = a GUI window to add components to

        // JFrame frame = new JFrame();   //Create a frame
        // frame.setTitle("JFrame title goes here");    //sets title of frame
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //exit out of applictaion and close the code
        //         //By defautlt it is 'HIDE_ON_CLOSE', so when we press the cross button it just hides the window and not close it.
        //         //We can prevent user from closing the window by using 'DO_NOTHING_ON_CLOSE'

        // frame.setResizable(false);   //Prevent frame from being resizzed

        // frame.setSize(500, 500);   //Sets the width and height of frame
        // frame.setVisible(true);     //make frame visible

        // ImageIcon image = new ImageIcon("demo_logo.jpg");    //Create an Image Icon
        // frame.setIconImage(image.getImage());      //change image icon of the frame
        
        // //frame.getContentPane().setBackground(Color.CYAN);    //Used default color optios available

        // //frame.getContentPane().setBackground(new Color(45,224, 123));   //range is (0,0,0) to (225,225,225)
        // frame.getContentPane().setBackground(new Color(0x235112));   //Hexadecimal values, range= (0x000000) to (0xFFFFFF)


        new MyFrame();
        //MyFrame frame= new MyFrame();        This format should be used ideally. It allows modifications to be done eaisly.
    }
}