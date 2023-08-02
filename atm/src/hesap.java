
public class hesap {
    
    private String kullanıcıadı;
    private String parola;
    private double bakiye;
    
    public hesap(String kullanıcıadı,String parola, double bakiye){
        
        this.bakiye = bakiye;
        this.parola = parola;
        this.kullanıcıadı = kullanıcıadı;
    }
    
    
    public void parayatır(double miktar){
        
        this.bakiye = bakiye + miktar;
        
        System.out.println("Güncel bakiyeniz: " + this.bakiye);
    
    }
    
    public void paraçekme(double miktar){
 
        if(miktar > bakiye){
            System.out.println("Yeterli bakiye yok, " + " güncel bakiyeniz: " + this.bakiye);
        }
        else{
            this.bakiye = bakiye - miktar;
        
        System.out.println("güncel bakiyeniz: " + this.bakiye);
        }
        
    }

    public String getKullanıcıadı() {
        return kullanıcıadı;
    }

    public void setKullanıcıadı(String kullanıcıadı) {
        this.kullanıcıadı = kullanıcıadı;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    
}
