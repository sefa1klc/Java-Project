
import java.util.Scanner;



public class main {
    public static void main(String[] args) {
        System.out.println("Beyblade Programına Hoşgeldiniz... /n"
                + "Çıkış için q ya basınız");
        
        Scanner scan = new Scanner(System.in);
        
        while(true){
            System.out.println("Hangi Beyblade üretmek istiyorsunuz? :");
            String işlem = scan.nextLine();
            
            if(işlem.equals("q")){
                System.out.println("sistemden çıkılıyor");
            }
            else{
                Beybladefabrikası fabrika = new Beybladefabrikası();
                Beyblade beyblade = fabrika.beybladeüret(işlem);
                
                if(beyblade == null){
                    System.out.println("lütfen geçerli bir beyblade ismi girniz");
                }
                else{
                    beyblade.bilgilerigöster();
                    System.out.println("-------------------");
                    beyblade.saldır();
                    System.out.println("-------------------");
                    beyblade.kutsalcanavarıortayaçıkar();
                }
            }       
            
        }
        
    }
    
}
