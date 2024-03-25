// package Button;

// import java.awt.Color;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// import javax.swing.JButton;
// import javax.swing.JFrame;

// public class MyFrameWithoutLambdaExpression extends JFrame implements ActionListener{
 
//     JButton button2;       // we declared it outside so that it can be accessed globally
//     MyFrameWithoutLambdaExpression(){
//         /*Second step */
//         button2  = new JButton();   
//         button2.setBounds(400, 200, 100, 50);
//         button2.addActionListener(this);     //Using ActionListener class

//         /*First step */
//         // this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         // this.setLayout(null);
//         // this.setSize(500, 500);
//         // this.setVisible(true);
//         // this.add(button2);
//     }

//     @Override
//     public void actionPerformed(ActionEvent e){
//         if(e.getSource()==button2){
//             System.out.println("poo");
//         }
//     }
// }