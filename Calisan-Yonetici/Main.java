
public class Main {
    public static void main(String args[]) {
        Yonetici yonetici=new Yonetici(5,"Kaya", 10000, "IT");
        Calisan calisan=new Calisan("Mehmet", 5000, "Finance");
        yonetici.zam_yap(200);
        yonetici.bilgileriGoster();
        calisan.zam_yap(200);
        calisan.bilgileriGoster();
    }
}
