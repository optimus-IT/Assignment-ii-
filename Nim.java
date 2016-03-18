/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2_10533695;

/**
 *
 * @author Emmanuel Owusu
 * 10533695
 */
import java.util.Scanner;

public class Nim {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        String Player1;
        String Player2;
        
        int A = 3;
        int B = 4;
        int C = 5;
        
       System.out.println("Player 1, enter your name: ");
       Player1 = input.next();
       
       System.out.println("Player 2, enter your name: ");
       Player2 = input.next();
       
       System.out.println("Welcome " + Player1 + "and" + Player2 + "to the Nim Game");
       System.out.println("Your Piles are \n" + "A: "+ A + "\t B: " + B + "\t C: " + C );
       
        
    }
    
}
