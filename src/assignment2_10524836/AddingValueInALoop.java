
package assignment2_10524836;

import java.util.Scanner;

public class AddingValueInALoop {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("I will add up the numbers you give me.");
        int number = 1;
        while(number != 0)
        {
            System.out.println("Number: ");
            number = input.nextInt();
            System.out.println("The totla so far is " + (number+number));
         }
}
}