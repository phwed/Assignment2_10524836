
package assignment2_10524836;

import java.util.Scanner;

public class PinLockOut {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        
        int pin = 12345;
        int tries = 0;
        int max = 4;
        System.out.println("WELCOME TO THE BANK OF FRED!");
        System.out.print("ENTER YOUR PIN: ");
        int entry = input.nextInt();
        tries++;
        
        while (entry != pin && tries < max)
        {
            System.out.println("\nINCORRECT PIN. TRY ANGAIN");
            System.out.print("ENTER YOUR PIN: ");
            entry = input.nextInt();
            tries++;
        
        }
        if (entry == pin )
            System.out.println("PIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT");
        else if (tries >= max)
            System.out.println("\nYOU HAVE RUN OUT OF NUMBER OF TRIES");
    }
}
