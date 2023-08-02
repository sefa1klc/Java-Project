
public class Calisan {
    private String isim;
    private int maas;
    private String departman;

    

    public Calisan(String isim, int maas, String departman) {
        this.isim = isim;
        this.maas = maas;
        this.departman = departman;
    }
    public void calis(){
        System.out.println("Calis programi calisiyor");
    }
    public void bilgileriGoster(){
        System.out.println("İsim:"+isim);
        System.out.println("Maaş:"+maas);
        System.out.println("Departman:"+departman);
    }
    public void zam_yap(int zam_miktari){
        System.out.println("Calisana "+zam_miktari+" TL zam yapildi");
        maas +=zam_miktari;
    }
    public void departman_degistir(String yeni_departman){
        System.out.println("Departman değiştiriliyor");
        this.departman=yeni_departman;
        System.out.println(" Yeni Departman:"+this.departman);
    }
}
