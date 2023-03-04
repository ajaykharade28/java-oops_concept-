package upcastingdowncasting;

public class driver 
{
	public static void main(String[] args) 
	{
		parent p1=new parent(); //creating object of parent class
		p1.m1();
		p1.m12();
		System.out.println("-------------------------------");
		
		child ch1=new child();  //creating object of child class
		ch1.m1();
		ch1.m12();
		System.out.println("-------------------------------");
		
		
		parent p2 = new child();   //performing upacasting
		p2.m12();                 //m1 method of parent class is called
		p2.m1();                 // if method is overriden and we perform upcating then child class method is getting called
		System.out.println("-------------------------------");
		
		
		child ch2=(child)p2;   //if we perform downcasting then we can able to called parent as well as child class method
		ch2.m1();
		ch1.m12();
		System.out.println("-------------------------------");
	}

}
