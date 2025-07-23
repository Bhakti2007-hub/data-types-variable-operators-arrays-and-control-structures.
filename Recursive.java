/*
 * File: Recursive.java
 * Description:
 * This program calculates the factorial of a number using recursion.
 * It demonstrates recursive function calls, stack behavior, and user input in Java.
 */
import java.util.*;
public class Recursive
{
	public int fact(int n)
	{
		int total=1;
		if(n>=1)
		{
			total=n*fact(n-1);//n=5 fact(n-1) means create a stack in this way fact(5-1)=fact=4 push 4in stack[4,3,2,1] like wise after end pop the numbers like 5*1=5 5*2=10 10*3=30 30*4=120 
		}
	return total;
	}
public static void main(String args[])
{
	int num;
	Scanner s=new Scanner(System.in);
	System.out.printf("Enter the number");
	num=s.nextInt();
	Recursive r=new Recursive();
	int value=r.fact(num);
	System.out.printf("Factorial is : "+ value);
 
	
	
}
}
