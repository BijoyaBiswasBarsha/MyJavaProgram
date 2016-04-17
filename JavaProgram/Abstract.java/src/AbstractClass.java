import java.util.Scanner;

abstract class Base
{
	abstract void series(int n);
}

class Derived extends Base
{
	int n,cal,i;
	public  void series(int n)
	{
		cal=(n*(n+1))/2;
		System.out.println("The summation of the series:");
		for(i=1;i<=n;i++)
		{
			System.out.print(i);
			if(i==n)
			{
				System.out.print("=");
				break;
			}
			System.out.print("+");
		}
		System.out.print(cal);
	}
}


public class AbstractClass {

public static void main(String[] args) {
	int n;
	Scanner ob=new Scanner(System.in);
	System.out.println("Enter a number to calculate series:");
	n=ob.nextInt();
	Derived obj=new Derived();
	obj.series(n);
		

	}

}
