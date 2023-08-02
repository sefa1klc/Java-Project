
package ozelliklerinkapsamı;


public class Main {
    public static void main(String[] args) {
        //KapsamSınıfı kapsamsınıfı = new KapsamSınıfı();
        //KapsamSınıfı.onileCarp();
        
        KapsamSınıfı2.DahiliSınıf kapsam = new KapsamSınıfı2().new DahiliSınıf();
        
        kapsam.onileCarp();
    }
    
}
