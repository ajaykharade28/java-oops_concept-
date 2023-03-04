package Interface;

public class Interfacedriver implements interface1,interface2

{

	@Override
	public void write() 
	{
		
		System.out.println("from write method of interfacedriver class");
	}
	public void read() 
	{
		
		System.out.println("from read method of interfacedriver class");
	}
	
}