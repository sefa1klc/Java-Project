
package fileıputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileIputStream {

    
    public static void main(String[] args) {
        
        FileInputStream fis = null;
        
        try {
            fis = new FileInputStream("Okuma.txt");
            
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("file bulunamadı");
        }
        
        finally{
            try {   
                if(fis != null){
                    fis.close(); 
                }
                
            } catch (IOException ex) {
                System.out.println("dosya kapatıldı");
            }
    
        }
    }
    
}
