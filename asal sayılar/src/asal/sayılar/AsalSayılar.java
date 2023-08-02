
package asal.sayılar;


public class AsalSayılar {
    
    public static void asal(int sayı){
        
        int sayac = 0;
              
        for(int i = 2 ; i<sayı ; i++){
            
            if(sayı % i == 0){
                sayac++;
                
             }

           }
        if(sayac == 0){
                    System.out.println(sayı);
        }
              
    }
        

    public static void main(String[] args) {
        
        for(int i = 2 ; i <1000 ; i++){
            
            asal(i);
            
        }
        
        
    }
    
}
