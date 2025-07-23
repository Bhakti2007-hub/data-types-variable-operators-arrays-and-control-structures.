import java.util.*;
public class Positive
{
	public static void main(String args[])
	{
		int pos;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		pos=sc.nextInt();
		if(pos>0)
		{
			System.out.printf(pos+ " is positive");
		}
		else
		{
			System.out.printf(pos+ " is negative");

		}
	}
}