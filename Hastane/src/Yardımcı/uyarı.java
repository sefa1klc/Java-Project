/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Yardımcı;

import javax.swing.JOptionPane;

/**
 *
 * @author kilic
 */
public class uyarı {
    
    public static void massage(String str){
        
        String message;
        
        switch (str) {
            case "fill":
                message = "Lütfen tüm alanları doldurunuz!";    
                break;
                
            case "success":
                message = "İşlem Başarılı";
                break;
            
                
            default:
                message =str;
                
        }
        JOptionPane.showMessageDialog(null, message, "Mesaj", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
