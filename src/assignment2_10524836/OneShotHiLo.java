
package assignment2_10524836;

import java.util.Scanner;
import java.util.Random;

public class OneShotHiLo {
    public static void main(String[]args){
        Random x = new Random();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Thinking of a number between 1-100. try to guess it.");
        
        int number = 1 + x.nextInt(100);
        int choice = input.nextInt();
        
        if (choice > number )
        {
            System.out.println("Sorry, you are too high. I was thinking of " + number + ".");
        }
        else if (choice < number)
        {
            System.out.println("Sorry, you are too low. i was thinking of " + number +".");
        }
        else if (choice == number)
        {
            System.out.println("you guessed it! What are the odds?!?");
        }
        
    
        
        
        
    }
}
