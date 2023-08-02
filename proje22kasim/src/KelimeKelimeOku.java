/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pelin
 */
import java.io.*; 
import java.util.StringTokenizer;
public class KelimeKelimeOku { 
    public static void main(String args[]){
        try{
           FileInputStream fi=new FileInputStream("C:/2022-2023/kasim/nyp/proje22kasim/src/newfile.txt");
            BufferedReader buf=new BufferedReader(new InputStreamReader(fi));
            String satir;
            StringTokenizer st;
            
            while ((satir=buf.readLine())!=null){
                st=new StringTokenizer(satir);
                   while (st.hasMoreTokens())
                   System.out.println(st.nextToken()); 
            }
                
            }
        catch(FileNotFoundException f)
        {System.out.println("dosya yok");}
          catch(IOException ioex)
          {System.out.println("başka bir hata oldu"); }
        }
    }
