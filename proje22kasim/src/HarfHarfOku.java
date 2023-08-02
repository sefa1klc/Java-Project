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
public class HarfHarfOku {
    public static void main(String args[]){
        StringBuffer icerik = new StringBuffer("");
        try{
        File f=new File("C:/2022-2023/kasim/nyp/proje22kasim/src/newfile.txt");
            FileInputStream fi=new FileInputStream(f);
            int ascii;
            char c;
            while ((ascii=fi.read())!=-1){
                c=(char)ascii;
                icerik.append(c);
                
                    }
                }
        catch(FileNotFoundException f)
          {System.out.println("dosya yok");}
        catch(IOException ioex)
          {System.out.println("başka bir hata oldu"); }
       catch(Exception f)
          {System.out.println("dosya yok");} 
           
        System.out.println("icerik :");
           System.out.println(icerik);
                      }
    
    }

