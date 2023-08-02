
package çalışan;


public class Yönetici extends Çalışan{
    
    private int sorumlu_kişi_sayısı;

    public Yönetici(String isim, String soyisim, int ID, int sorumlu_kişi_sayısı) {
        super(isim, soyisim, ID);
        this.sorumlu_kişi_sayısı = sorumlu_kişi_sayısı;
    }

    @Override
    public void bilgilarigöster(String isim, String soyisim, int ID) {
        super.bilgilarigöster(isim, soyisim, ID);
        System.out.println("Sorumlu kişi sayısı: " + sorumlu_kişi_sayısı);
    }
    
    public void zamYap(int zamMiktari){
        System.out.println(getIsim()+"" + "Maaşaınıza" +" " + zamMiktari + "tl zam yapıyor..");
    }
    
    
}
