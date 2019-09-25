/*
 * Alex Willenborg
 * willenaj@mail.uc.edu
 * Assignment 04
 * 9/26/19
 * Pyramids with loops

*/
package main; 


public class Main {

	public static void main(String[] args) {
		//setting the amount of rows i want
		int rows = 5;
		//setting how many numbers i want per row
        int count = 1;
        //setting the actual number printed
        int number = 1;
       //stopping the loop if a is less than 0 and subtracting one every iteration
        for (int a = rows; a > 0;a--)
        {
            //Printing spaces at the beginning of each row
            for (int j = 1; j <= a;j++ )
            {
                System.out.print(" ");
            }
            //printing the numbers and the amount of numbers
           
            for (int j = 1; j <= count; j++)
            {
                System.out.print(number);            
            }
            System.out.println();
             //Incrementing the numbers per row and the actual number in the row
            count+=2;
            number++;
        }
    }
    
	
}
