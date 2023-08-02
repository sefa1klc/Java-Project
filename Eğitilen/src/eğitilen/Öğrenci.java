
package eğitilen;


public class Öğrenci extends Eğitilen {
    
    private int numara;
    private String sınıf;

    public Öğrenci(String ad, String soyad, int numara, String sınıf) {
        super(ad, soyad);
        
        this.numara = numara;
        this.sınıf = sınıf;
    }
    
    @Override
    public boolean okulageldimi() {
        return super.okulageldimi(); 
        
    }
    
    public void bilgilerigöster(){
        super.bilgilerigöster();
        
        System.out.println("Numarası: " + this.numara);
        System.out.println("Sınıfı: " + this.sınıf);
    }
    
    public void notAl(){
        System.out.println("Lütfen notlarınızı eksik tutmayın...");
    }
}
