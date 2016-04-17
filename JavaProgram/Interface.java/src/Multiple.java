import java.util.Scanner;

interface Height
{
	public void height();
}
interface Base
{
	public void base();
}
class Area implements Height,Base
{
	double h,b,a;
	public void height()
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter the value of height:");
		h=ob.nextDouble();
	}
	public void base()
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter the value of base:");
		b=ob.nextDouble();
	}
	public void cal()
	{
		a=(h*b)/2;
		System.out.println("The value of height:"+h);
		System.out.println("The value of base:"+b);
		System.out.println("The value of area:"+a);
	}
}

public class Multiple {

	public static void main(String[] args) {
		Area obj=new Area();
		obj.height();
		obj.base();
		obj.cal();
		

	}

}
