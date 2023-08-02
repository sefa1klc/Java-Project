
package composition;

public class Composition {
    public static void main(String[] args) {
        
        resolution resolution = new resolution(1920, 1080);
        monitör monitör = new monitör("vs197de", "asus", "25", resolution);
        kasa kasa = new kasa("Blite", "shadoe", "tamperli cam");
        anakart anakart = new anakart("prooo", "asus", "10" , "win11");
        
        bilgisayar pc = new bilgisayar(monitör, kasa, anakart);
        
        pc.getKasa().bilgisayarı_aç();
        pc.getMonitör().monitoru_kapat();
        pc.getAnakart().işletim_sistemi_yükle("win12");
        
        
        
    }

    
}
