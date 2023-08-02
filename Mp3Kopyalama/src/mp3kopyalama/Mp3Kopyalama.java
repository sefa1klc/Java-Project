
package mp3kopyalama;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Mp3Kopyalama {
    private static ArrayList<Integer> icerik = new ArrayList<Integer>();
    
    public static void dosyaoku(){
        try {
            FileInputStream fis = new FileInputStream("neyse-siyah-sofar-istanbul.mp3");
            
            int oku;
            while((oku = fis.read()) != -1){
                icerik.add(oku);
            }
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadı!");
        } catch (IOException ex) {
            Logger.getLogger(Mp3Kopyalama.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void kopyala(String Dosyaismi){
        try {
            FileOutputStream fos = new FileOutputStream(Dosyaismi);
            
            
            for (int deger: icerik) {
                fos.write(deger);
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadı!");
        } catch (IOException ex) {
            Logger.getLogger(Mp3Kopyalama.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public static void main(String[] args) {
        
        dosyaoku();
        
        kopyala("sarkı2.mp3");
    }
    
}
 