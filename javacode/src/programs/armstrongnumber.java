package programs;

import java.util.Scanner;

public class armstrongnumber 
{
	public static void main(String[] args) 
	{
		int rem;
		int sum=0;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		int c=sum;
		while(num>0) 
		{
			//153
			rem=num%10;  
			sum=(rem*rem*rem)+sum;
			num=num/10;
			
		}
				if(c==num)
				{
					System.out.println("Enter number is armstrong");
				}
					
				else
				{
					System.out.println("Enter number is not a armstrong");
		
				}
	}
}
