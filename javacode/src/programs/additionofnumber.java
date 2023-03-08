package programs;

import java.util.Scanner;

public class additionofnumber {

	public static void main(String[] args) 
	{
		int rem,sum=0;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		while(num>0) 
		{
			//153
			rem=num%10;  
			sum=sum+rem; 
			num=num/10;	 
		}
		System.out.println(sum);
	}

}
