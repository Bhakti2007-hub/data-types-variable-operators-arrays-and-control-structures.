/*
 * File: ForLoop.java
 * Description:
 * This program takes 5 integer inputs from the user using a for loop,
 * stores them in an array, and then displays them.
 * Demonstrates array usage, loops, and user input handling in Java.
 */

import java.util.*;

public class ForLoop
{
	public static void main (String args[])
	{
		int[] numbers = new int[5];
		Scanner s = new Scanner(System.in);

		// Input 5 numbers
		for(int i = 0; i < 5; i++)
		{
			System.out.printf("Enter %d element: ", i + 1);
			numbers[i] = s.nextInt();
		}

		// Display the entered numbers
		System.out.println("The numbers are:");
		for(int i = 0; i < 5; i++)
		{
			System.out.println(numbers[i]);
		}
	}
}
