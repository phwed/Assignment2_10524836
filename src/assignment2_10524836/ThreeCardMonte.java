package assignment2_10524836;

import java.util.Scanner;
import java.util.Random;

public class ThreeCardMonte {
    public static void main (String []args)
    {
        Scanner input = new Scanner(System.in);
        Random x = new Random();
        
        System.out.println("You are up to Fast Fredie's card table and plop down cash.");
        System.out.println("He glances at you of the corner of his eye and starts shuffling.");
        System.out.println("He lays done three cards.");
        
        System.out.println("which one is the ace?");
        System.out.println("##  ##  ##");
        System.out.println("##  ##  ##");
        System.out.println("1   2   3");
        
        int choice = input.nextInt();
        int ace = 1 + x.nextInt(3);
        
        if (choice != ace)
        {
            System.out.println("Ha! Fast Freddie wins again! The ace was number " + ace);
            System.out.println("AA");
            System.out.println("AA ");
            System.out.println(ace);
         }
        else if(choice == ace)
        {
             System.out.println("You nailed it! ast Freddie reluctantly hands over your winnings, scowling.");
             System.out.println("AA");
             System.out.println("AA ");
             System.out.println(ace);
        }
    }
}
