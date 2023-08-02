/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package denemee;



/**
 *
 * @author kilic
 */
public class Denemee {
    
    private static final int ROWS = 9;
    private static final int COLS = 9;
     private static final char EMPTY_SLOT = '-';

    
    
    private static char[][] board;
    
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

     public static void main(String[] args) {
         
         board = new char[ROWS][COLS];
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                board[i][j] = EMPTY_SLOT;
            }
        }
        
        
         Denemee dene = new Denemee();
         dene.printBoard();
        
    }
    
}