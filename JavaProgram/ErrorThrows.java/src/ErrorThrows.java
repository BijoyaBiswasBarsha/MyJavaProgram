import java.util.Scanner;


public class ErrorThrows {
	
public static void function(int input)throws ArithmeticException
{
	if(input<0)
	{
		throw new ArithmeticException("Number should be non-negative");
	
	}
	else
	{
		System.out.println("The number is:"+input);
	}
}
	public static void main(String[] args) {
		boolean m=true;
		while(m)
		{
		try
		{
			Scanner ob=new Scanner (System.in);
			System.out.println("Enter number:");
			int input=ob.nextInt();
			function(input);
			m=false;
		}
		catch(Exception e)
		{
			System.out.println("Invalid Input:"+e);
		}
		
		}
	}

}
