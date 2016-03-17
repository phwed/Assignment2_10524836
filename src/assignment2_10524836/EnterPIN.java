
package assignment2_10524836;

import java.util.Scanner;

public class EnterPIN {
    public static void main(String[]args){
        Scanner keyboard = new Scanner(System.in);
        int pin = 12345;
        
        System.out.println("WELCOME TO THE BANK OF FRED.");
        System.out.print("ENTER YOUR PIN: ");
        int entry = keyboard.nextInt();
        
        while (entry != pin)
        {
            System.out.println("\nINCORRECT PIN. TRY AGAIN.");
            System.out.println("ENTER YOUR PIN: ");
            entry = keyboard.nextInt();
        }
        
        System.out.println("\nPIN IS ACCEPTED. YOU CAN HAVE ACCESS TO YOUR ACCOUNT.");
        
    }   
    
}

/*
    1. they both test a condition and return true or false
    2. whiles the loop iterates a number of times the if statement doesnt
    3. because entry has already been declared
    4. it becomes an ifinite loop
    
*/