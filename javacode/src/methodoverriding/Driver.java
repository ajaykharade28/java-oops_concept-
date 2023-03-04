package methodoverriding;

public class Driver 
{
	public static void main(String[] args)
	{
		
	parent p1=new parent();    //creating parent class object and called m1()method 
	p1.m1();                   //parent class m1 method will called..
	
	child ch1=new child();    //creating child class object and called m1()method 
	ch1.m1();                 //child class m1 method will called..
	
	parent p2=new child();//if method are overriden and we perform upcasting and we called a method then child class method will called
	p2.m1();
	}
}
