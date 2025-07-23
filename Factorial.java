/*
 * File: Factorial.java
 * Description:
 * This program calculates the factorial of a number using only int data type.
 * It uses a for loop and demonstrates input handling, loops, and arithmetic.
 */

import java.util.*;

public class Factorial
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number (0-12) to find its factorial: ");
		int n = s.nextInt();

		if (n < 0) {
			System.out.println("Factorial is not defined for negative numbers.");
		} else {
			int fact = 1;
			for (int i = 1; i <= n; i++) {
				fact *= i;
			}
			System.out.println("Factorial of " + n + " is: " + fact);
		}
	}
}
