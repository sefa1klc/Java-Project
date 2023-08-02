
package çalışan;


public class Yazılımcı extends Çalışan {
    
    private String diller;
    
    public Yazılımcı(String isim, String soyisim, int ID, String diller) {
        super(isim, soyisim, ID);
        this.diller = diller;
    }

    @Override
    public void bilgilarigöster(String isim, String soyisim, int ID) {
        super.bilgilarigöster(isim, soyisim, ID); 
        System.out.println("Diller: " + diller);
    }
     
    public void formatAt(String işletim_sistemi){
         System.out.println(getIsim() + " " + "İşletim sistemi: " + işletim_sistemi);
     }
  
}
