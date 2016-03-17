
package assignment2_10524836;

import java.util.Random;
import java.util.Scanner;

public class NUmberGuessingGame {
     public  static void main(String[]args){
        Random r = new Random();
        Scanner input = new Scanner(System.in);
        
        int secretNum = 1 + r.nextInt(10);
        int choice;
        
        System.out.println("This is a number guessing game!");
        System.out.print("I am thinking of a number form 1 to 10\n Your guess: ");
        
        choice = input.nextInt();
        
        if (choice == secretNum)
        {
            System.out.println("That's right! My secret number was " + secretNum + "!");
        }
        else
        {
            System.out.println("Sorry, but I was really thinking of 7" + secretNum + ".");
        }
        
}
}