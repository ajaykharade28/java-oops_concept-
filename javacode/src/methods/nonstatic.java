package methods;

public class nonstatic 
{
   public void add()
   {
	   int c,a=10,b=20;
	   c=a+b;
	   System.out.println(c);
   }
   public static void main(String[] args) 
   {
	//add();
	//nonstatic.add();-----------we cannot access non-static method directly or using class name 
	//-----------------to access non-static method we have to create object.
	   nonstatic n1 =new nonstatic();
	   n1.add();
   }
}
