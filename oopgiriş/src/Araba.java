
public class Araba {
    
    private String renk;
    private int kapılar;
    private int tekelerlek;
    private String motor;
    private String model;

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getKapılar() {
        return kapılar;
    }

    public void setKapılar(int kapılar) {
        this.kapılar = kapılar;
    }

   

    public void setTekelerlek(int tekelerlek) {
       
        if(tekelerlek>4){
            System.out.println("tekerlek sayısı bu olamaz");
        }
        else{
        this.tekelerlek = tekelerlek;
        }
    }
     public int getTekelerlek() {
        return tekelerlek;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
   
    
    
}
