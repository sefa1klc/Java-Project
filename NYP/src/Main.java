
import java.util.Scanner;



public class Main {
    
    public static void sekiller(){
        System.out.println("1-Kare \n"
                + "2-Dikdortgen \n"
                + "3-Yamuk \n"
                + "4-Paralelkenar \n"
                + "5-Hepsi \n");

}
    
    public static void main(String args []){
        int[] arrKare = new int[10];
        int[] arrDikdortgen = new int[10];
        int[] arrYamuk = new int[10];
        int[] arrParalelkenar = new int[10];
        
        
       
        Scanner scan = new Scanner(System.in);
        sekiller();
        
        

        while(true){
            System.out.println("Tanımlamak İstediğiniz Şeklin İsmini Giriniz: ");
            String isim = scan.nextLine();
            

            if(isim.equals("Kare")){
                System.out.println("Lütfen Kordinatları (x y) Biçiminde ya da Alt Alta Giriniz: ");
                for (int i = 0; i < 4; i++) {
                    arrKare[i] = scan.nextInt();
                    scan.nextLine();
                    
                }
                 
                Kare kare = new Kare(arrKare[0], arrKare[1], arrKare[2], arrKare[3], arrKare[4], arrKare[5], arrKare[6], arrKare[7]);
                
                int uzunkenar =  Math.abs(arrKare[2]) - arrKare[0];
                int kısakenar = uzunkenar;
                System.out.println("Karenin alanı: " + kare.alan_bul(uzunkenar, kısakenar));                                           

            }
            else if(isim.equals("Dikdortgen")){
                System.out.println("Lütfen Kordinatları (x y) Biçiminde ya da Alt Alta Giriniz: ");
                for (int i = 0; i < 4; i++) {
                    arrDikdortgen[i] = scan.nextInt();
                    scan.nextLine();
                    
                }     
                Dikdortgen dikdortgen = new Dikdortgen(arrDikdortgen[0], arrDikdortgen[1], arrDikdortgen[2], arrDikdortgen[3],
                        arrDikdortgen[4], arrDikdortgen[5], arrDikdortgen[6], arrDikdortgen[7]);
                
                int uzunkenarr = Math.abs(arrDikdortgen[2]) + Math.abs(arrDikdortgen[0]);
                int kısakenarr = uzunkenarr;
                System.out.println("Dikdörtgenin alanı: " + dikdortgen.alan_bul(uzunkenarr, kısakenarr));

            }
            else if(isim.equals("Yamuk")){
                System.out.println("Lütfen Kordinatları (x y) Biçiminde ya da Alt Alta Giriniz: ");
                for (int i = 0; i < 4; i++) {
                    arrYamuk[i] = scan.nextInt();
                    scan.nextLine();
                    
                }     
                Yamuk yamuk = new Yamuk(arrYamuk[0], arrYamuk[1], arrYamuk[2], arrYamuk[3],
                        arrYamuk[4], arrYamuk[5], arrYamuk[6], arrYamuk[7]);
                
                int yatay = Math.abs(arrYamuk[2]) - arrYamuk[0];
                int dikey = Math.abs(arrYamuk[5]) - arrYamuk[3];
                System.out.println("Yamuğun alanı: " + yamuk.alan(yatay, dikey));

            }
            else if(isim.equals("Paralelkenar")){
                System.out.println("Lütfen Kordinatları (x y) Biçiminde ya da Alt Alta Giriniz: ");
                for (int i = 0; i < 4; i++) {
                    arrParalelkenar[i] = scan.nextInt();
                    scan.nextLine();
                    
                }   
                Paralelkenar paralelkenar = new Paralelkenar(arrParalelkenar[0], arrParalelkenar[1], arrParalelkenar[2], arrParalelkenar[3],
                        arrParalelkenar[4], arrParalelkenar[5], arrParalelkenar[6], arrParalelkenar[7]);
                
                int yatayy = Math.abs(arrParalelkenar[2]) - arrParalelkenar[0] ;
                int dikeyy = Math.abs(arrParalelkenar[5]) - arrParalelkenar[3] ;
                System.out.println("Paralelkenarın alanı: " + paralelkenar.alan_Paralel(yatayy, dikeyy));

            }
            else if(isim.equals("Hepsi")){
                System.out.println("Lütfen Karenin Kordinatlarını (x y) Biçiminde ya da Alt Alta Giriniz: ");
                for (int i = 0; i < 4; i++) {
                    arrKare[i] = scan.nextInt();
                    scan.nextLine();
                    
                }
                System.out.println("Lütfen Dikdortgenin Kordinatlarını (x y) Biçiminde ya da Alt Alta Giriniz: ");
                for (int i = 0; i < 4; i++) {
                    arrDikdortgen[i] = scan.nextInt();
                    scan.nextLine();
                    
                }     
                System.out.println("Lütfen Yamuğun Kordinatlarını (x y) Biçiminde ya da Alt Alta Giriniz: ");
                for (int i = 0; i < 4; i++) {
                    arrYamuk[i] = scan.nextInt();
                    scan.nextLine();
                    
                } 
                System.out.println("Lütfen Paralelkenarın Kordinatlarını (x y) Biçiminde ya da Alt Alta Giriniz: ");
                for (int i = 0; i < 4; i++) {
                    arrParalelkenar[i] = scan.nextInt();
                    scan.nextLine();
                    
                }
                
                Kare kare = new Kare(arrKare[0], arrKare[1], arrKare[2], arrKare[3], arrKare[4], arrKare[5], arrKare[6], arrKare[7]);
                
                int uzunkenar = Math.abs(arrKare[0]) + Math.abs(arrKare[2]);
                int kısakenar = uzunkenar;
                System.out.println("Karenin alanı: " + kare.alan_bul(uzunkenar, kısakenar) + "\n");
                
                
                Dikdortgen dikdortgen = new Dikdortgen(arrDikdortgen[0], arrDikdortgen[1], arrDikdortgen[2], arrDikdortgen[3],
                        arrDikdortgen[4], arrDikdortgen[5], arrDikdortgen[6], arrDikdortgen[7]);
                
                int uzunkenarr = Math.abs(arrDikdortgen[0]) + Math.abs(arrDikdortgen[2]);
                int kısakenarr = uzunkenarr;
                System.out.println("Dikdörtgenin alanı: " + dikdortgen.alan_bul(uzunkenarr, kısakenarr)+ "\n");
                
                Yamuk yamuk = new Yamuk(arrYamuk[0], arrYamuk[1], arrYamuk[2], arrYamuk[3],
                        arrYamuk[4], arrYamuk[5], arrYamuk[6], arrYamuk[7]);
                
                int yatay = Math.abs(arrYamuk[0]) + Math.abs(arrYamuk[2]);
                int dikey = Math.abs(arrYamuk[3]) + Math.abs(arrYamuk[5]);
                System.out.println("Yamuğun alanı: " + yamuk.alan(yatay, dikey)+ "\n");
                
                
                Paralelkenar paralelkenar = new Paralelkenar(arrParalelkenar[0], arrParalelkenar[1], arrParalelkenar[2], arrParalelkenar[3],
                        arrParalelkenar[4], arrParalelkenar[5], arrParalelkenar[6], arrParalelkenar[7]);
                
                int yatayy = Math.abs(arrParalelkenar[0]) + Math.abs(arrParalelkenar[2]);
                int dikeyy = Math.abs(arrParalelkenar[3]) + Math.abs(arrParalelkenar[5]);
                System.out.println("Paralelkenarın alanı: " + paralelkenar.alan_Paralel(yatayy, dikeyy)+ "\n");
                
            }
            
            else{
                System.out.println("Lütfen Geçerli Bir Şekil Giriniz!!!");
            }
        }
    }
    
}
