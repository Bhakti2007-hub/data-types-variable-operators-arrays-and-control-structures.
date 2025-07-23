/*
 * File: FibonacciSeries.java
 * Description:
 * This program generates and displays the Fibonacci series up to 'n' terms,
 * where 'n' is entered by the user. It uses only int data types and a for loop.
 * Demonstrates loop control, sequence logic, and user input in Java.
 */

import java.util.Scanner;

public class FibonacciSeries 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int first = 0, second = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++)
	{
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }

 
    }
}
