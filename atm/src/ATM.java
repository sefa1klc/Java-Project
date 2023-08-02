
import java.util.Scanner;


public class ATM {
    
    public void çalış(hesap obj1){
        
        login obj = new login();
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Bankamıza Hoşgeldiniz... ");
        System.out.println("*************************");
        System.out.println("Kullanıcı Girişi");
        System.out.println("*************************");
        
        int girişhakkı = 3;
        
        while(true){
            
            if(obj.login(obj1)){
                System.out.println("Giriş Başarılı..");
                break;
   
            }
            else{
                System.out.println("Giriş Başarısız...");
                girişhakkı -=1;
                System.out.println("Kalan Giriş Hakkınız: "+ girişhakkı);
            }
            if(girişhakkı == 0){
                System.out.println("Giriş Hakkınız Bitti...");
                
                return;
                
            }
        }
        System.out.println("*************************");
        String işlemler = "1.Bakiye Görüntüleme \n"
                + "2.Para Yatırma \n"
                + "3.Para Çekme \n"
                + "Çıkmak için q'ya basınız..";
        System.out.println(işlemler);
        System.out.println("*************************");
        
        while(true){
            System.out.println("İşlem Seçiniz: ");
            
            String işlem = scan.nextLine();
            
            if(işlem.equals("q")){
                break; 
            }
            else if (işlem.equals("1")){
                System.out.println("Bakiyeniz: " + obj1.getBakiye());
            }
            else if(işlem.equals("2")){
                System.out.println("Yatırmak istediğiniz tutarı giriniz: ");
                
                int miktar = scan.nextInt();
                scan.nextLine();
                obj1.parayatır(miktar);
                
            }
            else if(işlem.equals("3")){
                System.out.println("Çekmek istediğiniz tutarı giriniz: ");
                int miktar = scan.nextInt();
                scan.nextLine();
                obj1.paraçekme(miktar);
                
            }
            else{
                System.out.println("Geçersiz İşlem...");
            }
        }
    
    }
    
}
