package programs;

public class duplicatenumberinarray 
{
	public static void main(String[] args) {
		int a[]= {2,5,8,5,4,2,5,4};
		for(int i=0;i<a.length-1;i++) 
		{
			for(int j=i+1;j<a.length;j++) 
			{
				if(a[i]==a[j])
				{
					a[j]=0;
				}
			}
		}
		for(int k=0;k<a.length;k++)
		{
			if(a[k]!=0)
			{
				
				System.out.print(a[k]);
				
			}
		}
	}
}
