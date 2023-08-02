
package composition;


public class monitör {
    
    private String model;
    private String üretici;
    private String boyut;
    private resolution resolution;
    

    public monitör(String model, String üretici, String boyut, resolution resolution) {
        this.model = model;
        this.üretici = üretici;
        this.boyut = boyut;
        this.resolution = resolution;
    }
    
    public void monitoru_kapat(){
        System.out.println("Monitör kapatılıyor..");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getÜretici() {
        return üretici;
    }

    public void setÜretici(String üretici) {
        this.üretici = üretici;
    }

    public String getBoyut() {
        return boyut;
    }

    public void setBoyut(String boyut) {
        this.boyut = boyut;
    }

    public resolution getResolution() {
        return resolution;
    }

    public void setResolution(resolution resolution) {
        this.resolution = resolution;
    }
    
    
    
}
