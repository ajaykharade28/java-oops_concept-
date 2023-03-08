package programs;

import java.util.Scanner;

public class palindrome
{

	public static void main(String[] args)
	{
		int n,rem,sum=0;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		int temp=num;
		while (num>0)
		{
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		if(temp==sum)
			System.out.println("palindrome");
		else 
		{
		System.out.println("not palindrome");	
		}
	}


}

