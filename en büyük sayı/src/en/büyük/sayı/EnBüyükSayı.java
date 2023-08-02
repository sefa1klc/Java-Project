

package en.büyük.sayı;

import java.util.Scanner;


public class EnBüyükSayı {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("1. İşlem : Bakiye Öğrenme\n" +"2. İşlem : Para Çekme\n" +"3. İşlem : Para yatırma\n" + "Çıkış : q");
        System.out.println("Yapmak istediğiniz işlemi seçiniz: ");
        
        int işlem = scan.nextInt();
        String x = scan.nextLine();
        
        int Bakiye = 4560;
        
        while(true){
            
           
            

            switch(işlem){
                case 1:
                    System.out.println("Bakiyeniz: " + Bakiye);
                    break;
                
                case 2:
                    System.out.println("Çekmek istediğiniz tutarı giriniz: ");
                    int tutar = scan.nextInt();
                    
                    if(tutar<=Bakiye){
                        System.out.println("Paranız veriliyor...");
                        Bakiye = Bakiye - tutar;
                        System.out.println("Mevcut bakiyeniz: " + Bakiye);
                    }
                    else{
                        System.out.println("Yetersiz bakiye");
                    }
                    break;
                   
                case 3:
                    System.err.println("Yatırmak istediğiniz tutarı giriniz: ");
                    int ytutar = scan.nextInt();
                    
                    System.out.println("Paranız yatırılıyor...");
                    Bakiye = Bakiye + ytutar;
                    System.out.println("Mevcut bakiyeniz: " + Bakiye);
                    
                    break;
          
            }
            break;
        }
        
        
        
       
   
       
    }
    
}
