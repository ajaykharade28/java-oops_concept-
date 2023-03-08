package programs;

import java.util.Scanner;

public class fibonacciseries
{
 public static void main(String[] args) 
 	{
	 	int a=0,b=1,c;
	 	Scanner s= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		for(int i=0;i<num;i++)
		{
			System.out.print(a);     //0 1 1 2 3 5
			c=a+b;
			a=b;
			b=c;
		}
 	}
}
