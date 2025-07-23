//taking 5 numbers from user and display it
import java.util.*;
public class ForLoop
{
	public static void main (String args[])
	{
		int a;
		Scanner s=new Scanner(System.in);
		for(int i=0;i<=5;i=i+1)
		{
			System.out.printf("Enter %d element",i);
			a=s.nextInt();
			System.out.println("numbers are:"+a);

			
		}
		

	}
}