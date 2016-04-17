import java.util.Scanner;


public class MatrixAddition {

	
	public static void main(String[] args) {
		int row,coloum;
		System.out.print("Enter Row & Coloum number of matrix A:");
		Scanner ob=new Scanner(System.in);
		row=ob.nextInt();
		coloum=ob.nextInt();
		int a[][]=new int[row][coloum];
		System.out.println("Enter elements of matrix A:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=ob.nextInt();
			}
		}
		
		System.out.print("Enter Row & Coloum number of matrix B:");
		Scanner obj=new Scanner(System.in);
		row=obj.nextInt();
		coloum=obj.nextInt();
		int b[][]=new int[row][coloum];
		System.out.println("Enter elements of matrix B:");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				b[i][j]=obj.nextInt();
			}
		}
		System.out.println("Elements of matrix A:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print("\t"+a[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("Elements of matrix B:");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.print("\t"+b[i][j]);
			}
			System.out.println();
		}
		
        int add[][]=new int [10][10];
        System.out.println("Addition of matrix A & B:");
        for(int i=0;i<a.length;i++)
        {
        	for(int j=0;j<b.length;j++)
        	{
        		add[i][j]=a[i][j]+b[i][j];
        		 System.out.print("\t"+add[i][j]);
        	}
        	System.out.println();
        }
	}

}
