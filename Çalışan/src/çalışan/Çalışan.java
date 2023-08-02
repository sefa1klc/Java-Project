
package çalışan;


public class Çalışan {
    
    private String isim;
    private String soyisim;
    private int ID;

    public Çalışan(String isim, String soyisim, int ID) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.ID = ID;
    }
    public void bilgilarigöster(String isim, String soyisim, int ID){
        
        System.out.println("Çalışan Bilgileri...");
        System.out.println("isim: " + this.isim);
        System.out.println("Soyisim: " + this.soyisim);
        System.out.println("ID: " + this.ID);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    
    
    

    
}
