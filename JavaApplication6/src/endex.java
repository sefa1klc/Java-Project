
import java.util.Scanner;

public class endex {
 
    public static void main(String[] args) {

        
        Scanner scan = new Scanner(System.in);
        System.out.println("dik kenarı giriniz:");
        
        int dikkenar = scan.nextInt();
        
        System.out.println("tabanı giriniz:");
        int taban = scan.nextInt();
        
        double hipotenüs =  Math.sqrt(Math.pow(taban, 2)+ Math.pow(dikkenar, 2));
        
        System.out.println("Hipotenüs: " + hipotenüs );
        
        }
           
    }
    
