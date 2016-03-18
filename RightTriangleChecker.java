/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment2_10533695;

/**
 *
 * @author Emmanuel Owusu
 */
import java.util.Scanner;
public class RightTriangleChecker {
    public static void main(String[] args){
        //variable declaration and scanner object creation
        int side1, side2, side3;
        Scanner input = new Scanner (System.in);
        
        //prompt statement
        System.out.println("Enter three integers: ");
        System.out.println("Side 1: ");
        side1=input.nextInt();
        
        System.out.println("Side 2: ");
        side2 = input.nextInt();
        
        while(side2<side1){
            System.out.println(side2+" is smaller than "+side1+". Try again.");
            side2 = input.nextInt();
        }
        side3=input.nextInt();
        
        while(side3<side2 && side3<side1){
            System.out.println(side3+" is smaller than "+side2+" Try again.");
            side3 = input.nextInt();
        }
        
        System.out.println("Your three sides are "+side1+" "+side2+" "+side3);
        
        //test to see if the sides make a triange
        if (side3-side2==2 && side2-side1==2){
            System.out.println("These sides do make a right triange. Yippy-skippy!");
        }
        else{
            System.out.println("NO! These sides do not make a right triangle!");
        }
    }
    
}
