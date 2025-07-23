import java.util.*;
public class Prime
{
	public static void main(String args[])
	{
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		a=sc.nextInt();
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				System.out.println(a+ " Not a Prime!");
				break;
			}
			else
			{
				System.out.println(a+ " is a Prime!");
				break;
			}
		}
		
	}
}