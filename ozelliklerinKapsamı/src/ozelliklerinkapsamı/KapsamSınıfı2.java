
package ozelliklerinkapsamı;

public class KapsamSınıfı2 {
    private int privateDegisken = 30;

    public KapsamSınıfı2() {
    }
    
    public class DahiliSınıf{
        
        public void onileCarp(){
                
            for (int i = 1; i < 6; i++) {
                System.out.println(i+ "*" + privateDegisken + " = " + (i* privateDegisken ) );
            }
        }
    }
}
