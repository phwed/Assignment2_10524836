
package assignment2_10524836;

import java.util.Random;

public class DiceDouble {
    public static void main(String[]args){
        Random x = new Random();
        
      int roll1 = 1 + x.nextInt(8);
      int roll2 = 1 + x.nextInt(8);
      
      System.out.println("HERE COMES THE DICE!");
      System.out.println("Roll #1: " + roll1);
      System.out.println("Roll #2: " + roll2);
      
      int total = roll1 + roll2;
      
      System.out.println("The total is " + total + "!");
    }
}
