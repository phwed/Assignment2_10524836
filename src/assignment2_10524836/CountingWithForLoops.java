/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2_10524836;
import java.util.Scanner;
/**
 *
 * @author opos
 */
public class CountingWithForLoops {
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Type in a message, i'll display it five times ");
        System.out.println("Message: ");
        String message = input.nextLine();
        
        for(int n = 1 ; n <= 5; n++)
        {
            System.out.println(n + ". " + message);
        }
    }
}
