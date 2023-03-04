package methodoverloading;

public class overloading
{public static void main(String[] args) 
{
	   add();				
	   add(10,20);                 //method overloading same method name but Different parameter 
	   add("Ajay",10,20);          //method overloading
}
	public static void add() 
	{
	 int a=10,b=20,c;
	 c=a+b;
	 System.out.println(c);
	}
	public static void add(int a,int b)  //method overloading same method name but Different parameter 
	{
		int c;
		c=a+b;
		System.out.println(c);
	}
	public static void add(String s,int a,int b)  //method overloading same method name but Different parameter 
	{
		
		System.out.println(s);
		System.out.println(a);
		System.out.println(b);
	}
}


//method overloading same method name but Different parameter 