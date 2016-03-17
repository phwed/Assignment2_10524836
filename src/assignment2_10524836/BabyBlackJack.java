
package assignment2_10524836;

import java.util.Random;

public class BabyBlackJack {
    public static void main(String[]args){
        Random x = new Random();
        
        int draw1 = 1 + x.nextInt(10);
        int draw2 = 1 + x.nextInt(10);
        int deal1 = 1 + x.nextInt(10);
        int deal2 = 1 + x.nextInt(10);
        
        int drawT = draw1 + draw2;
        int dealT =deal1 + deal2;
        
        System.out.println("Baby Blackjack!");
        System.out.println();
       
        System.out.println("You drew " + draw1 + " and " + draw2 +".");
        System.out.println("Your total is " + drawT);
        
         System.out.println();
        
        System.out.println("The Dealer has " + deal1 + " and " + deal2 +".");
        System.out.println("Dealer's total is " + dealT);
        
        if (drawT > dealT)
        {
            System.out.println("YOU WIN!");
        }
        else
        {
             System.out.println("YOU LOSE!");
        }
    }
}
