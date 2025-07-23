/*
 * File: SwappingWithout.java
 * Description:
 * This program swaps the values of two integers without using a third variable.
 * It uses arithmetic operations (addition and subtraction) to perform the swap.
 * Demonstrates variable manipulation and mathematical logic in Java.
 */

import java.util.*;
public class SwappingWithout
{
	public static void main (String args[])
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number");
		a=sc.nextInt();
		System.out.println("Enter 2nd number");
		b=sc.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("A is "+a);
		System.out.println("B is "+b);		
	}
}
