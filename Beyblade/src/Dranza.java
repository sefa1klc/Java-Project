
public class Dranza extends Beyblade{
    
    private String kutsalcanavar;

    public Dranza(String Beybladeci, int dönüşHızı, int saldırıGücü, String kutsalcanavar) {
        super(Beybladeci, dönüşHızı, saldırıGücü);
        this.kutsalcanavar = kutsalcanavar;
        
        
    }

    @Override
    public void bilgilerigöster() {
        super.bilgilerigöster(); 
        
        System.out.println("Kutsal canavar adı: " + kutsalcanavar);
    }

    @Override
    public void kutsalcanavarıortayaçıkar() {
        System.out.println(getBeybladeci()+ " " + kutsalcanavar + " " +"ortaya çıkarıyor...");
        System.out.println(getBeybladeci() + "'ın gizli saldırısı : Alev kılıcı");
    }
}
