
package assignment2_10524836;

import java.util.Scanner;

public class AddingValuesWithAForLoop {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Number: ");
        int number = input.nextInt();
        int  list[] = new int[number];
       
         int add = 0;
        for(int i =0; i < number ; i++)
        {
            
            list[i] = i +1 ;
            add = add + list[i]; 
            System.out.print(list[i] + " ");
            
        }
        System.out.println();
        System.out.println("the sum is: " + add);
        
    }
}
