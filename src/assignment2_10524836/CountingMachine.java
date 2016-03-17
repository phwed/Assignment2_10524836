/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2_10524836;

import java.util.Scanner;


public class CountingMachine {
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Count to: ");
        int count = input.nextInt();
        
        for(int i = 0; i <= count ; i++)
        {
            System.out.print( i + " ");
        }
               
    }
}
