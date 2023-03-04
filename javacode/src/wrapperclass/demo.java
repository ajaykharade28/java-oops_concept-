package wrapperclass;

public class demo 
{
 public static void main(String[] args) 
 {
	 byte b=10;
	 short s=20;
	 int i=30;
	 long l=40;                           
	 float f=50.50f;
	 double d=60.60;
	 char ch='A';
	 boolean bb1=true;
	 Byte obj1=Byte.valueOf(b);           //using value of
	 System.out.println(obj1);
	 
	 
	 //Integer obj2=Integer.parseInt(i);      //using parse
	// System.out.println(obj2); 
	 
	 
	 int a=10;               //Autoboxing
	 Integer obj=a;
	 System.out.println(obj);
	 
	 
	 Integer p=new Integer(10);  //unboxing
	 int j=p;
	 System.out.println(j);
	 
 }
}
