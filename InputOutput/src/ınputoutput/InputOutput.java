
package ınputoutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class InputOutput {

    
    public static void main(String[] args) {
        FileOutputStream fos = null;
        File file = new File("dosya.txt");
        
        try {
            fos = new FileOutputStream(file,true);// buraya true yazarsak dosyada ne varsa onun sonuna gider ve oraya yazar,
            // eğer yazmazsak dosyayı temizler ve en başa yazar.
            
            byte[] arr = {65,66,67,68,69,78};
            
            String s = "aaaahhhhhhhhhh laan";
            byte[] arrr = s.getBytes();
            
            fos.write(10);
            
            fos.write(arrr);
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("FileNotFoundException hatası bulundu");
        } catch (IOException ex) {
               System.out.println("Dosyaya yazılırken bi hata oluştu");
        }
        
        finally{
            try {
                fos.close();
            } catch (IOException ex) {
                System.out.println("Dosya kapatılırken bi hata oluştu");
            }
        }
    }
    
}
