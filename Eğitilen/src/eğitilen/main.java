
package eğitilen;


public class main {
    
    public static void main(String[] args) {
        
        Öğrenci öğrenci1 = new Öğrenci("Sefa", "KİLİC", 13062000, "2");
        
        öğrenci1.bilgilerigöster();
        
        while(true){
            if(öğrenci1.okulageldimi()){
            System.out.println("Hoşgeldiniz...");
            öğrenci1.notAl();
            break;
            
        }
        else{
            System.out.println("Öğrenci okulda değil");
            break;
          
        }
        }
        
            
    }
    
}
