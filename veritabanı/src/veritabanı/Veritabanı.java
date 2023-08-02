
package veritabanı;
import java.sql.Connection;




public class Veritabanı {
    
    private String kullanıcı_adı = "root";
    private String parola = " ";
    
    private String db_ismi = "hastaneotomasyon";
    
    private String host = "localhost";
    
    private int port = 3306;
    private Connection con = null;
    
    public Veritabanı(){
    
        String url = "jdbc:mysql://" + host + ":" + port + "/" + db_ismi;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
        } catch (ClassNotFoundException e) {
            System.out.println("Drive bulunamadı");
        }
        
        
        con = DriverManager.getConnection(url,kullanıcı_adı,parola);
    }

    
    public static void main(String[] args) {
        
    }

   
        
    
}
