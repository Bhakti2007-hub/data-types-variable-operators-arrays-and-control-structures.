import java.util.*;
public class PrimeFlag
{
	public static void main(String args[])
	{
		int a;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Number");
		a=sc.nextInt();
		boolean flag=false;

		for(int i=2;i<=a/2;i++)
		{
			if(a%i==0)
			{
				flag = true;
				break;
			}
		}
		if(!flag)
		{
			System.out.println(a+ "is prime");
		}
		else
		{
			
			System.out.println(a+ "is not prime");

		}
		
	}
}