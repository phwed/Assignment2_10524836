package assignment2_10524836;

import java.util.Random;

public class FortuneCookies {
    public static void main(String[]args){
        Random x = new Random();
        int fortune = 1 + x.nextInt(6);
    
       System.out.print("Fortune cookie says: ");
        
       if (fortune == 1)
       {
            System.out.println("You will find happiness with new love.");
       }
       else if (fortune == 2) 
       {
            System.out.println("You will fall into a truck full of money");
            System.out.print(1 + x.nextInt(54) + " - ");
            System.out.print(1 + x.nextInt(54) + " - ");
            System.out.print(1 + x.nextInt(54) + " - ");
            System.out.print(1 + x.nextInt(54) + " - ");
            System.out.print(1 + x.nextInt(54) + " - ");
            System.out.println(1 + x.nextInt(54));
       }
       else if (fortune == 3) 
       {
           System.out.println("your mother will send you some money");
       }
       else if (fortune == 4)
       {
           System.out.println("You will fall in love with the girl you hate most");
           System.out.print(1 + x.nextInt(54) + " - ");
           System.out.print(1 + x.nextInt(54) + " - ");
           System.out.print(1 + x.nextInt(54) + " - ");
           System.out.print(1 + x.nextInt(54) + " - ");
           System.out.print(1 + x.nextInt(54) + " - ");
           System.out.println(1 + x.nextInt(54));
       }
       else if (fortune == 5)
       {
           System.out.println("Your lucky number are: ");
           System.out.print(1 + x.nextInt(54) + " - ");
           System.out.print(1 + x.nextInt(54) + " - ");
           System.out.print(1 + x.nextInt(54) + " - ");
           System.out.print(1 + x.nextInt(54) + " - ");
           System.out.print(1 + x.nextInt(54) + " - ");
           System.out.println(1 + x.nextInt(54));
       }
       else if (fortune == 6)
       {
           System.out.println("Pateince is in love with you");
       }
       
          
                   
       }
    }

 