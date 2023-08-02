import java.io.FileOutputStream;
import java.io.PrintStream;

public class CatchThrow {
private static void a() throws Exception{
    String  intNumber = "5A";  
    Integer.parseInt(intNumber);
    FileOutputStream f=new FileOutputStream("C:/2021-2022/nyp/proje23kasim/proje23kasim/src/yaz1.txt",true) ;
        
}
private static void b()  throws Exception  {
    
           a();
    }
private static void c() throws Exception {
           b();
    }

public static void main(String[] args) {
    try{ 
    b();}
    catch(Exception e){
     System.out.println("Hata olustu"+e.getMessage());
    }
}}

