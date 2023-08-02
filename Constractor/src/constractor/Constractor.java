

public class Account {
    
    private String hesapno;
    private double bakiye;
    private String isim;
    private String email;
    private String telefonno;
    
    public Account(){
        /*this.hesapno = c;
        this.bakiye = 0.00;
        this.email = "Bilgi yok";
        this.telefonno = "Bilgi yok";
        this.isim = "Bilgi yok";
        Bunun daha kısa yolunu aşağıda yazıcam*/
        
        this("Bilgi yok", 0.0, "Bilgi yok", "Bilgi yok", "Bilgi yok");
        //bu şekilde fonksiyon tanımlar gibi parametreli fonksiyodan tanımladıpımız değerli this yardımıyla çekebilriz.
                
                
    }
    public Account(String hesapno, double bakiye, String isim, String email, String telefonno){
        /*parantez içindeki değişkenler ana değişkenlere
        yani private olanlara atanacak olan değişkenlerdir*/
        this.bakiye = bakiye;
        this.hesapno = hesapno;
        this.email = email;
        this.isim = isim;
        this.telefonno = telefonno;
        
    }
    
    public Account(String isim, String email, String telefonno){
        
        this("Bilgi yok", 0.0, isim, email, telefonno);
    }
    
    
    public void bilgilerigoster(){
        
        System.out.println("hesap no: " + this.hesapno);
        System.out.println("isim: " + this.isim);
        System.out.println("e mail: " + this.email);
        System.out.println("telefon numarası: " + this.telefonno);
        System.out.println("bakiye: " + this.bakiye);
        
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

    public String getHesapno() {
        return hesapno;
    }

    public void setHesapno(String hesapno) {
        this.hesapno = hesapno;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefonno() {
        return telefonno;
    }

    public void setTelefonno(String telefonno) {
        this.telefonno = telefonno;
    }
    
    
    
    
}
