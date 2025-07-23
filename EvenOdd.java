import java.util.*;
public class EvenOdd
{
	public static void main(String[] args)
	{
		int n;
		Scanner s=new Scanner (System.in);
		System.out.printf("Enter The number you want to check");
		n=s.nextInt();
		if(n%2==0)
		{
			System.out.println("The Number is Even");
		}
		else
		{
			System.out.println("The Number is Odd");	
		}
	}
}