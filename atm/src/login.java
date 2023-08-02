
import java.util.Scanner;


public class login {
    
    public boolean login(hesap obj1){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Kullanıcı adı: ");
        String kullanıcı_adı = scan.nextLine();
        System.out.print("Parola: ");
        String parola = scan.nextLine();
        
        if(obj1.getKullanıcıadı().equals(kullanıcı_adı) && obj1.getParola().equals(parola)){
            
            return true;
        
       }
        else{
            return false;
        }
        
    }
    
}
