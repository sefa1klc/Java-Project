

public class main {
    
    public static void main(String args[]){
        
        ATM atm = new ATM();
        
        hesap obj1 = new hesap("Sefa ", "12345", 2000);
        
        atm.çalış(obj1);
        System.out.println("programdan çıkılıyor");
        
    }
}


