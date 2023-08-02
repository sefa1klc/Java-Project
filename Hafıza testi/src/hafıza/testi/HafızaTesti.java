
package hafıza.testi;

import java.util.Scanner;


public class HafızaTesti {
    private static Kartlar[][] kart = new Kartlar[4][4];
    
    public static void oyun_tahtası(){
        for (int i = 0; i < 4; i++) {
            System.out.println("_________________________");
            for (int j = 0; j < 4; j++) {
                
                if(kart[i][j].isTahmin()){
                    System.out.print("  |" + kart[i][j].getDeger() + "| ");
                }
                else{
                    System.out.print("  | | ");
                }
            }
            System.out.println("");
        }
        System.out.println("_________________________");
    }
    
    public static boolean oyunbittimi(){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(kart[i][j].isTahmin() == false){
                    return false;
                }
            }
            
        }
        return true;
    }
    
    public static void tahminet(){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Birinci Tahmin: ");
        int i1 = scan.nextInt();
        int j1 = scan.nextInt();
        
        kart[i1][j1].setTahmin(true);
        oyun_tahtası();
        
        System.out.println("ikinci Tahmin: ");
        int i2 = scan.nextInt();
        int j2 = scan.nextInt();
        
        if(kart[i1][j1].getDeger() == kart[i2][j2].getDeger()){
            kart[i2][j2].setTahmin(true);
            System.out.println("Tebrikler... Doğru Tahmin!");
        }
        else{
            kart[i1][j1].setTahmin(false);
            System.out.println("Yanlış Tahmin...");
            oyun_tahtası();
        }
    }

    
    public static void main(String[] args) {
        
        
        kart[0][0] = new Kartlar('E');
        kart[0][1] = new Kartlar('A');
        kart[0][2] = new Kartlar('B');
        kart[0][3] = new Kartlar('F');
        kart[1][0] = new Kartlar('G');
        kart[1][1] = new Kartlar('A');
        kart[1][2] = new Kartlar('D');
        kart[1][3] = new Kartlar('H');
        kart[2][0] = new Kartlar('F');
        kart[2][1] = new Kartlar('C');
        kart[2][2] = new Kartlar('D');
        kart[2][3] = new Kartlar('H');
        kart[3][0] = new Kartlar('E');
        kart[3][1] = new Kartlar('G');
        kart[3][2] = new Kartlar('B');
        kart[3][3] = new Kartlar('C');
        
        
        while(oyunbittimi() == false){
            oyun_tahtası();
            tahminet();
            
        }
        
        
    
    } 
    
    
    
}
