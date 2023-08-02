
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Çalışanİşlemleri implements çalışanfonksiyon{
    
    private Connection con = null;
    
    private Statement statement = null;
    
    private PreparedStatement preparedStatement = null;
        
   
    @Override
    public boolean giriş_yap(String kullanıcı_adı, String parola){
        
        String sorgu = "Select * from hasta_bilgi where hasta_tc = ? and hasta_parola = ?";
        
        try {   
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, kullanıcı_adı);
            preparedStatement.setString(2, parola);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            return rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(Çalışanİşlemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    
    
    public Çalışanİşlemleri(){
        
        
        String url = "jdbc:mysql://" + Database.host + ":" + Database.port + "/" + Database.db_ismi;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
        } catch (ClassNotFoundException e) {
            System.out.println("Driver bulunamadı");
        }
        
        
        try {
            con = DriverManager.getConnection(url, Database.kullanıcı_adı, Database.parola);
            System.out.println("Bağlantı başarılı...");
            
            
        } catch (SQLException ex) {
            System.out.println("Bağlantı başarısız..");
        }
        
        
    
    }
    
    public ArrayList<Çalışanlar> calisanlari_getir(){
        
        ArrayList<Çalışanlar> cikti = new  ArrayList<Çalışanlar>();
        
        try {
            statement = con.createStatement();
            String sorgu = "Select * from calisanlar";
            
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                int id = rs.getInt("id");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String departman = rs.getString("departman");
                String maas = rs.getString("maas");
                
                cikti.add(new Çalışanlar(id, ad, soyad, departman, maas));
                
            }
            
            return cikti;
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Çalışanİşlemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
    public static void main(String[] args) {
        
        Çalışanİşlemleri işlemler = new Çalışanİşlemleri();
        
        Doktorişlemleri dr_işlemler = new Doktorişlemleri();
        
    }
}
