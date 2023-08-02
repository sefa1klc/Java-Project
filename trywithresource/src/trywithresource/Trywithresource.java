package trywithresource;

import java.io.FileWriter;
import java.io.IOException;


public class Trywithresource {

    public static void main(String[] args) {
        
           try(FileWriter writer = new FileWriter("dosya.txt")){
               
           writer.write("aaaaaaaaaaa");
            
        } catch (IOException ex) {
               System.out.println("Dosya oluşturuluken hata oluştu");
        }
    }
    
}
