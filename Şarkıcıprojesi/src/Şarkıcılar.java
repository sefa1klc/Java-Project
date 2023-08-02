
import java.util.ArrayList;


public class Şarkıcılar {
    private ArrayList<String> sarkıcı_listesi = new ArrayList<String>();
    
    public void şarkıcıları_bastır(){
        System.out.println("Şarkıcı listesinde " + sarkıcı_listesi.size() + " şarkıcı var.");
        
        for (int i = 0; i < sarkıcı_listesi.size(); i++) {
            System.out.println((i+1) + ".Şarkıcı:  " + sarkıcı_listesi.get(i));
            
        }
    }
    
    public void sarkıcı_ekle(String isim){
        sarkıcı_listesi.add(isim);
        
        System.out.println("Şarkıcı Listesi Güncellendi...");
    }
    
    public void sarkıcı_güncelle(String yeni_isim, int pozisyon){
        sarkıcı_listesi.set(pozisyon, yeni_isim);
        
        System.out.println("Şarkıcı Listesi Güncellendi...");
    }
    
    public void sarkıcı_sil(int pozisyon){
        String isim = sarkıcı_listesi.get(pozisyon);
        
        sarkıcı_listesi.remove(pozisyon);
        
        System.out.println(isim + "isimli şarkıcı listeden silindi");
    }
    
    public void sarkıcı_ara(String sarkıcı_ismi){
        int pozisyon = sarkıcı_listesi.indexOf(sarkıcı_ismi);
        
        if(pozisyon >= 0){
            System.out.println("Şarkıcı bulundu!");
            System.out.println(sarkıcı_ismi + "isimli şarkıcı " + (pozisyon+1) + ". pozisyonda");
            
        }
        else{
            System.out.println("Şarkıcı bulunmadı!!!");
        }
    }
}
