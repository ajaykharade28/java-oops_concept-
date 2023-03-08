package programs;

public class Accendingarray 
{
	public static void main(String[] args) {
		int a[]= {2,7,4,9,5,1,3};
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1; j<a.length-1;j++)
			{
				if(a[i]<a[j])
				{
					int temp;
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int k=0;k<a.length-1;k++)
		{
			System.out.print(a[k]);
		}
	}
	

}
