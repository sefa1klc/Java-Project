/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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

