/*
 * File: Reverse.java
 * Description:
 * This program takes a number `n` from the user and prints numbers from 1 to n,
 * and then prints them in reverse from n to 1.
 * Demonstrates use of for loops and control structures in Java.
 */
import java.util.*;
public class Reverse
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter Number");
		int n=sc.nextInt();
		System.out.println("The Number is");

		for(int i=1;i<=n;i++)
		{
			System.out.println(+i);
		}

		
		System.out.println("AFter Reverse");
		for(int i=n;i>0;i--)
		{
			System.out.println(+i);
		}
	}
}
