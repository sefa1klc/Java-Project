
package javaapplication26;

import java.awt.FlowLayout;
import javax.swing.JFrame;


public class title {
    
    public static void main(String args[]){
        JFrame jf = new JFrame();
        jf.setTitle("ATM");
        jf.setSize(350, 350);
        jf.setLocation(100, 200);
        
        jf.getContentPane().setLayout(new FlowLayout());
        
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
        
    
    }
    
}
