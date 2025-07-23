import java.util.*;
public class Greater
{
	public static void main(String args[])
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number\n");
		a=sc.nextInt();
		System.out.println("Enter 2nd number\n");
		b=sc.nextInt();
		if(a>b)
		{
			System.out.printf(a+ "is greater than" +b);
		}
		else
		{
			System.out.printf(b+ "is greater than" +a);

		}

		
	}
}