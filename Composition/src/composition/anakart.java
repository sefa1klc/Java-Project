
package composition;


public class anakart {
    
    private String model;
    private String üretici;
    private String yuva_sayısı;
    private String İşletim_sistemi;

    public anakart(String model, String üretici, String yuva_sayısı, String İşletim_sistemi) {
        this.model = model;
        this.üretici = üretici;
        this.yuva_sayısı = yuva_sayısı;
        this.İşletim_sistemi = İşletim_sistemi;
    }
    
    public void işletim_sistemi_yükle(String işletim_sistemi){
       this.İşletim_sistemi = işletim_sistemi;
       
        System.out.println("İşletim sistemi yüklendi: "+ işletim_sistemi);
       
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

    public String getYuva_sayısı() {
        return yuva_sayısı;
    }

    public void setYuva_sayısı(String yuva_sayısı) {
        this.yuva_sayısı = yuva_sayısı;
    }

    public String getİşletim_sistemi() {
        return İşletim_sistemi;
    }

    public void setİşletim_sistemi(String İşletim_sistemi) {
        this.İşletim_sistemi = İşletim_sistemi;
    }
    
    
    
    
    
    
}
