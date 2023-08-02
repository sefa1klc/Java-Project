
package eğitilen;

import java.util.Scanner;
import jdk.nashorn.api.tree.BreakTree;


public class Eğitilen {
    
    private String ad;
    private String soyad;

    public Eğitilen(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }
    
    public boolean okulageldimi(){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Okula geldiniz mi?");
        
        String yoklama = scan.nextLine();
        
        
        if(yoklama.equals("evet")){
           
           return true;
        }
        
        else if(yoklama.equals("hayir")){

            return false;
        }
        
        else{
            System.out.println("Geçerli bi cavap giriniz! -evet vaya hayır-");
            
            return false;
        }
    }
    
    public void bilgilerigöster(){
        
        System.out.println("Adı: " + this.ad);
        System.out.println("Soyadı: " + this.soyad);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
    
}
