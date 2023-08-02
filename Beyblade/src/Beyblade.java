
public class Beyblade {
    
    private String Beybladeci;
    private int dönüşHızı;
    private int saldırıGücü;

    public Beyblade(String Beybladeci, int dönüşHızı, int saldırıGücü) {
        this.Beybladeci = Beybladeci;
        this.dönüşHızı = dönüşHızı;
        this.saldırıGücü = saldırıGücü;
    }
    public void saldır(){
        System.out.println(getBeybladeci() + " " + saldırıGücü +" ve "+ dönüşHızı + " ile saldırıyor");
    }
    
    public void kutsalcanavarıortayaçıkar(){
        System.out.println("Bu beybladenin kutsal canavarı bulunmuyor");
    }
    
    public void bilgilerigöster(){
        System.out.println("-------------------");
        System.out.println("Beybladeci ismi " + Beybladeci);
        System.out.println("Saldırı gücü " + saldırıGücü);
        System.out.println("Dönüş hızı " + dönüşHızı);
    }

    public String getBeybladeci() {
        return Beybladeci;
    }

    public void setBeybladeci(String Beybladeci) {
        this.Beybladeci = Beybladeci;
    }

    public int getDönüşHızı() {
        return dönüşHızı;
    }

    public void setDönüşHızı(int dönüşHızı) {
        this.dönüşHızı = dönüşHızı;
    }

    public int getSaldırıGücü() {
        return saldırıGücü;
    }

    public void setSaldırıGücü(int saldırıGücü) {
        this.saldırıGücü = saldırıGücü;
    }
    
    
}
