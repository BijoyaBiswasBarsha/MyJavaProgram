import java.util.InputMismatchException;
import java.util.Scanner;


public class TryCatch {

	public static void main(String[] args) {
		
        int first,secound,div;
        boolean check=true;
        while(check)
        {
        try
        {
        	Scanner ob=new Scanner(System.in);
        	System.out.println("Enter two numbers:");
        	first=ob.nextInt();
        	secound=ob.nextInt();
        	System.out.println("The two numbers are:\n"+"First Number="+first+" & Secound Number="+secound);
        	div=first/secound;
        	System.out.println("The division of two numbers is:"+div);
        	check=false;
        }
        catch(InputMismatchException e)
        {
        	System.out.println("Input Mismatch\n Input again");
        }
        catch(ArithmeticException e)
        {
        	System.out.println("Arithmetic error\n Input again");
        }
	}

}
}
