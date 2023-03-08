package programs;

public class evennumberinarray {

	public static void main(String[] args) 
	{
		int a[]= {2,5,8,9,6,1};
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("Even number" + a[i]);
			}
			if(a[i]%2==1)
			{
				System.out.println("odd number" + a[i]);
			}
		}

	}

}
