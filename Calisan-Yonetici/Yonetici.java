
public class Yonetici extends Calisan {
     private int sorumlu_kisi;
     public Yonetici(int sorumlu_kisi, String isim, int maas, String departman) {
        super(isim, maas, departman);
        this.sorumlu_kisi = sorumlu_kisi;
    }
     public void zam_yap(int zam_miktari){
         super.zam_yap(2*zam_miktari);
         
    }
}
