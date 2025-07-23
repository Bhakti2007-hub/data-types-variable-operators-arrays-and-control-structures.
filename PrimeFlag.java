/*
 * File: PrimeFlag.java
 * Description:
 * This program checks whether the entered number is a prime number using a boolean flag.
 * It tests divisibility from 2 to n/2 and prints the result accordingly.
 * Demonstrates loops, conditionals, boolean logic, and user input in Java.
 */

import java.util.*;

public class PrimeFlag
{
	public static void main(String args[])
	{
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		a = sc.nextInt();

		boolean flag = false;

		if (a <= 1) {
			flag = true; // 0 and 1 are not prime
		}

		for (int i = 2; i <= a / 2; i++)
		{
			if (a % i == 0)
			{
				flag = true;
				break;
			}
		}

		if (!flag)
		{
			System.out.println(a + " is prime");
		}
		else
		{
			System.out.println(a + " is not prime");
		}
	}
}
