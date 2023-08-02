/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package game;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;



public class Game {
    private static int row = 9;
    private static final int ROWS = 9;
    private static final int COLS = 9;
    private static final int win_num = 4;
    private static final char empty_slot = '-';
    private static final char player1_symbol ='X';
    private static final char player2_symbol ='Y';
    private static int player1_stamp =40;
    private static int player2_stamp =40;
    
    
    private char[][] board;
    private int currentPlayer;
    private boolean gameOver;
    private boolean stampC;
    private String[] players = new String[2];
    
    int sayac0 = 0;
    int sayac1 = 0;
    int sayac2 = 0;
    int sayac3 = 0;
    int sayac4 = 0;
    int sayac5 = 0;
    int sayac6 = 0;
    int sayac7 = 0;
    int sayac8 = 0;
    

    public Game() throws IOException {
        //Temel oyun tahtasının ana hatlarını oluşturdum.
        board = new char[ROWS][COLS];
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                board[i][j] = empty_slot;
            }
        }
        currentPlayer = 0;
        gameOver = false;
        
    }
    
     private void initializePlayers() throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter player 1 's name: ");
        players[0] = input.nextLine();
        System.out.print("Enter player 2 's name: ");
        players[1] = input.nextLine();
        
        
        File names = new File("Names.txt");
        FileWriter fwriter = new FileWriter(names,false);
        BufferedWriter bwriter = new BufferedWriter(fwriter);
        bwriter.write(players[0] + " " + players[1]);
        bwriter.close();

    }
     
     private void choosingColor() {
      String[] renkler = {"Red", "Blue"};    
      // Random sınıfını kullanarak rastgele bir sayı üretimi.
      Random rastgele = new Random();
      int indeks = rastgele.nextInt(2);
      
      // Rastgele seçilen rengi a ve diğer rengi b'ye atama
      String renk1 = renkler[indeks];
      String renk2 = renkler[1 - indeks];
      System.out.println(players[0]+"'s color " +" :" + renk1);
      System.out.println(players[1]+" 's color " +" :"+ renk2);
      
      //Renkler kullanıcı sembollerine atandı.
      System.out.println(renk1 +" = " +"X");
      System.out.println(renk2 +" = " +"Y");
    }
    
     public void start() throws IOException {
         initializePlayers();
         choosingColor();

        Scanner input = new Scanner(System.in);
        while (!gameOver) {
            //Hangi satıra oynandığını tutmak için oluşturulan bir değişken.
            int degisken = row;
            
            printBoard();
            WriteMatrix(board, "Tahta.txt");
            
            
            System.out.println("Player " + players[currentPlayer] + "'s turn.");
            System.out.print("Enter column number (1-9): ");
            int col = input.nextInt() - 1;
            whichSymbol(col);
            

            switch (col) {
                case 0:
                    
                    sayac0++;
                    
                    degisken = row - sayac0 ;
                    break;
                
                case 1:
                    
                    sayac1++;
                    
                    degisken = row - sayac1 ;
                    break;
                    
                case 2:
                    
                    sayac2++;
                    
                    degisken = row - sayac2 ;
                    break;
                    
                case 3:
                    
                    sayac3++;
                    
                    degisken = row - sayac3 ;
                    break;
                
                case 4:
                    
                    sayac4++;
                    
                    degisken = row - sayac4 ;
                    break;
                    
                case 5:
                    
                    sayac5++;
                    
                    degisken = row - sayac5 ;
                    break;
                    
                case 6:
                    
                    sayac6++;
                    
                    degisken = row - sayac6 ;
                    break;
                
                case 7:
                    
                    sayac7++;
                    
                    degisken = row - sayac7 ;
                    break;
                    
                case 8:
                    
                    sayac8++;
                    
                    degisken = row - sayac8 ;
                    break;

            }
            
         
            try {
            FileWriter dosyaYazici = new FileWriter("Hamle.txt", true);
            BufferedWriter yazici = new BufferedWriter(dosyaYazici);
            yazici.write((degisken) + " " + (col + 1) + "\n"); // satır ve sütunu dosyaya yaz
            yazici.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
         
            
            if (checkWin()) {
                gameOver = true;
                System.out.println("Player " + players[currentPlayer] + " wins!");
            } else if (checkDrow()) {
                gameOver = true;
                System.out.println("Tie game!");
            } else {
                switchPlayer();
                
            }
        }
        input.close();
        
    }
     
     public void resume() throws IOException{
         ReadMatrix("Tahta.txt");
         int satirNo = 0;
         try {
            BufferedReader reader = new BufferedReader(new FileReader("Hamle.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] items = line.split(" ");
                int rowsItem = Integer.parseInt(items[0]);
                int colsItem = Integer.parseInt(items[1])-1;// normalde 1-9 arası hamle aldığımız için okurken indexleme yapabilmek için bir azalttık
                satirNo++;
                
                
                    if (satirNo %2 != 0) {
                        board[rowsItem][colsItem] = 'X';
                    }   
                    else{
                        board[rowsItem][colsItem] = 'Y';
                        
                    }
                    
            }
            reader.close();
            
            reader = new BufferedReader(new FileReader("Names.txt"));
            String line2;
            while ((line2 = reader.readLine()) != null) {
                String[] items = line2.split(" ");
                players[0] = items[0];
                players[1] = items[1];}

            
            Scanner input = new Scanner(System.in);
          while (!gameOver){
              
            
            WriteMatrix(board, "Tahta.txt");
            
            System.out.println("Player " + players[0] + "'s turn.");
            System.out.print("Enter column number (0-8): ");
            int num = input.nextInt() - 1;
            whichSymbol(num);
          
            if (checkWin()) {
                gameOver = true;
                System.out.println("Player " + players[currentPlayer] + " wins!");
                
            } else if (checkDrow() || stampCounter()) {
                gameOver = true;
                System.out.println("Game Drow!");            
            } else {
                stampCounter();
                switchPlayer();
            }
            
          }    

        }
         catch (FileNotFoundException e) {
            System.out.println("Kayıtlı Oyun Bulunamadı!");
        }         
         
         

     }
     
    //pul sayacı
    public boolean stampCounter(){
        if (player1_symbol == 'X') {
            player1_stamp--;
            
        }else{
            player2_stamp--;
        }
        if (player1_stamp == 0 && player2_stamp == 0) {
            return true;
        }
       return false;
    }
     
     
    private void printBoard() {
        System.out.println();
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    
    private void switchPlayer() {
    currentPlayer = (currentPlayer == 0) ? 1 : 0;
    }
    
    
    

    public static void WriteMatrix(char[][] matrix, String fileName) {
        try {
            FileWriter fWriter = new FileWriter(fileName);
            for (char[] row : matrix) {
                fWriter.write(row);
                fWriter.write("\n");
            }
            fWriter.close();
        } catch (IOException e) {
            System.out.println("Dosya yazma işlemi yapılamadı! ");
        }
    }
    
    
    public static void ReadMatrix(String dosyaAdi) {
        try {
            FileReader dosyaOkuyucu = new FileReader("Tahta.txt");
            BufferedReader tamponOkuyucu = new BufferedReader(dosyaOkuyucu);

            int satirSayisi = 9;
            int sutunSayisi = 9;
            char[][] matris = new char[satirSayisi][sutunSayisi];

            int satir = 0;
            int sutun = 0;
            int okunan;
            while ((okunan = tamponOkuyucu.read()) != -1) {
                char karakter = (char) okunan;
                if (karakter == '\n') { // Yeni satıra geçtiğimizde
                    satir++;
                    sutun = 0;
                } else {
                    matris[satir][sutun] = karakter;
                    sutun++;
                }
            }

            tamponOkuyucu.close();

            // Matrisi ekrana yazdır
            for (int i = 0; i < satirSayisi; i++) {
                for (int j = 0; j < sutunSayisi; j++) {
                    System.out.print(matris[i][j] + " ");
                }
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println("Dosya okuma hatası: " + e);
        }

    }

    

    
 
    // Kolona hangi oyununcunun sembolü yazılacak onu seçer ve yazar.
     private void whichSymbol(int col) {
        if (col < 0 || col >= COLS) {
            System.out.println("Invalid column number. Try again.");
            return;
        }
        int row = ROWS - 1;
        while (row >= 0 && board[row][col] != empty_slot) {
            row--;
        }
        if (row < 0) {
            System.out.println("Column is full. Try again.");
            return;
        }
        if (currentPlayer == 0) {
            board[row][col] = player1_symbol;
        } else {
            board[row][col] = player2_symbol;
        }
    }
    
    //Beraberlik kontrolü
    private boolean checkDrow() {
    for (int col = 0; col < COLS; col++) {
        if (board[0][col] == empty_slot) {
            // En az bir tane boş satır varsa oyun berabere değildir
            return false;
        }
    }
    // eğer tüm satırlar doluysa oyun beraberedir.
    return true;
    }

     
    private boolean checkDiagonals() {
        // sol üstten sağ alta çapraz kontrol eder.
        for (int i = 0; i <= ROWS - win_num; i++) {
            for (int j = 0; j <= COLS - win_num; j++) {
                char win_symbol = board[i][j];
                if (win_symbol != empty_slot && win_symbol == board[i+1][j+1] && win_symbol == board[i+2][j+2] && win_symbol == board[i+3][j+3]) {
                    return true;
                }
            }
        }
        // sol alttan sağ üste köşegeni kontrol eder
        for (int i = win_num - 1; i < ROWS; i++) {
            for (int j = 0; j <= COLS - win_num; j++) {
                char win_symbol = board[i][j];
                if (win_symbol != empty_slot && win_symbol == board[i-1][j+1] && win_symbol == board[i-2][j+2] && win_symbol == board[i-3][j+3]) {
                    return true;
                }
            }
        }
        return false;
    }


    //satırları kontrol eder.
    private boolean checkRows() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j <= COLS - win_num; j++) {
                char win_symbol = board[i][j];
                if (win_symbol != empty_slot && win_symbol == board[i][j+1] && win_symbol == board[i][j+2] && win_symbol == board[i][j+3]) {
                    return true;
                }
            }
        }
        return false;
    }
    //sütunları kontrol eder.
    private boolean checkCols() {
        for (int i = 0; i <= ROWS - win_num; i++) {
            for (int j = 0; j < COLS; j++) {
                char win_symbol = board[i][j];
                if (win_symbol != empty_slot && win_symbol == board[i+1][j] && win_symbol == board[i+2][j] && win_symbol == board[i+3][j]) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean checkWin() {
        return checkRows() || checkCols() || checkDiagonals();
    }
        
}   
     
  
  
  
  
  
  
  
  
  
  
  
  

package game;

import java.io.*;
import java.util.Scanner;


/**
 *
 * @author kilic
 */


public class main {
    
    public static void main(String[] args) throws IOException{
        Game game = new Game();
  
        Scanner scan = new Scanner(System.in);
        System.out.println("*******MENU*******\n"
                + "    1-NEW GAME\n"
                + "    2-RESUME GAME\n"
                + "    3-EXIT");
        int chose = scan.nextInt();
        switch (chose ) {
            case 1:
                game.start();
                break;
            case 2:
                game.resume();
                break;
            default:
                System.out.println("GOODBYE");
                break;
        }
                
    }
    
}

