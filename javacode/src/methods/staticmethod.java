package methods;

public class staticmethod
{
	public static void main(String[] args) 
	{
	   add();				//direct call
	   add(10,20);
	   staticmethod.add();	//using class name
	   staticmethod s1=new staticmethod();
	   s1.add();			//by creating object
	}
	public static void add() 
	{
	 int a=10,b=20,c;
	 c=a+b;
	 System.out.println(c);
	}
	public static void add(int a,int b) 
	{
		int c;
		c=a+b;
		System.out.println(c);
	}
}
// we can call static method directly  or  // we can call static method by using class name or  by creating object