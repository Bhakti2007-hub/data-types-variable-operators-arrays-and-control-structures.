import java.util.*;
public class G3
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1st value");
		a=sc.nextInt();
		System.out.println("Enter 2nd value");
		b=sc.nextInt();
		System.out.println("Enter 3rd value");
		c=sc.nextInt();
		        if(a>b)
			{
				if(a>c)
				{
					System.out.println(a+ " is Greater");
		
				}
				else
				{
					System.out.println(c+ " is Greater");
	
				}
			}
			else
			{
				if(b>c)
				{
					System.out.println(b+ " is Greater");

				}
				else
				{
					System.out.println(c+ " is Greater");
		
				}
			}


	}
}