/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2_10533695;

/**
 *
 * @author PennyBlaq
 */
import java.util.Random;
public class ShorterDoubleDice {
    
    public static void main (String[] args){
        
       Random y = new Random();
       int a,b,c;
//       int a = 1 + y.nextInt(6);
//       int b = 1 + y.nextInt(6);
//       int c = a+b;
       System.out.println("HERE COMES THE DICE!");
      
       do{
            a = 1 + y.nextInt(6);
           b = 1 + y.nextInt(6);
           c = a+b;
       System.out.println("Roll #1: " + a);
       System.out.println("Roll #2: " + b);
       System.out.println("The Total is  " + c + "!");
       }
       while (a != b);
          
       
       System.out.println("Roll #1: " + a);
       System.out.println("Roll #2: " + b);
       System.out.println("The Total is  " + c + "!");
       
       }
    }       

