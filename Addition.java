/*
 * File: Addition1.java
 * Description:
 * This program takes two integer inputs from the user using Scanner
 * and calculates their sum. It demonstrates the use of variables,
 * data types, input handling, and basic arithmetic operators in Java.
 */

import java.util.*;
public class Addition1
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter 1st Number");
		a=s.nextInt();
		System.out.println("Enter 2nd Number");
		b=s.nextInt();
		c=a+b;
		System.out.println("Addition is:"+c);

		
	}
}
