import java.util.Scanner;


public class ErrorThrow {
	
public static void cach(int mark)
	{
		if(mark<60)
			throw new ArithmeticException("You are not permited");
		else
			System.out.println("You are permited");
	}
	public static void main(String[] args) {
		int mark;
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter mark:");
		mark=ob.nextInt();
		cach(mark);
		
}

}
