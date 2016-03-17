/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2_10524836;

import java.util.Scanner;


public class CountingMachineRevisited {
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Count from: ");
        int count1 = input.nextInt();
        System.out.print("Count to: ");
        int count2 = input.nextInt();
        System.out.print("Count by: ");
        int count3 = input.nextInt();
        for(int i = count1; i <= count2 ; i = i + count3)
        {
            System.out.print( i + " ");
        }
               
    }
}
