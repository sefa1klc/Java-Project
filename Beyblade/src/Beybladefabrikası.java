
public class Beybladefabrikası {
    public Beyblade beybladeüret(String beyblade_türü){
        
        switch (beyblade_türü) {
            case "Dragon":
                return new Dragon("şevolattem", 800, 300, "Mavi Ejderha", "Kutsal Canavarla Konuşma");
            case "Dranza":
                return new Dranza("Kai", 600  , 400, "Kırmızı Anka Kuşu");
            case "Draciel":
                return new Dranza("Max", 400  , 500, "Kırmızı Anka Kuşu");
            case "Drayga":
                return new Dranza("Rei", 700  , 1000, "Kara Kaplumbağa");
            default:
                return null;
        }
        
        
    }
    
}
