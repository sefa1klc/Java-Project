
package sqlserver;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class baglanti {
    
    private String kullanıcı_adı = "root";
    private String parola = "";
    
    private String db_ismi = "hastaneotomasyon";
    
    private String host = "localhost";
    
    private int port = 3306;
    private Connection con = null;
    
    private Statement statement = null;
    
    public void hasta_ekle(){
        
        try {
            statement = con.createStatement();
            
           
            
        } catch (SQLException ex) {
            Logger.getLogger(baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void hasta_bilgileri(){
        String sorgu = "Select * From hasta_bilgi";
        
        
        
        try {
            statement = con.createStatement();
            
            ResultSet rs = statement.executeQuery(sorgu);
            
            
            
            while(rs.next()){
                
                String ad = rs.getString("hasta_ad");
                String soyad = rs.getString("hasta_soyad");
                String adres = rs.getString("hasta_adres");

                
                System.out.println("Hasta Adı: " + ad + " " + " Hasta Soyad: " + soyad + " " + " Hasta Adres: " + adres );
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public baglanti(){
    
        String url = "jdbc:mysql://" + host + ":" + port + "/" + db_ismi;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
        } catch (ClassNotFoundException e) {
            System.out.println("Driver bulunamadı");
        }
        
        
        try {
            con = DriverManager.getConnection(url, kullanıcı_adı, parola);
            System.out.println("Bağlantı başarılı...");
            
            
        } catch (SQLException ex) {
            System.out.println("Bağlantı başarısız..");
        }
    }
    
    public static void main(String[] args) {
        
        baglanti baglanti = new baglanti();
        
        baglanti.hasta_bilgileri();
    }
}
