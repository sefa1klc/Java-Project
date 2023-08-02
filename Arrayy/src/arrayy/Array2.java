
package arrayy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Array2 {
    /*public static int[] arr_doldur(int deger){
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[deger];
        
        System.out.print("Lütfen değerleri giriniz: ");
        for(int i = 0; i < deger ; i++){
            
            arr[i] = scan.nextInt();
            
        }
        return arr;
    }
    
    public static void arr_bastır(int [] Array){
        
        for (int i = 0; i < Array.length; i++) {
            System.out.println(i + ".İndex: " + Array[i] );
            
        }
    }
    
    public static void arr_sort(int [] Array){
        
        Arrays.sort(Array);
        arr_bastır(Array);
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Array' in uzunluğunu giriniz: ");
        int sayi = scan.nextInt();
        
        int[] arr = arr_doldur(sayi);
        
        
        System.out.println("------------------------");
        
        arr_sort(arr);
        
        
       
        
        
    }*/
    public static void main(String args[]){
        
        ArrayList<String> arraylist = new ArrayList<String>();
        arraylist.add("Sefa");
        System.out.println(arraylist.get(0));
        
        Scanner scan = new Scanner(System.in);
        System.out.print(" Array \n"
                + "Satır: \n"
                + "Sütun: \n");
        
        int satır =scan.nextInt();
        int sütun =scan.nextInt();
        
        int[][] arr = new int[satır][sütun];
        
        System.out.println("Lütfen değerleri giriniz:");
        
        
        
        for(int i = 0; i<satır ; i++){
            for (int j = 0; j < sütun; j++) {
                
                arr[i][j] = scan.nextInt();
                
                
            }
            
            
        }
        System.out.println("********************");
        for(int i = 0; i<satır ; i++){
            for (int j = 0; j < sütun; j++) {
                
                
                System.out.print(arr[i][j] + " ");
                
            }
            
            System.out.println(" ");
        }
        
    }
    
}
