package programs;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) 
	{
	int fact=1;
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the number");
	int num=s.nextInt();
	for(int i=1;i<=num;i++)
	{
		fact=fact*i;   //1=1*1
					   //1=1*2
					   //2=2*3
		               //6=6*4
		  	           //24=24*5
		 				//120
	}
	System.out.println(fact);
}
}