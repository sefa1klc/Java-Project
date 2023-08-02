
public class Dragon extends Beyblade{
    private String kutsalcanavar;
    private String gizliyetenek;

    public Dragon(String Beybladeci, int dönüşHızı, int saldırıGücü, String kutsalcanavar, String gizliyetenek) {
        super(Beybladeci, dönüşHızı, saldırıGücü);
        this.gizliyetenek = gizliyetenek;
        this.kutsalcanavar = kutsalcanavar;
        
    }

    @Override
    public void bilgilerigöster() {
        super.bilgilerigöster(); 
        
        System.out.println("Kutsal canavar adı: " + kutsalcanavar); 
        System.out.println("Gizli yetenek: " + gizliyetenek); 
    }

    @Override
    public void kutsalcanavarıortayaçıkar() {
        System.out.println(getBeybladeci()+ " " + kutsalcanavar + " " + "ortaya çıkarıyor...");
        System.out.println(getBeybladeci() + "'ın gizli saldırısı : Hayalet Kasırgası");
    }
    
}
