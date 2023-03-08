package programs;

import java.util.Scanner;

public class primenumber 
{
	public static void main(String[] args) 
	{
		int count=0,i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		for(i=1 ; i<=num; i++)
		{
			if(num%i==0)
			{
				count++;
			}
			
		}
		if(count==2)
		{
			System.out.println("enter number is prime " );
		}
		else
		{
			System.out.println("Enter number is not prime");
		}
	}

}
