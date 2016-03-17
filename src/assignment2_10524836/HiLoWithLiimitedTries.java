

package assignment2_10524836;

import java.util.Scanner;
import java.util.Random;

public class HiLoWithLiimitedTries{
    public static void main(String[]args){
        Random x = new Random();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Thinking of a number between 1-100. try to guess it.");
        int number = 1 + x.nextInt(100);
       
        int tries = 0;
        int max = 7;
        
        
        while(tries <= max) 
        {
            
            System.out.print("Guess #" + (tries+1) + ": ");
            int choice = input.nextInt();
            
            if (choice > number )
            {
                System.out.println("Sorry, you are too high");
            }
            else if (choice < number)
            {
                System.out.println("Sorry, you are too low");
            }
            
           
            
            if (choice == number )
            {
                System.out.println("you guessed it! What are the odds?!?");
            break;
            }
            tries++;
            
            if (tries == max)
            {
                System.out.println("\nSorry, didn't guess in 7 tries.The number is "+number+" You lost");
            }
        }
        
       
        
        
        
       
        
        
        
    }
}
