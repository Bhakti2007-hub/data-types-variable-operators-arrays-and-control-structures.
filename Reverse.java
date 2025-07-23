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