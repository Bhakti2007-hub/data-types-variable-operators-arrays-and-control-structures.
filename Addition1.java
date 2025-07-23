/*
 * File: ForLoop.java
 * Description:
 * This program takes 6 integer inputs from the user using a for loop
 * and stores them in an array. Then it prints all the entered numbers.
 * It demonstrates the use of for loop, arrays, and Scanner class in Java.
 */

import java.util.*;

public class ForLoop
{
	public static void main (String args[])
	{
		Scanner s = new Scanner(System.in);
		int[] numbers = new int[6];

		for(int i = 0; i <= 5; i++)
		{
			System.out.printf("Enter %d element: ", i);
			numbers[i] = s.nextInt();
		}

		System.out.println("Numbers are:");
		for(int i = 0; i <= 5; i++)
		{
			System.out.println(numbers[i]);
		}
	}
}
