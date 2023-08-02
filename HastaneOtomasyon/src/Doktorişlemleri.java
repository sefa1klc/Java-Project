
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Doktorişlemleri implements çalışanfonksiyon{
    
    private Connection conn = null;
    
    
    private PreparedStatement preparedStatement = null;

    @Override
    public boolean giriş_yap(String kullanıcı_adı, String parola) {
        String sorgu = "Select * from doktor_bilgi where doktor_tc = ? and doktor_parola = ?";
        
        try {   
            preparedStatement = conn.prepareStatement(sorgu);
            
            preparedStatement.setString(1, kullanıcı_adı);
            preparedStatement.setString(2, parola);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            return rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(Çalışanİşlemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    
    
     public Doktorişlemleri(){
        
        
        String url = "jdbc:mysql://" + Database.host + ":" + Database.port + "/" + Database.db_ismi;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
        } catch (ClassNotFoundException e) {
            System.out.println("Driver bulunamadı");
        }
        
        
        try {
            conn = DriverManager.getConnection(url, Database.kullanıcı_adı, Database.parola);
            System.out.println("Bağlantı başarılı...");
            
            
        } catch (SQLException ex) {
            System.out.println("Bağlantı başarısız..");
        }
        
        
    
    }
    
}
