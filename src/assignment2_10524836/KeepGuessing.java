/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2_10524836;

/**
 *
 * @author opos
 */
import java.util.Random;
import java.util.Scanner;


public class KeepGuessing {
    public  static void main(String[]args){
        Random x = new Random();
        Scanner input = new Scanner(System.in);
        
        int secretNum = 1 + x.nextInt(10);
        int choice;
        
        System.out.println("This is a number guessing game!");
        System.out.print("I am thinking of a number form 1 to 10\n Your guess: ");
        
        choice = input.nextInt();
        while (choice != secretNum)
        {
            System.out.print("That's incorrect. guess again: ");
            choice = input.nextInt();
        }
        
       
        {
            System.out.println("That's right! My secret number was " + secretNum + "!");
        }
        
        
        
    }
}