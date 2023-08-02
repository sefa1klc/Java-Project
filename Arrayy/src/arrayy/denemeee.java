
package arrayy;

 import java.awt.FlowLayout;
 import java.awt.event.ActionListener;
 import java.awt.event.ActionEvent;
 import javax.swing.JFrame;
 import javax.swing.JButton;
 import javax.swing.Icon;
 import javax.swing.ImageIcon;
import javax.swing.JList;
 import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class denemeee extends JFrame implements ListSelectionListener{
    
   private JList sehir;
   private static final String sehirlist[] = {"İstanbul", "c" , "Bursa", "Edirne","İstanbul", "Ankara" , "Bursa", "Edirne","İstanbul", "Ankara" , "Bursa", "Edirne"};
   
   
   public denemeee(){
       super("Sehir Listesi");
       setLayout(new FlowLayout());
       
       sehir = new JList(sehirlist);
       sehir.setVisibleRowCount(3);
       
       
       add(new JScrollPane(sehir));
       
       
       sehir.addListSelectionListener( this);
   }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        
    }
 
    
    public static void main(String[] args) {
        
        denemeee deneme = new denemeee();
        deneme.setSize(400, 200);
        deneme.setVisible(true);
    }
}


    
