
import java.util.Scanner;


public class hesapmakınası {
    public static int toplama(int a, int b, int c){
        
        return (a+b+c);
    }
    public static int toplama(int a, int b){
        
        return (a+b);
    }
    public static int çarpma(int a, int b, int c){
        
        return (a*b*c);
    }
     public static int çarpma(int a, int b){
        
        return (a*b);
    }
      public static int çıkarma(int a, int b){
        
        return (a-b);
    }
       public static double bölme(double a, double b){
        
        return (a/b);
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String işlemler = "1.toplama işlemi\n"
                          +"2.çıkarma işlemi\n"
                          +"3.bölme işlemi\n"
                          +"4.çarpma işlemi\n"
                          +"Çıkış için q'ya basınız.";
        
        System.out.println(işlemler);
        
        
                         
        
        while(true){
            
            System.out.println("İşlemi seçiniz: ");
            String işlem = scan.nextLine();
            
            if(işlem.equals("q")){
                System.out.println("Sistemden çıkılıyor..");
                break;
            }
        
            else if(işlem.equals("1")){
                System.out.println("Lütfen kaç sayı ile işlem yapcağınızı seçiniz ?(2 veya 3)..");
                
                int kaçsayı = scan.nextInt();
               
                if (kaçsayı == 2){
                    
                    System.out.print("a:");
                    int a = scan.nextInt();
                    System.out.print("b:");
                    int b = scan.nextInt();
                    scan.nextLine();
                    
                    System.out.println("girilen sayıların toplamı: "+  toplama(a, b));
                }
                
                else if (kaçsayı == 3){
                    
                    System.out.print("a:");
                    int a = scan.nextInt();
                    System.out.print("b:");
                    int b = scan.nextInt();
                    System.out.print("c:");
                    int c = scan.nextInt();
                    scan.nextLine();
                    
                    System.out.println("girilen sayıların toplamı: "+  toplama(a, b, c));
                }
                
                else{
                    System.out.println("uygun method bulunamadı!");
                }
                    
            
            }
             else if(işlem.equals("2")){
                 
                 System.out.print("a:");
                 int a = scan.nextInt();
                 System.out.print("b:");
                 int b = scan.nextInt();
                 
                 System.out.println("Çıkarma işleminin sonucu: "+ çıkarma(a, b));
                 
                        
                }
             else if(işlem.equals("3")){
                 System.out.print("a:");
                 int a = scan.nextInt();
                 System.out.print("b:");
                 int b = scan.nextInt();
                 
                 System.out.println("Bölme işleminin sonucu: "+ bölme(a, b));
                 
                        
                }
             else if(işlem.equals("4")){
                System.out.println("Lütfen kaç sayı ile işlem yapcağınızı seçiniz..");
                
                int kaçsayı = scan.nextInt();
               
                if(kaçsayı == 3){
                    
                    System.out.print("a:");
                    int a = scan.nextInt();
                    System.out.print("b:");
                    int b = scan.nextInt();
                    System.out.print("c:");
                    int c = scan.nextInt();
                    scan.nextLine();
                    
                    System.out.println("girilen sayıların çarpımı: "+  çarpma(a, b, c));
                }
                
                else if (kaçsayı == 2){
                    
                    System.out.print("a:");
                    int a = scan.nextInt();
                    System.out.print("b:");
                    int b = scan.nextInt();
                    scan.nextLine();
                    
                    System.out.println("girilen sayıların çarpımı:"+  çarpma(a, b));
                }
                else{
                    System.out.println("uygun method bulunamadı!");
                }
        }
        
        
    }
    
    }
}
