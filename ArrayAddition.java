import java.util.*;
public class ArrayAddition
{
	public static void main(String args[])
	{
		int size;
		System.out.println("Enter Size");
		Scanner s=new Scanner(System.in);
		size=s.nextInt();
		int a[]=new int[size];
		int i,sum=0;
		System.out.printf("Enter the Numbers");
		for(i=0;i<size;i++)
		{
			a[i]=s.nextInt();
			sum+=i;
		}
		System.out.printf("The sum is "+sum);
	}
}
