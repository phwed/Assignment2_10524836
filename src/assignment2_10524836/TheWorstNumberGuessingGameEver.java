/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2_10524836;

/**
 *
 * @author opos
 */
import java.util.Random;
import java.util.Scanner;


public class TheWorstNumberGuessingGameEver {
    public  static void main(String[]args){
        Random r = new Random();
        Scanner input = new Scanner(System.in);
        
        int secretNum = 1 + r.nextInt(10);
        int choice;
        
        System.out.println("TEH WORST NUBMER GESSING GAME EVAR!!!!!!!1!");
        System.out.println("I, THINKING OF A NBR FROM 1-10. TRY 2 GESS!");
        
        choice = input.nextInt();
        
        if (choice == secretNum)
        {
            System.out.println("LOL! U GOT IT! I CANT BELIVE U GESSED IT WAS " + secretNum + "!");
        }
        else
        {
            System.out.println("WOOT! U SUXOR!! I PWN JOO!!! IT WAS " + secretNum);
        }
        
        
    }
}
