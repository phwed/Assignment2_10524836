
package assignment2_10524836;

import java.util.Scanner;
import java.util.Random;

public class AgainWithTheNumberGuessing {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Random x = new Random();
        int tries = 0;
        int max = 5;
        
         
        int secretNum = 1 + x.nextInt(10);
        int choice;
        
        System.out.println("This is a number guessing game!");
        System.out.print("I am thinking of a number form 1 to 10, you have 5 guesses\n Your guess: ");
        
        choice = input.nextInt();
        tries++;
        
            
        do 
        {
            System.out.print("That's incorrect. guess again: ");
            choice = input.nextInt();
            tries++;
            if (choice == secretNum)
            System.out.println("That's right! You're a good guesser.\nIt only took you" + tries + " tries!");
            
            else if (tries >= max)
            System.out.println("\nYOU HAVE RUN OUT OF NUMBER OF TRIES");
        }
         while (choice != secretNum && tries < max);
       
        {
        }
        
        
        
    }
}
