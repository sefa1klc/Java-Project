
import java.util.Scanner;


public class test {
    
    private static Şarkıcılar sarkıcı = new Şarkıcılar();
    private static Scanner scan = new Scanner(System.in);
    
    public static void işlemleri_bastır(){
        
        System.out.println("\t 0-İşlemleri Görüntüle");
        System.out.println("\t 1-Şarkıcıları Görüntüle");
        System.out.println("\t 2-Şarkıcı Ekle");
        System.out.println("\t 3-Şarkıcı Güncelle");
        System.out.println("\t 4-Şarkıcı Sil");
        System.out.println("\t 5-Şarkıcı Ara");
        System.out.println("\t 6-Uygılamadan Çık");
    }
    
    public static void goruntule(){
        sarkıcı.şarkıcıları_bastır();
    }
    
    public static void sarkıcı_ekle(){
        
        System.out.println("Eklemek istediğiniz şarkıcının ismi: ");
        
        String isim = scan.nextLine();
        sarkıcı.sarkıcı_ekle(isim);
    }
    
    public static void güncelle(){
        
        System.out.println("Güncellemek istediğiniz pozisyon(1,2,3): ");
        
        int pozisyon = scan.nextInt();
        scan.nextLine();
        String yeni_isim = scan.nextLine();
        sarkıcı.sarkıcı_güncelle(yeni_isim, pozisyon-1);
    }
    
    public static void sil(){
        System.out.println("Silmek istediğiniz pozisyon(1,2,3): ");
        
        int pozisyon = scan.nextInt();
        sarkıcı.sarkıcı_sil(pozisyon);
    }
    
    public static void ara(){
        System.out.println("Aramak istediğiniz şarkıcının ismi: ");
        
        String ara_isim = scan.nextLine();
        sarkıcı.sarkıcı_ara(ara_isim);
    }
        
    
        
    public static void main(String[] args) {
        
        System.out.println("\t Şarkıcı Uygulamasına Hoşgeldiniz...");
        işlemleri_bastır();
        
        boolean çıkış = false;
        int işlem;
        
        while(!çıkış){
            System.out.println("Bir işlem seçiniz: ");
            
            işlem =scan.nextInt();
            scan.nextLine();
            
            switch (işlem) {
                
                case 0:
                    işlemleri_bastır();
                    break;
                
                case 1:
                    goruntule();
                    break;
                    
                case 2:
                    sarkıcı_ekle();
                    break;
                    
                case 3:
                    güncelle();
                    break;
                    
                case 4:
                    sil();
                    break;
                    
                case 5:
                    ara();
                    break;
                    
                case 6:
                    çıkış = true;
                    System.out.println("Uygulamadan Çıklıyor!!!");
                    break;
                            
                    
                }
            }
            
        }
    
}
