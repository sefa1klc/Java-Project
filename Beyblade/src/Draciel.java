

public class Draciel extends Beyblade {
    private String kutsalcanavar;

    public Draciel(String Beybladeci, int dönüşHızı, int saldırıGücü, String kutsalcanavar) {
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
        System.out.println(getBeybladeci() + "'in gizli savunması : Kale savunması");
    }
    
    
}
