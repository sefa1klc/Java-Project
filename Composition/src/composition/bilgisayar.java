
package composition;


public class bilgisayar {
    private monitör monitör;
    private kasa kasa;
    private anakart anakart;

    public bilgisayar(monitör monitör, kasa kasa, anakart anakart) {
        this.monitör = monitör;
        this.kasa = kasa;
        this.anakart = anakart;
    }

    public monitör getMonitör() {
        return monitör;
    }

    public void setMonitör(monitör monitör) {
        this.monitör = monitör;
    }

    public kasa getKasa() {
        return kasa;
    }

    public void setKasa(kasa kasa) {
        this.kasa = kasa;
    }

    public anakart getAnakart() {
        return anakart;
    }

    public void setAnakart(anakart anakart) {
        this.anakart = anakart;
    }
    
    
    
}
