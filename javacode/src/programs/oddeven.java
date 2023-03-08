package programs;

import java.util.Scanner;

public class oddeven
{
public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		if(num%2==0)
		{
			System.out.println("enter number is even " + num);
			
		}
		else
		{
			System.out.println("enter number is odd " + num);
		}
	}
}
