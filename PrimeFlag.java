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
			flag = true; //
