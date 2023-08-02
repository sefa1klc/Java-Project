
package çalışan;

import java.util.Scanner;


public class main {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Çalışanlar Programına hoşgeldiniz....");
   

        String işlemler = "İŞLEMLER\n"
           + "1. Yazılımcı İşlemleri\n"
           + "2. Yönetici İşlemler\n"
           + "Çıkmak  için q'ya basınız...";
        
        System.out.println("**********************");
        System.out.println(işlemler);
        System.out.println("**********************");
        
        
        
        while(true){
            System.out.println("Yapmak İStediğiniz İşlemi giriniz: ");
            String işlem = scan.nextLine();
            
            
            if(işlem.equals("q")){
                System.out.println("Programdan çıkılıyor...");
                break;
                
            }
            else if(işlem.equals("1")){
                
                Yazılımcı yazılımcı = new Yazılımcı("Sefa", "KILIÇ", 4535, "Phyton, java");
                
                String y_işlemler = "İŞLEMLER\n"
                      + "1. Format At\n"
                      + "2. Bilgileri Göster\n"
                      + "Çıkmak  için q'ya basınız...";
                
                System.out.println("**********************");
                System.out.println(y_işlemler);
                System.out.println("**********************");

                while(true){
                    System.out.println("İşlemi seçiniz: ");
                    String y_işlem = scan.nextLine();
                    
                    if(y_işlem.equals("q")){
                        System.out.println("Yazılımcı İşlemleri Sonlandırıldı..");
                        break;
                        
                    }
                    else if(y_işlem.equals("1")){
                        
                        System.out.println("İşletim Sisitemi: ");
                        String işletim_sistemi = scan.nextLine();
                        yazılımcı.formatAt(işletim_sistemi);
                        
                
                    }
                    else if(y_işlem.equals("2")){
                        yazılımcı.bilgilarigöster(işlem, y_işlem, 0);
                
                    }
                    else{
                        System.out.println("geçersiz Yazılımcı İşlemi");
                    }
                               
                    
                }
                         
                
            }
            else if(işlem.equals("2")){
                
                Yönetici yönetici = new Yönetici("Şevval", "Bilkay", 666, 1);
                
                String y_işlemler = "İŞLEMLER\n"
                      + "1. Zam Yap\n"
                      + "2. Bilgileri Göster\n"
                      + "Çıkmak  için q'ya basınız...";
                
                System.out.println("**********************");
                System.out.println(y_işlemler);
                System.out.println("**********************");
                        
                
                while(true){
                    System.out.println("İşlemi seçiniz: ");
                    String y_işlem = scan.nextLine();
                    
                    if(y_işlem.equals("q")){
                        System.out.println("Sonlandırıldı..");
                        break;
                        
                    }
                    else if(y_işlem.equals("1")){
                        
                        System.out.println("Zam Miktarı: ");
                        int zamMiktarı = scan.nextInt();
                        scan.nextLine();
                        yönetici.zamYap(zamMiktarı);
                        
                
                    }
                    else if(y_işlem.equals("2")){
                        yönetici.bilgilarigöster(işlem, y_işlem, 0);
                
                    }
                    else{
                        System.out.println("Geçersiz Yönetici İşlemi");
                    }             
                }    
            }
            else{
                System.out.println("Yanlış tuşlama yaptınız..");
                break;
            }
        }
        
    }
   
}
