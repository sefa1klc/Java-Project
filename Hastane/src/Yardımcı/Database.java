
package Yardımcı;
import java.sql.*;

public class Database {
    public static final String kullanıcı_adı = "root";
    public static final String parola = "";
    
    public static final String db_ismi = "hastaneotomasyon";
    
    public static final String host = "localhost";
    
    public static final int port = 3306;
    
    Connection con = null;

    public Database() {
    }
    
    public Connection condb(){
        String url = "jdbc:mysql://" + Database.host + ":" + Database.port + "/" + Database.db_ismi;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
        } catch (ClassNotFoundException e) {
            System.out.println("Driver bulunamadı");
        }
        
        
        try {
            con = DriverManager.getConnection(url, Database.kullanıcı_adı, Database.parola);
            
            
            
        } catch (SQLException ex) {
            System.out.println("Bağlantı başarısız..");
        }
        
        return con;
    }
    
    public static void main(String[] args) {
        Database db = new Database();
        
        
    }
}    
