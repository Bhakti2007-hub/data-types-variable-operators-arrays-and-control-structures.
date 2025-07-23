/*
 * File: EvenOdd.java
 * Description:
 * This program takes an integer input from the user and checks
 * whether it is even or odd using the modulus operator (%).
 * It demonstrates conditional statements (if-else) and user input in Java.
 */

import java.util.*;
public class EvenOdd
{
	public static void main(String[] args)
	{
		int n;
		Scanner s=new Scanner (System.in);
		System.out.printf("Enter The number you want to check");
		n=s.nextInt();
		if(n%2==0)
		{
			System.out.println("The Number is Even");
		}
		else
		{
			System.out.println("The Number is Odd");	
		}
	}
}
